package com.cdc.getwebsourceactions;

import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import org.apache.struts2.StrutsStatics;
import org.apache.struts2.interceptor.RequestAware;
import com.cdc.baseactions.BaseAction;
/**Struts2获取网络资源的第二种方式**/
public class SecondMethodAction extends BaseAction implements RequestAware{

	private static final long serialVersionUID = 769916037668418388L;
	
	private ServletRequest request;
	private ServletResponse response;
	private ServletContext con;
	
	
	@Override
	public String execute() throws Exception {
		String username = request.getParameter("username");
		String passwd = request.getParameter("password");
		System.out.println(username+","+passwd);
		return SUCCESS;
	}


	@Override
	public void setRequest(Map<String, Object> arg0) {
		// TODO Auto-generated method stub
		request = (ServletRequest)arg0.get(StrutsStatics.HTTP_REQUEST);
		response = (ServletResponse)arg0.get(StrutsStatics.HTTP_RESPONSE);
		con = (ServletContext)arg0.get(StrutsStatics.SERVLET_CONTEXT);
	}
	
	

}
