package com.example.helloproject.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class projecthello {	
	@GetMapping("/")
	ModelAndView replyone() {
		ModelAndView reply = new ModelAndView("index");
		return reply;
	}
	
	@GetMapping("/Nikita")	
		String replysec(){
			return "Hello Nikita!!!!!!!!";
	}
}