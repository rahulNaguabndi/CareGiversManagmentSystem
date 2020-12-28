package com.Caretackers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	@RequestMapping("/loginpage")
	public String lognin() {
		return "login.html";
		
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	
	public String validation(@RequestParam("username") String username, @RequestParam("password") String password)
	{
		if(username.equals("alogin") && password.equals("apass"))
		{
			return "physicianinfo.html";
		}
		
		if(username.equals("nlogin") && password.equals("npass"))
		{
			return "patientinfo.html";
		}
		
		if(username.equals("pylogin") && password.equals("pypass"))
		{
			return "divide.html";
		}
		
		if(username.equals("palogin") && password.equals("papass"))
		{
			return "patientpage.html";
		}else {
			return "login.html";
		}
		
		

	}	

	
}
