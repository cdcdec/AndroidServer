package com.cdc.api1;


import java.io.PrintWriter;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.cdc.bean.Header;
import com.cdc.bean.SimpleBack;
import com.cdc.bean.User;
import com.cdc.util.HeardUtil;
import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport;

/**
 * 访问:http://192.168.0.164:8080/api/simple,返回:{"username":"aaron",
 * "password":"aaronno"}
 * 访问:http://192.168.0.164:8080/api/simple?p1=eee&p2
 * =wwj,返回:{"username":"eee","password":"wwj"}
 * 
 * @author cdc
 *
 */
public class MobileDataAction extends ActionSupport {

	/**
	 * 
	 */
	HttpServletRequest request;
	HttpServletResponse response;
	ServletContext con;
	private static final long serialVersionUID = -8568572282738542059L;

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		init();

		Header header=new HeardUtil().createHeader(request);

		String param1 = request.getParameter("p1");
		String param2 = request.getParameter("p2");
		User user = new User();
		SimpleBack simpleBack=new SimpleBack();
		simpleBack.setHeader(header);
		if (param1 == null || param2 == null) {
			user.setUsername("aaron");
			user.setPassword("aaronno");
			user.setUrl("https://cdcdec.github.io/images/%E5%A4%B4%E5%83%8F%E5%A4%A7%E7%99%BD_300.jpg");
			Gson gson = new Gson();
			PrintWriter p = response.getWriter();
			simpleBack.setUser(user);
			p.print(gson.toJson(simpleBack));
		} else {
			user.setUsername(param1);
			user.setPassword(param2);
			user.setUrl("https://cdcdec.github.io/images/%E5%A4%B4%E5%83%8F%E5%A4%A7%E7%99%BD_300.jpg");
			Gson gson = new Gson();
			PrintWriter p = response.getWriter();
			p.print(gson.toJson(user));
		}
		return null;
	}

	private void init() {
		request = ServletActionContext.getRequest();
		response = ServletActionContext.getResponse();
		con = ServletActionContext.getServletContext();
		response.setCharacterEncoding("UTF-8");
	}

}
