package com.action;

import java.util.Map;

import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.ParameterAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;

public class BaseAction implements ApplicationAware, SessionAware, RequestAware, ParameterAware{
	
	public Map<String, Object> application;
	public Map<String, String[]> parameters;
	public Map<String, Object> session;
	public Map<String, Object> request;

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
