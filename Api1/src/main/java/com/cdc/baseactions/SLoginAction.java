package com.cdc.baseactions;

import com.cdc.bean.User;
/**表单标签驱动**/
public class SLoginAction extends BaseAction {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private User us;
	
	public User getUs() {
		return us;
	}

	public void setUs(User us) {
		this.us = us;
	}

	@Override
	public String execute() throws Exception {
		System.out.println("标签实现");
		System.out.println(us.getUsername()+us.getPassword());
		return SUCCESS;
	}

}
