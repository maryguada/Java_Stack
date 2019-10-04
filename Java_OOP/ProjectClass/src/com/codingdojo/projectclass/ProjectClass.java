package com.codingdojo.projectclass;

public class ProjectClass {
	
			public String name = ""; 
			public String description = ""; 
			
			public String elevatorPitch() {
				return this.name+ " " + this.description; 
			}
			
			public ProjectClass() {
				
			}; 
			
			
			public ProjectClass(String name ) {
				
			};
			
			
			public ProjectClass(String name, String Description) {
				
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
			};
		
	
}

