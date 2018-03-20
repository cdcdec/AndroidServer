package com.cdc.baseactions;

import com.cdc.bean.Data;

/**表单属性驱动***/
public class LoginAction extends BaseAction{
	private static final long serialVersionUID = 1L;
	private String username;
	private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String execute() throws Exception {
		String username=getUsername();
		String password=getPassword();
		if (username.equals("admin") && password.equals("admin")) {
			return SUCCESS;
		} else if(username.equals("admin")&& password.equals("123")){
			data=new Data(username,password,"1","skko");
			return "ok";
		}else {
			return ERROR;
		}
	}
	
	private Data  data;
	public Data getData() {
		return data;
	}
	
	

}
