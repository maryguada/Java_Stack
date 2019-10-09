package com.codingdojo.routing.HomeCtrl;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoCtrl {
	
	@RequestMapping("m/dojo/{text}") 
	public String show (@PathVariable("text") String txt) {
		return "The dojo is: " + txt;  
		}
		
		
	@RequestMapping("m/burbank-dojo/{loc}") 
	public String locate (@PathVariable("location") String loc) {
		return "The Burbank-Dojo is located in: " + loc; 
		}
	
	@RequestMapping("m/san-jose/{desc}")
	public String Head_Q (@PathVariable("description") String desc) {
		return "SJ Dojo is the : "+ desc; 
		
	}
}
	
