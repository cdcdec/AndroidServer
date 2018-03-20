package com.cdc.getwebsourceactions;

import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.struts2.ServletActionContext;

import com.cdc.baseactions.BaseAction;
import com.cdc.bean.User;
import com.google.gson.Gson;


/**Struts2获取网络资源的第四种方式**/
public class FourthMethodAction extends BaseAction {
	private static final long serialVersionUID = 4808882678269713443L;
	
	@Override
	public String execute() throws Exception {
		
		ServletRequest request = ServletActionContext.getRequest();
		ServletResponse response = ServletActionContext.getResponse();
		ServletContext con = ServletActionContext.getServletContext();
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String serverName = request.getServerName();
		System.out.println("用户名="+username);
		System.out.println("密码="+password);
		System.out.println("serverName="+serverName);
		
		PrintWriter prin=response.getWriter();
		User user=new User();
		user.setUsername("name");
		user.setPassword("pwd");
		
		Gson gson=new Gson();
	
		
		
		prin.write(gson.toJson(user));
		
		prin.close();
		
		
		
		return SUCCESS;
	}
	

}
