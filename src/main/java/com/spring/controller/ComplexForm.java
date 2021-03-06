package com.spring.controller;

import java.io.FileOutputStream;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
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
//
//	To handle
//	the error we use BindingResult interface which has a method by the name hasErrors which checks for the error 
//	which we have and if in case we have error the same page is returned which is demonstrated in the code
//	mentioned below.
//	
//	If we want to display the error on the page we use the mentioned taglib:
//		
//		<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
//	we use the mentioned tag in jsp page to display the error:
// 	<form:errors path="person.*"/>

	@RequestMapping("/getSecondForm")

	public ModelAndView getSecondForm() {

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("complexForm2");
		return modelAndView;

	}

	@RequestMapping(path = "/handleComplexForm2", method = RequestMethod.POST)
	public ModelAndView handleComplexForm2(@ModelAttribute("person") Person person, BindingResult bindingResult,
			HttpSession session) {
		ModelAndView modelAndView = new ModelAndView();
		if (bindingResult.hasErrors()) {
			modelAndView.setViewName("complexForm2");
		} else {
			System.out.println("Control reached here!!!!\n" + person);

			modelAndView.setViewName("success");

		}

		return modelAndView;
	}

	/* file upload example */
	@RequestMapping("/fileUpload")
	public ModelAndView fileUpload() {

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("fileform");
		return modelAndView;

	}

	/* handling file upload */
	@RequestMapping(path = "/fileUploadHandler", method = RequestMethod.POST)
	public ModelAndView fileUploadHandler(@RequestParam("fileUpload") CommonsMultipartFile multipartFile,
			HttpSession httpSession) {
		ModelAndView modelAndView = new ModelAndView();
		System.out.println(multipartFile.getOriginalFilename());
		System.out.println(multipartFile.getContentType() + "\n" + multipartFile.getSize());

		// getting the file in the bytes format.
		byte[] data = multipartFile.getBytes();

		// specifying the path where we want to save the file which we have uploaded. We
		// can change the path as per
		// our requirement.
		String path = httpSession.getServletContext().getRealPath("/") + multipartFile.getOriginalFilename();

		// writing the file
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(path);
			fileOutputStream.write(data);

			System.out.println(path);

			modelAndView.setViewName("success");
		}

		catch (Exception e) {

			System.out.println("error uploading!!");
			modelAndView.setViewName("fileform");
		}
		return modelAndView;
	}

	/*
	 * Error handling in spring example. We can handle the error by using the
	 * tag @ExceptionHandler in this we can specify for which we are sending the
	 * control over here on this method/handler.
	 */

	/*
	 * lets create a mapping to show a demo test page, this will show the test page
	 * if everything is fine that means if we have no error.
	 * 
	 * Now if we have any error in this then we can divert the flow of the
	 * application to other page.
	 */

	@RequestMapping("/getTestPage")
	public ModelAndView getTestPage() {

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("test");
		String name = null;
		name.length();
		return modelAndView;

	}

	/*
	 * In the below we have handled the exception of all types so if there is an
	 * exception in the above then below mentioned code will run.
	 * 
	 * We can send the status code as well for the error which is send by the means
	 * of @responsestatus
	 */

	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler({ Exception.class })
	public ModelAndView getTestPageErrorHandler() {

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("search");
		return modelAndView;

	}

}
