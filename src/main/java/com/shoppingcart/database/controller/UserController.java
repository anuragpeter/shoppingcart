package com.shoppingcart.database.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shoppingcart.database.modal.User;
import com.shoppingcart.database.service.UserService;

@Controller
public class UserController {
	private UserService userService;
	
	@Autowired(required=true)
	public void setUserService(UserService userService){
		this.userService=userService;
	}
	
	
	@RequestMapping("/submit")
	public ModelAndView addUser()
	{
		ModelAndView mv=new ModelAndView("signup");
		mv.addObject("user",new User());
		return mv;
		
	}
	
	
	@RequestMapping("/useradd")
	public  String userAdd(@ModelAttribute("user") User u)
	{
		userService.addUser(u);
		return "redirect:/index";
		
	}
	
	
	
	
	
	

}
