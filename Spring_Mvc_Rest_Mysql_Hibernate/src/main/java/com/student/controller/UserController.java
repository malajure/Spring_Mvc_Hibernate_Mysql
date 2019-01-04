package com.student.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.student.pojo.User;
import com.student.service.UserService;

@Controller
public class UserController
{

	@Autowired
	private UserService userservice;
	
	public UserService getUserservice() {
		return userservice;
	}	
	public void setUserservice(UserService userservice) {
		this.userservice = userservice;
	}


	//for model atttribute object for web pages
	@ModelAttribute
	public void addingCommonObject(Model model)
	{
		model.addAttribute("companyName","IIHT Btm Layout");
	}
	
	//for Registration Page
	@RequestMapping(value="/registerForm",method=RequestMethod.GET)	
	public ModelAndView getRegistrationForm()
	{
				
		ModelAndView regForm = new ModelAndView("RegisterUser");
		return regForm;
	}
	
	
	//for Home Page	
	@RequestMapping(value="/home",method= RequestMethod.GET)
	public String getHomePage()
	{
		return "redirect:/";
	}
		
	//form data receive method
	@RequestMapping(value="/userRegistraion",method =RequestMethod.POST)
	public ModelAndView addUser(@ModelAttribute("userobject") User userobject)
	{
		//call the service class method to save to user object			
		if(userobject != null)
		{
			 userservice.addUser(userobject);
		}
	     	 
	  return new ModelAndView("redirect:/home");
	}
	
	
	
	//for the view of user object 
	
	@RequestMapping(value="/view",method=RequestMethod.GET)
	public ModelAndView showUser(ModelAndView view)
	{
		List<User> userList = userservice.getAllUsers();
		
		
		view.setViewName("ShowUser");
		view.addObject("users", userList);
        return view;		
		
	}
	
	//for delete object from db using hibernate
	
	 @RequestMapping("/delete/{userId}")
	    public String deleteUser(@PathVariable("userId") int userId) {
	        userservice.deleteUser(userId);
		
	        return "redirect:/view";
	    }
}
