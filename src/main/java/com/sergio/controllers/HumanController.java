package com.sergio.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HumanController {


	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String greetingName(@RequestParam(value="name", required=false)String name, @RequestParam(value="lastname", required=false)String lastname) {
		
		if (name == null && lastname !=null) {
			
			name="";
			lastname="Mr. / Ms. "+lastname;
		}
		
		
		if (name == null) {
			name ="";
		}
		
		if (lastname == null) {
			lastname ="";
		}
		
		
		
		if (name == "" && lastname == "") {
			return "<h1 style='color:blue; padding: 0 250px;'>Hello Human!</h1>"
					+ "<h2 style='color:orange; padding: 0 250px;'>Welcome to SpringBoot!</h2>";
			
		}else {
		return "<div style='display:flex; justify-content:space-between; padding: 0 250px;'>"
				+ "<h1 style='color:blue'>Hello " +name+" "+lastname+ "!</h1>"
				+"<a href='/'>Go Back</a>"
				+"</div>"
				+ "<h2 style='color:orange; padding: 0 250px;'>Welcome to SpringBoot!</h2>";
		}
	}
	
}
