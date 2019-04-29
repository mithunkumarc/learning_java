package com.example.demo.controller;


import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.model.User;

@Controller
public class HomeController
{
	
	@RequestMapping("/")
	public String home(Model model)
	{
		model.addAttribute("users", this.getUserList());
		return "index";
	}
	
	
	public List<User> getUserList() {
		List<User> userList = new ArrayList();
		userList.add(new User(1,"anil kumar"));
		userList.add(new User(2,"maruthi prasad"));
		userList.add(new User(3,"arvind"));
		userList.add(new User(4,"sandeep"));
		return userList;
	}
	
	
	
	
	
}