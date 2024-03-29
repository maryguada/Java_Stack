package com.codingdojo.onetomany.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table 
public class Ninja {
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	 	
	 	@Size(min=1, message="First Name is required")
	    private String firstName;
	 	
	 	@Size(min=1, message="Last Name is required")
	    private String lastName;
	    
	 	private int age;
	    @Column(updatable=false)
	    private Date createdAt;
	    private Date updatedAt;
	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name="dojo_id")
	    private Dojo dojo;  // this is what is mapped by attribute in the dojo model is referring to. Name has to be the same. 
	    
	    public Ninja() {}
	    // we need our zero parameter constructor 
	    // generate constructor using fields 

		public Ninja(Long id, @Size(min = 1, message = "First Name is required") String firstName,
				@Size(min = 1, message = "Last Name is required") String lastName,
				@Size(min = 1, message = "Age is required") int age, Date createdAt, Date updatedAt, Dojo dojo) {
			
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.age = age;
			this.createdAt = createdAt;
			this.updatedAt = updatedAt;
			this.dojo = dojo;
		}
		
		// generate getters and setters 
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
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

		public Dojo getDojo() {
			return dojo;
		}

		public void setDojo(Dojo dojo) {
			this.dojo = dojo;
		}
	    
		// add pre persist and pre update here 
		 @PrePersist
		    protected void onCreate(){
		        this.createdAt = new Date();
		    }
		 @PreUpdate
		    protected void onUpdate(){
		        this.updatedAt = new Date();
		    }
		    

}
