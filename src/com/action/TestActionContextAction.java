package com.action;

import java.util.Map;

import org.apache.catalina.Session;

import com.opensymphony.xwork2.ActionContext;

public class TestActionContextAction {
	
	public String execute() {
		
		//0.获取ActionContext对象，是action的上下文对象，可以从中获取Action需要的一切信息
		ActionContext actionContext = ActionContext.getContext();
		
		//1.获取application对应的Map,并向其中添加一个属性
		Map<String, Object> applicationMap = actionContext.getApplication();
		//设置属性
		applicationMap.put("applicationKey", "applicationValue");
		//获取属性
		Object dateObject = applicationMap.get("date");
		System.out.println("Date:" + dateObject );
		
		//2.session
		Map<String, Object> sessionMap = actionContext.getSession();
		
		//3.request
		
		//4.获取请求参数对应的Map，并获取指定的参数值
		
		return "success";
		
	}

}
