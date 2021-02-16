package com.punith.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.punith.Domain.UserDetails;
import com.punith.Repository.UserRepository;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	UserRepository repo;
	
	public HomeController(UserRepository repo) {
		super();
		this.repo = repo;
	}
	
	//@RequestMapping(value="/",method=RequestMethod.GET)
	@GetMapping
	public String homePage() {
		System.out.println("Dude");
		return "login";
	}
	
	@PostMapping("successData")
	public String userInfo(@ModelAttribute("user") UserDetails u)
	{
		repo.save(u);
		return "success";
	}
}
