package com.codingdojo.prodscats.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.codingdojo.prodscats.models.Category;
import com.codingdojo.prodscats.services.InventoryService;

@Controller
public class CategoryCtrl {
	@Autowired 
	private InventoryService invServ;
	
	
	//------------------- NEW CATEGORY GET ROUTE ---------------------------//
	//--------------------------------------------------------------------//
	@GetMapping("/category/new")
	public String newCategory(@ModelAttribute("newCategoryObj") Category category) {
		return "/categories/new.jsp"; 
	}
	
	//------------- NEW CATEGORY POST GET ROUTE ---------------------------//
	//--------------------------------------------------------------------//
	@PostMapping("")
}
