package com.spring.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

//We can either extend HandlerInterceptorAdapter or implement HandlerInterceptor to create our interceptor
//There are 3 methods which we get:
//	
//	preHanlde
//	postHandle
//	afterCompletion
//
//	Interceptor can act before the controller after controller before view response and after that as well and the
//	methods mentioned above are used appropriately to use interceptor.

//	we need to do the configuration in xml that for which controller the interceptor needs to work.

public class InterceptorDemo extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("Control in the pre-handler!!!");

		if (request.getParameter("employeeName").length() < 5) {

			response.setContentType("text/html");
			response.getWriter().println("Name less than the required size");
			return false;

		} else {

			return true;
		}
	}

}
