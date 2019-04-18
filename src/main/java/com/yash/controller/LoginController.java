package com.yash.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.yash.model.Login;
import com.yash.service.UserService;

@Controller
public class LoginController {
  @Autowired
  private UserService userservice;
  
  
  @RequestMapping(value = "/adminLogin", method = RequestMethod.GET)
  public ModelAndView showAdminLogin() {
	  
	   ModelAndView mav=new ModelAndView("adminLogin");
	   mav.addObject("adminlogin",new Login());
	   
	   return mav;
		  
  }
  
  @RequestMapping(value = "/loginProcessAdmin", method = RequestMethod.POST)
    public ModelAndView loginProcessAdmin(HttpServletRequest request, HttpServletResponse response,
    @ModelAttribute("adminlogin") Login login) {
    ModelAndView mav;
       
    Login logincredentials =(Login) userservice.validateUser(login.getUserName());
    
    
    if (logincredentials.getUserName().equalsIgnoreCase(login.getUserName())) {
    mav = new ModelAndView("adminHome");
    
    } else {
    mav = new ModelAndView("adminLogin");
    mav.addObject("message", "Username or Password is wrong!!");
    }
    return mav;
  }
  
 
  
  @RequestMapping(value = "/librarianLogin", method = RequestMethod.GET)
  public ModelAndView showLogin() {
	  
	   ModelAndView mav=new ModelAndView("librarianLogin");
	   mav.addObject("librarianlogin",new Login());
	   
	   return mav;
		  
    
  }
  
   
  @RequestMapping(value = "/librarianloginProcess", method = RequestMethod.POST)
  public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
  
	@ModelAttribute("librarianlogin") Login login) {
    ModelAndView mav;
       
    Login logincredentials =(Login) userservice.validateUser(login.getUserName());
    
    
    if (logincredentials.getUserName().equalsIgnoreCase(login.getUserName()))  {
    mav = new ModelAndView("librarianHome");
    
    } else {
    mav = new ModelAndView("librarianLogin");
    mav.addObject("message", "Username or Password is wrong!!");
    }
    return mav;
  }
}