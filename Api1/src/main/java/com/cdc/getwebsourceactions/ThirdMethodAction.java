package com.cdc.getwebsourceactions;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.struts2.ServletActionContext;

import com.cdc.baseactions.BaseAction;
import com.opensymphony.xwork2.ActionContext;
/**Struts2获取网络资源的第三种方式***/
public class ThirdMethodAction extends BaseAction {
	private static final long serialVersionUID = 4808882678269713443L;
	
	@Override
	public String execute() throws Exception {
		
		ActionContext ac = ActionContext.getContext();
		
		ServletRequest request = (ServletRequest)ac.get(ServletActionContext.HTTP_REQUEST);
		ServletResponse response = (ServletResponse)ac.get(ServletActionContext.HTTP_RESPONSE);
		ServletContext con = (ServletContext)ac.get(ServletActionContext.SERVLET_CONTEXT);
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String serverName = request.getServerName();
		System.out.println("用户名="+username);
		System.out.println("密码="+password);
		System.out.println("serverName="+serverName);
		
		return SUCCESS;
	}
	

}
