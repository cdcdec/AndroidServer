package com.cdc.getwebsourceactions;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.util.ServletContextAware;

import com.cdc.baseactions.BaseAction;
/**Struts2获取网络资源的第一种方式**/
public class FirstMethodAction extends BaseAction implements ServletRequestAware,ServletResponseAware,ServletContextAware{

	private static final long serialVersionUID = 769916037668418388L;
	
	private ServletRequest request;
	private ServletResponse response;
	private ServletContext con;
	@Override
	public void setServletContext(ServletContext arg0) {
		// TODO Auto-generated method stub
		con=arg0;
	}

	@Override
	public void setServletResponse(HttpServletResponse arg0) {
		// TODO Auto-generated method stub
		response=arg0;
	}

	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		request=arg0;
	}
	
	@Override
	public String execute() throws Exception {
		String username = request.getParameter("username");
		String passwd = request.getParameter("password");
		System.out.println(username+","+passwd);
		
		Headers.getHaeders(request);
		return SUCCESS;
	}
	
	

}
