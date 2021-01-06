package com.spring.util;
/*
By this we will generalize the exceptions for the entire project which would not be limited to a specific
controller.]

so whenever there will be an exception of the handled type in the entire project it will handled by the below code.
@controlleradvice annotation helps in identifying that this is basically for handling the mentioned code. 

We can handle as many types of exception as we want, refer the code below.
*/

import java.io.FileNotFoundException;

import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionHandlersCustom {

	@ExceptionHandler(value = NullPointerException.class)
	public ModelAndView handleNullPointerException() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("addemployee");
		return modelAndView;
	}

	@ExceptionHandler(value = FileNotFoundException.class)
	public ModelAndView handleFileNotFoundExceptionException() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("addemployee");
		return modelAndView;
	}

	@ExceptionHandler(value = NumberFormatException.class)
	public ModelAndView handleNumberFormatExceptionException() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("addemployee");
		return modelAndView;
	}

	@ExceptionHandler(value = IllegalStateException.class)
	public ModelAndView handleIllegalStateExceptionException() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("addemployee");
		return modelAndView;
	}

	@ExceptionHandler(value = MissingServletRequestParameterException.class)
	public ModelAndView handleMissingServletRequestParameterExceptionException() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("addemployee");
		return modelAndView;
	}

}
