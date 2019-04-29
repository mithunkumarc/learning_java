package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.example.demo.model.Country;
import com.example.demo.model.PersonForm;

@Controller
public class SelectController {
	
	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public String selectOptionExample1Page(Model model) {
	 
	    PersonForm form = new PersonForm();
	    model.addAttribute("personForm", form);	 
	    List<Country> list = Arrays.asList(new Country("1","india"),new Country("2","Australia"),new Country("3","brazil"));
	    model.addAttribute("countries", list);
	 
	    return "index";
	}
	
	
	
	@PostMapping("/")
	public String welcome(@ModelAttribute PersonForm personForm,Model model) {
		//System.out.println(personForm.getCountryId());
		  model.addAttribute("country_id", personForm.getCountryId());
	      return "welcome";
	}
	
	
	
	
	
}
