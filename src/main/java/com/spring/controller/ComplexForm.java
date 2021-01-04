package com.spring.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.model.Address;
import com.spring.model.Candidate;
import com.spring.model.Person;

@Controller
public class ComplexForm {

	@RequestMapping("/complexForm")
	public ModelAndView getComplexForm() {

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("complexForm");

		return modelAndView;

	}

	@RequestMapping(path = "/complexFormController", method = RequestMethod.POST)
	public ModelAndView handleComplexForm(@ModelAttribute() Candidate candidate) {
		System.out.println("Reached here control");
		System.out.println(candidate.getCandidateDob().getYear() - 2);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("success");
		return modelAndView;

	}
	
//	In this example we have tried to cover a case in which we have class by the name person in which we have a field
//	by the name address which itself is a class.
//	
//	Structure of both are as mentioned:
//		
//		public class Person {
//
//		private Long contact;
//		private String name;
//		private String email;
//		private List<String> languages;
//		private Address address;
//		
//	}
//	
//	public class Address {
//
//		private String city;
//		private String street;
//		private Long zip;
//		
//	}
//	
//	to handle the above mentioned scenario in the form is what we have demonstrated over here in the example.
//	
//	first point:
//		
//		we have to put the name tag such that it follows the same names as that of the class which is in mandatory
//		whenever we are using the form handling by the @modelattribute annotation.
//		
//	Second point:
//		
//		we have to put the name tag with dot operator so that it follows the pattern of class format for the above
//		example it is like:
//			
//			person.address.city
//			person.address.street
//			person.address.zip
//			
//			these are the format which we require in the form in the name tag and while fetching the data as well on
//			jsp page same format should have to be followed.

	@RequestMapping("/getSecondForm")
	public ModelAndView getSecondForm() {

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("complexForm2");
		return modelAndView;

	}

	@RequestMapping(path = "/handleComplexForm2", method = RequestMethod.POST)
	public ModelAndView handleComplexForm2(@ModelAttribute("person") Person person) {
		System.out.println("Control reached here!!!!\n" + person);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("success");
		return modelAndView;

	}

}
