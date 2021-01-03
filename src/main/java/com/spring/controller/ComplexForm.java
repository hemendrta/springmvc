package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.model.Candidate;

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
		System.out.println(candidate.getCandidateDob().getYear()-2);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("success");
		return modelAndView;

	}

}
