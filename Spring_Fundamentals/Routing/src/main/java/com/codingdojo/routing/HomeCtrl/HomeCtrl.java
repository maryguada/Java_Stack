package com.codingdojo.routing.HomeCtrl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Coding")
public class HomeCtrl {
	
	@RequestMapping("")
	public String index() {
		return "<h1> Hello Coding Dojo! </h1>" ; 
	}
	
	@RequestMapping("/Python")
	public String python() {
		return "<h1> Python/ Django was awesome! </h1>" ; 
	}
	
	@RequestMapping("/Java")
	public String java() {
		return "<h1> Java/Spring is better! </h1>"; 
	}
		

}
