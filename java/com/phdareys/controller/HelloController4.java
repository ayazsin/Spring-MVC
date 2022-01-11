package com.phdareys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Person;

@Controller
@RequestMapping("/hello4")
public class HelloController4 {
	@Autowired Person identity;
	@RequestMapping(method = RequestMethod.GET)
	public String printHello(final ModelMap pModel) {
		
		pModel.addAttribute("person2" , identity);
		pModel.addAttribute("person" , new Person("Pierre", "Jacques", 2500, 4));
		
		return "hello4";
		
	}
}