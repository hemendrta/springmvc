package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.model.Employee;
import com.spring.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(path = "addemployee", method = RequestMethod.GET)
	public String getEmployee() {

		return "addemployee";

	}

	/*
	 * modelattribute directly maps the form data field to the fields which we have
	 * with the bean class.
	 * 
	 * this does 2 works first it maps the data with the fields in the model class
	 * or bean class and sets the model so that the same could be get in the view.
	 * 
	 * the condition is that the variable names which we have in the class must be
	 * same as that of the form fields.
	 * 
	 */
	@RequestMapping(path = "registeremployee", method = RequestMethod.POST)
	public String addEmployee(@ModelAttribute Employee employee, Model model) {

		System.out.println(employee);

		//calling service for insertion of data to the database.
		Integer employeeId = employeeService.saveEmployee(employee);

		System.out.println(employeeId);
		
		return "success";

	}

}
