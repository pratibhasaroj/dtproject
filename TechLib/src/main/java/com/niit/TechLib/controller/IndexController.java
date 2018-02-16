package com.niit.TechLib.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.TechLibBackEnd.Model.User;

@Controller
	public class IndexController {

		 
		 @RequestMapping(value={"/","/home","/index"})

	public String index(){
		return "index";
	}
		 
		 
	/*	 @RequestMapping("/login")
		 public ModelAndView login(
				@RequestParam(value = "error", required = false) String error,
				@RequestParam(value = "logout", required = false) String logout) {

				ModelAndView model = new ModelAndView();
				if (error != null) {
					model.addObject("error", "Invalid username and password!");
				}

				if (logout != null) {
					model.addObject("msg", "You've been logged out successfully.");
				}
				model.setViewName("login");

				return model;

		 }*/
		
		 @RequestMapping(value = "/register", method = RequestMethod.GET)
		  public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
		    ModelAndView mv = new ModelAndView("register");
		    mv.addObject("user", new User());
		    return mv;
		  }
		}
		 
		 
	
	
