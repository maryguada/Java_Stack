package com.codingdojo.prodscats.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity 
@Table(name = "products")  //table name needs to be plural 
public class Product {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	@Size(min=1, message = "Name is required")
	private String name; 
	
	@Size(min=1, message = "Description is required")
	private String description; 
	private double price;
	@Column(updatable=false)
	
	@DateTimeFormat(pattern="yyyy-MM-DD")
	private Date createdAt;
	@DateTimeFormat(pattern="yyyy-MM-DD")
    private Date updatedAt;
	
	////////////   RELATIONSHIP ///////////
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "categories_products", 
        joinColumns = @JoinColumn(name = "product_id"), 
        inverseJoinColumns = @JoinColumn(name = "category_id")
    )
    // this is the product table bec products have many categories 
    private List<Category> categories;
    
    //empty constructos 
    public Product() {}
    
    
 // generate constructor using fields
	public Product( String name, String description, double price, List<Category> categories) {
		
		this.name = name;
		this.description = description;
		this.price = price;
		this.categories = categories;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public Date getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}


	public Date getUpdatedAt() {
		return updatedAt;
	}


	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}


	public List<Category> getCategories() {
		return categories;
	}


	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
    
	// need prepersist and preupdate 
    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
	
   
    
}
