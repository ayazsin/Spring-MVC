package com.phdareys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello2")
public class HelloController2 {
	@RequestMapping(method = RequestMethod.GET)
	public String printHello(final ModelMap pModel) {
		return "hello2";
	}
}