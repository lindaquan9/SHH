package com.action;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.ParameterAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

public class TestAwareAcion implements ApplicationAware, SessionAware, RequestAware, ParameterAware{
	
	private Map<String, Object> application;
	private Map<String, String[]> parameters;
	private Map<String, Object> session;
	private Map<String, Object> request;
	
	public String execute() {
		
		//设置属性
		application.put("applicationKey2", "applicationValue2");
		parameters.put("parametersKey2",new String[]{"parametersValue2"});
		session.put("sessionKey2", "sessionValue2");
		request.put("requestKey2", "requestValue2");
		//获取属性
		Object dateObject = application.get("date");
		System.out.println("Date:" + dateObject );
		
		return "success";
	}

	@Override
	public void setParameters(Map<String, String[]> arg0) {
		this.parameters = arg0;
		
	}

	@Override
	public void setRequest(Map<String, Object> arg0) {
		this.request = arg0;
		
	}

	@Override
	public void setSession(Map<String, Object> arg0) {
		this.session = arg0;
		
	}

	@Override
	public void setApplication(Map<String, Object> arg0) {
		this.application = arg0;
	}

}
