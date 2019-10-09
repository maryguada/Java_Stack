package com.codingdojo.prodscats.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codingdojo.prodscats.models.Category;
import com.codingdojo.prodscats.models.Product;
import com.codingdojo.prodscats.repositories.CategoryRepository;
import com.codingdojo.prodscats.repositories.ProductRepository;

@Service
public class InventoryService {
	@Autowired
	//private is an attribute of this class so it should be private per VA
	// private member variables 
	// public getters and setters 
	private ProductRepository productRepo;
	
	
	@Autowired
	private CategoryRepository categoryRepo;


	public Product createNewProduct(@Valid Product product) {
		// TODO Auto-generated method stub
		return productRepo.save(product);
	}

	public Product findOneProduct(Long id) {
		// we need to create an optional 
		Optional<Product> optProduct = productRepo.findById(id);
		if (optProduct.isPresent()) {
			return optProduct.get();
		}else {
			return null;
		}
		
	}

	public List<Category> getAllCategories() {
		// TODO Auto-generated method stub
		
		return null;
	} 
}
