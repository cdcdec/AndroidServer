package com.cdc.baseactions;

import com.cdc.bean.User;
import com.opensymphony.xwork2.ModelDriven;
/**表单模型驱动**/
public class MLoginAction extends BaseAction implements ModelDriven<User>{
	private static final long serialVersionUID = 1L;
	
	private User us=new User();
	@Override
	public String execute(){
		System.out.println(us.getUsername());
		System.out.println(us.getPassword());
		return SUCCESS;
		
	}

	@Override
	public User getModel() {
		// TODO Auto-generated method stub
		return us;
	}
	

}
