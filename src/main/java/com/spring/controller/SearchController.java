package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

//	handler to show the search page
	@RequestMapping("/search")
	public String getSearch() {
		String name = null;
		name.charAt(2);
		return "search";

	}

//	handler to pass the search string which we want to search in the google.
	@RequestMapping("/searchQuery")
	public RedirectView handleSearch(@RequestParam("query") String query) {

//		concatenating the value which we receive from the form with the query which we want to pass.
		String searchQuery = "https://www.google.com/search?q=" + query;

		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(searchQuery);
		
		return redirectView;

	}

}
