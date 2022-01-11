package com.phdareys.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import dao.EmpDao;
import model.Person;

@Controller
@RequestMapping("/hello5")
public class HelloController5 {
	
	@Autowired EmpDao dao;
	@Autowired Person identity;
	@RequestMapping(method = RequestMethod.GET)
	public String printHello(final ModelMap pModel) {
		pModel.addAttribute("employee", new Person());
		
		List<Person> employees = dao.get();
		pModel.addAttribute("persons" , employees);
		
		//dao.add(identity);
		pModel.addAttribute("p", identity);
		
		pModel.addAttribute("person", employees.get(employees.size()-1));
		
		return "hello5";
		
	}
	
	
	@RequestMapping("/del/{id}")
	public String delPersonne(@ModelAttribute("employee")Person employee, final ModelMap pModel, @PathVariable(value="id") final String sId) {
		
		int id=0;
		
		try {
			id = Integer.parseInt(sId);
			if (dao.delete(id) == 0)
				throw new Exception("Non existing id " + sId);
				pModel.addAttribute("success" , "Course deleted");
				pModel.addAttribute("persons" , dao.get());
				pModel.addAttribute("first_name", employee.getFirst_name());
		        pModel.addAttribute("last_name", employee.getLast_name());
		        pModel.addAttribute("salary", employee.getSalary());
		        pModel.addAttribute("year", employee.getYear());
				
			}catch (Exception e) {
				pModel.addAttribute("error", "Cannot delete course: " + sId);
				
			}
		return "hello5";
	}
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
    public String submit(@ModelAttribute("employee")Person employee, 
      BindingResult result, ModelMap model) {
		model.addAttribute("persons" , dao.get());
		
        if (! this.checkValues(employee, result)) {
            return "hello5";
        }
		
		System.out.println(employee);
       
        
        
        try {
        dao.add(employee);
        model.addAttribute("warningSuccess", "Your record added to system succesfully");
        model.addAttribute("persons" , dao.get());
        
        }catch(Exception e) {
        	e.printStackTrace();
        }
        
    
        return "hello5";
    }
	
	
	private boolean checkValues(Person p, BindingResult result) {
		if(p.getFirst_name().length() < 3)
			result.rejectValue("first_name", "Error");
		if(p.getLast_name().length() < 3)
			result.rejectValue("last_name", "Error");
		if(p.getSalary() < 1500)
			result.rejectValue("salary", "Error");
		
		return ! result.hasErrors();
		
			
	}
	
	
	
	
	
	
}