package com.codingdojo.prodscats.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.codingdojo.prodscats.models.Category;
import com.codingdojo.prodscats.models.CategoryProduct;
import com.codingdojo.prodscats.models.Product;
import com.codingdojo.prodscats.services.InventoryService;

@Controller
public class ProductCtrl {
	
	@Autowired 
	private InventoryService invServ; 
	
	//------------------- NEW PRODUCT GET ROUTE ---------------------------//
	//--------------------------------------------------------------------//
	@GetMapping("/products/new")
	public String newProduct(@ModelAttribute("newProductObj") Product product) {
		return "products/new.jsp";
	}
	
	//-------------    ADD NEW PRODUCT POST ROUTE   -----------------------//
	//--------------------------------------------------------------------//
	@PostMapping("/products/new")
	public String createProduct(@Valid @ModelAttribute("newProductObj") Product product, BindingResult result) {
		
		if (result.hasErrors()) {
			return "products/new.jsp"; 
		}
		Product prod = invServ.createNewProduct(product); //getting it from the method/fx above. 
		return "redirect:/products/"+ prod.getId();
	}
	
	//---------  GET ROUTE TO RENDER SHOW PRODUCT PAGE  -------------------//
	//--------------------------------------------------------------------//
	@GetMapping("/products/{id}")
	public String showProduct(Model model, @PathVariable("id") Long id, @ModelAttribute("middleTableObj") CategoryProduct catProd) {
		Product prod = invServ.findOneProduct(id); 
		List<Category>allCats = invServ.getAllCategories();
		model.addAttribute("product", prod);
		model.addAttribute("allCats", allCats); 
		return "products/show.jsp"; 
	}
		

}
