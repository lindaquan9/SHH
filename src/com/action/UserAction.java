package com.action;

import org.apache.struts2.dispatcher.SessionMap;

public class UserAction extends BaseAction{
	
	private String userName;
	
	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String login() {
		
		this.session.put("userName", userName);
		
		Integer count = (Integer) this.application.get("count");
		if(count == null){
			count = 0;
		}
		
		count++;
		
		this.application.put("count", count);
		
		return "login-success";
		
	}
	
	
	public String logout() {
		
		((SessionMap)this.session).invalidate();
		
		Integer count = (Integer) this.application.get("count");
		if(count == null){
			count = 0;
		}
		
		if(count > 0){
			count--;
		}
		
		this.application.put("count", count);
		
		return "logout-success";
		
	}

}
