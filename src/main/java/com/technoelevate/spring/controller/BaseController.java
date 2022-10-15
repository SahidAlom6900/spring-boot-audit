package com.technoelevate.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;


public class BaseController {
	
	@Autowired
	private HttpServletRequest request;
	
	public String getDeviceId() {
		return request.getHeader("deviceId");
	}
}