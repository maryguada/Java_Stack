package com.codingdojo.onetomany.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.onetomany.models.Dojo;
import com.codingdojo.onetomany.models.Ninja;
import com.codingdojo.onetomany.services.AppService;

@Controller 
public class DojoCtrl {
	@Autowired
	AppService appServ; 
	
	//----------------------------------------- Create New Dojo -------------------------------------
	//--                                                                                          ---
	//-----------------------------------------------------------------------------------------------
	
	//build first route 
	
	@GetMapping("/dojo/new")
	// this page has a form and if we have a form on a page we have to pass it the new instance of that model since we 
	// are creating a new object
	public String dojoNew(@ModelAttribute("newDojoObj") Dojo dojo) {
		return "dojos/new.jsp"; 
	}
	
	@PostMapping("/dojo/new")
	public String createDojo(@Valid @ModelAttribute("newDojoObj") Dojo dojo, BindingResult result ) {
		
		if(result.hasErrors()) {
			return "dojos/new.jsp"; 
		}else {
			appServ.createDojo(dojo); 
			return "redirect:/ninja/new"; 
		}
	}
	
	//----------------------------------------- Create New Ninja -------------------------------------
	//--                                                                                          ---
	//-----------------------------------------------------------------------------------------------
	
	@GetMapping("/ninja/new")
	public String newNinja(Model model, @ModelAttribute("newNinjaObj") Ninja ninja) {
		List<Dojo> Dojos = appServ.getAllDojos();
		model.addAttribute("Dojos", Dojos);
		return "ninjas/new.jsp";
	}
	
	@PostMapping("ninja/new")
	public String createNinja(@Valid @ModelAttribute("newNinjaObj") Ninja ninja, BindingResult result) {
		if (result.hasErrors()) {
			return "ninjas/new.jsp";
		}else {
			appServ.createNinja(ninja); 
			return "redirect:/dojo/new";
		}
	}
	
	
	
}
