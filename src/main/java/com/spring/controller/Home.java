package com.spring.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring.model.Student;

@Controller
public class Home {

	/* Usage of Model for sending the data or information. */

	@RequestMapping("/home")
	public String homePage(Model model) {

		/* declaring the object */
		Student student = new Student(101, "Hemendra");

		/* setting the data or the model which needs to be transported */
		model.addAttribute("student", student);

		List<Student> students = new ArrayList<Student>();
		students.addAll(Arrays.asList(new Student(102, "Hemendra Singh Chouhan"),
				new Student(103, "Sunny Singh Chouhan"), new Student(104, "Aditi Singh Chouhan")));

		/* sending the list in model */
		model.addAttribute("students", students);

		return "index";

	}

	/* Usage of ModelAndView for sending the information. */

	@RequestMapping("/about")
	public ModelAndView getAbout() {

		/* Initializing the objects */

		Student student = new Student(101, "Hemendra Singh Chouhan");
		Student student2 = new Student(102, "Subhash Singh Chouhan");
		Student student3 = new Student(103, "Nisha Singh Chouhan");
		Student student4 = new Student(104, "Aditi Singh Chouhan");

		List<Student> students = new ArrayList<Student>();
		students.addAll(Arrays.asList(student, student2, student3, student4));

		/* Declaring the modelandview */

		ModelAndView modelAndView = new ModelAndView();

		/* Adding the objects or model */

		modelAndView.addObject("primaryStudent", student2);

		/* setting list in modelandview object */
		modelAndView.addObject("students", students);

		/* setting the view which needs to be rendered */
		modelAndView.setViewName("about");

		/* setting the status code which we want to send as response */
		modelAndView.setStatus(HttpStatus.CREATED);
		return modelAndView;
	}

}
