package com.niit.training.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.training.services.CustomerService;

@Controller
public class CustomerController {

	@Autowired
	CustomerService service;
	
	@RequestMapping(value = "/addCustomer" , method = RequestMethod.POST)
	public ModelAndView addCustomer(@RequestParam String firstName,
			@RequestParam String middleName
			, @RequestParam String lastName, @RequestParam String email_id
			,@RequestParam long contact
			,@RequestParam String password, @RequestParam String confirmPassword)
	{
		if(service.findCustomer(email_id))
		{
			String msgValue = "Customer with"+ firstName +"already exists";
			return new ModelAndView("customer","message",msgValue);
		}
		else
		{
			if(password.equals(confirmPassword)){
			service.addCustomer(email_id, password, firstName, middleName, lastName, contact);
			String msgValue = "Thank you"+ firstName+ "for registering";
			return new ModelAndView("customer","message",msgValue);
			}
			else
			{
				String msgValue = "Password Mismatch";
				return new ModelAndView("customer","message",msgValue);
			}
		}
		
	}
}
