package com.cdc.bean;

public class User {
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
	

}

/**
 * {
    data : { // 请求数据，对象或数组均可
        user_id: 123,
        user_name: "tutuge",
        user_avatar_url: "http://tutuge.me/avatar.jpg"
        ...
    },
    msg : "done", // 请求状态描述，调试用
    code: 1001, // 业务自定义状态码
    extra : { // 全局附加数据，字段、内容不定
        type: 1,
        desc: "签到成功！"
    }
}
 * 
 * 
 * 


 http://kingxss.iteye.com/blog/1622455
 */
