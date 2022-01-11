package com.phdareys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello3/{firstname}/{lastname}")
public class HelloController3 {
	@RequestMapping(method = RequestMethod.GET)
	public String printHello(final ModelMap pModel,
			@PathVariable(value="firstname") final String pFirstName, 
			@PathVariable(value="lastname") final String pLastName) {
		
		pModel.addAttribute("firstname" , pFirstName);
		pModel.addAttribute("lastname" , pLastName);
		
		return "hello3";
		
	}
}