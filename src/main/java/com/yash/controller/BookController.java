package com.yash.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class BookController {

	@RequestMapping("/index")
	public String showHome(Model model) {
			
		return "index";
	}
	
	
	
	@RequestMapping(value="/adminHome", method=RequestMethod.GET)
	public String showAdminHome(Model model) {
		
			
		return "adminHome";
		
	}
	@RequestMapping(value="/librarianHome", method=RequestMethod.GET)
	
	public String showLibrarianHome(Model model) {
		
		
		return "librarianHome";
	
	}
	
	
	@RequestMapping(value="/bookNewAdd", method=RequestMethod.GET)
	public String addNewBook() {
		
		
		return "bookNewAdd";
		
	}
	
	
	@RequestMapping(value="/bookIssue", method=RequestMethod.GET)
	public String bookIssue() {
		
		
		return "bookIssue";
		
	}
	
	@RequestMapping(value="/bookReturn", method=RequestMethod.GET)
	public String bookReturn() {
		
		
		return "bookReturn";
		
	}
	
	@RequestMapping(value="/bookSearch", method=RequestMethod.GET)
	public String bookSearch() {
		
		
		return "bookSearch";
		
	}
	
	
	@RequestMapping(value="/booksIssueList", method=RequestMethod.GET)
	public String bookIssueList() {
				
		return "booksIssueList";
		
	}
	
	@RequestMapping(value="/booksStockList", method=RequestMethod.GET)
	public String bookStockList() {
		
		
		return "booksStockList";
		
	}

	
}

