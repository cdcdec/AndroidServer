package com.cdc.api1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.servlet.ServletInputStream;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.cdc.bean.Data;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class MobileReceiveJson extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3497938221813194877L;
	/**
	 * 接收json数据,并且以传统的方式返回json字符串
	 * @throws Exception
	 */
	public void json() throws Exception {
		// TODO Auto-generated method stub

		ActionContext ac = ActionContext.getContext();
		
		ServletResponse response=ServletActionContext.getResponse();  
        //以下代码从JSON.java中拷过来的  
        response.setContentType("text/html");  
        PrintWriter out=response.getWriter(); 

		ServletRequest request = (ServletRequest) ac
				.get(ServletActionContext.HTTP_REQUEST);
		BufferedReader br = new BufferedReader(new InputStreamReader((ServletInputStream) request.getInputStream(), "utf-8"));
		StringBuffer sb = new StringBuffer("");
		String temp;
		while ((temp = br.readLine()) != null) {
		                sb.append(temp);
		}
		br.close();
		String params = sb.toString();
		System.out.println("params="+params);
		//String jsonString="{\"user\":{\"id\":\"123\",\"name\":\"JSONActionGeneral\",\"say\":\"Hello , i am a action to print a json!\",\"password\":\"JSON\"},\"success\":true}";
		out.println(params);  
        out.flush();  
        out.close();  
	}
	
//	public String getJSONResult(){
//		data=new Data("123","hjjk","jsjko","skko");
//		
//		return SUCCESS;
//		
//	}
	
	//解析请求的Json数据
    private String getRequestPostData(HttpServletRequest request) throws IOException {
        int contentLength = request.getContentLength();
        if(contentLength<0){
            return null;
        }
        byte buffer[] = new byte[contentLength];
        for (int i = 0; i < contentLength;) {
            int len = request.getInputStream().read(buffer, i, contentLength - i);
            if (len == -1) {
                break;
            }
            i += len;
        }
        return new String(buffer, "utf-8");
    }
	
	

	
	private Data  data;
	public Data getData() {
		return data;
	}
	
	
	public void setData(Data data) {
		this.data = data;
	}


	public String getJSONResult(){
		//data=new Data("123","hjjk","jsjko","skko");
		try {
			json();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SUCCESS;
		
	}
	

	public String etJSONResult2(){
		data=new Data("123","hjjk","jsjko","skko");
		
		return "success00";
		
	}


	
	
	
	
	
	

}
