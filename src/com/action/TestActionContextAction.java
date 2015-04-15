package com.action;

import java.util.Map;

import org.apache.catalina.Session;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.SessionMap;

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
		sessionMap.put("sessionKey", "sessionValue");
		//设置session失效
//		if(sessionMap instanceof SessionMap){
//			SessionMap sm = (SessionMap) sessionMap;
//			sm.invalidate();
//			System.out.println("Session 失效了");
//		}
		
		//3.request
		Map<String, Object> requestMap = (Map<String, Object>) actionContext.get("request");
		requestMap.put("requestKey", "requestValue");
		
		//4.获取请求参数对应的Map，并获取指定的参数值
		//paramters只能读，不能写
		Map<String, Object> parameters = actionContext.getParameters();
		System.out.println(((String[])parameters.get("name"))[0]);
//		ServletActionContext servletActionContext = (ServletActionContext) actionContext.getContext();
//		Map<String, String[]> parametersString = servletActionContext.getRequest().getParameterMap();
		
		return "success";
		
	}

}
