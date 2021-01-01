package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SpringRedirect {

	/*
	 * the flow is something like the mentioned:
	 * 
	 * we are calling the url for getting page1 in which we are redirecting it to
	 * the page 2 when the control goes to page 2 from there we are redirecting the
	 * same to addEmployee page.
	 * 
	 */
	
	@RequestMapping(path = "getpage1", method = RequestMethod.GET)
	public String getPage1() {

		/*
		 * to redirect the page we have 2 methods in spring:
		 * 
		 * 1. redirect prefix 2. redirectview
		 * 
		 * In this example mentioned below we have used redirect prefix method, this
		 * will redirect the page to the url given.
		 * 
		 */
		return "redirect:getpage2";

	}

	@RequestMapping(path = "getpage2", method = RequestMethod.GET)
	public RedirectView getPage2() {

		RedirectView redirectView = new RedirectView();
		redirectView.setUrl("addemployee");

		return redirectView;

	}

}
