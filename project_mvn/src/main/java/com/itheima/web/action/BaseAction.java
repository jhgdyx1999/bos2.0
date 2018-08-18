package com.itheima.web.action;

import java.util.Map;
import org.apache.struts2.interceptor.ApplicationAware;
import org.apache.struts2.interceptor.RequestAware;
import org.apache.struts2.interceptor.SessionAware;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author Jack
 * @datetime 2018年8月13日 下午4:47:45
 * 
 */
public class BaseAction extends ActionSupport implements RequestAware, SessionAware, ApplicationAware, ApplicationContextAware {
	
	private static final long serialVersionUID = -1707348353592946096L;
	
	protected Map<String, Object> applicationMap;
	protected Map<String, Object> sessionMap;
	protected Map<String, Object> requestMap;
	protected ApplicationContext applicationContext;
	
	@Override
	public void setApplication(Map<String, Object> application) {
		this.applicationMap = application;
	}
	
	@Override
	public void setSession(Map<String, Object> session) {
		this.sessionMap = session;
	}
	
	@Override
	public void setRequest(Map<String, Object> request) {
		this.requestMap = request;
	}
	
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
	
}

