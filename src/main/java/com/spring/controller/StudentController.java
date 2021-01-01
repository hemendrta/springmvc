package com.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.cglib.core.EmitUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {

	@RequestMapping(path = "/contact", method = RequestMethod.GET)
	public String getContact() {

		return "contact";
	}

//	Conventional approach to get data from the form:
//	@RequestMapping(path = "/register", method = RequestMethod.POST)
//	public String register(HttpServletRequest request) {
//		
//		String email = request.getParameter("email");
//		System.out.println(email);
//		return null;
//
//	}
	
//	new approach for fetching the data from a form using @requestparam
	@RequestMapping(path = "/register", method = RequestMethod.POST)
	public String register(@RequestParam("email") final String userEmail,
			@RequestParam("username") final String username, @RequestParam("password") final String password, Model model) {
	
		/* setting values to the model object to fetch the same on the view */
		
		model.addAttribute("username", username);
		model.addAttribute("email", userEmail);
		
		System.out.println(userEmail + "\n" + username + "\n" + password);
		return "success";

	}

}
