package com.yash.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.yash.model.User;
import com.yash.service.UserService;




@Controller
public class MemberController {

	@Autowired
	UserService userService;
	  
	
	@RequestMapping("/addNewUser")
	public String addNewUser(Model model) {
		
		return "addNewUser";
	}
	
	 @RequestMapping(value = "/addNewUserProcess", method = RequestMethod.POST)
	    public ModelAndView loginProcessAdmin(HttpServletRequest request, HttpServletResponse response,
	    @ModelAttribute("addnewuser") User user) {
	    ModelAndView mav;
	       
	    String insertStatus=userService.registerUser(user);
	    mav = new ModelAndView("addNewUser");
	    
	    if (insertStatus.equalsIgnoreCase("Success")) {
	            mav.addObject("message", "User Created Successfully");
	    
	    } else {
	    
	           mav.addObject("message", "Something is wrong!!");
	    }
	    		
	    return mav;
	  }
	  

	
	@RequestMapping("/showUserList")
	public String showUserList(Model model) {
		
		
		return "showUserList";
	}
	
	
	
	@RequestMapping("/memberAddNew")
	public String addNewMember(Model model) {
		
		
		return "memberAddNew";
	}
	
	@RequestMapping("/memberList")
	public String showAdminLogin(Model model) {
		
		
		return "memberList";
	}
	
	@RequestMapping("/memberSearch")
	public String memberSearch(Model model) {
		
		
		return "memberSearch";
	}
	

}

