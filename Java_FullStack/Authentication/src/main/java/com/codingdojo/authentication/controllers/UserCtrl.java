package com.codingdojo.authentication.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.codingdojo.authentication.models.User;
import com.codingdojo.authentication.services.UserService;
import com.codingdojo.authentication.validators.UserValidator;

@Controller 
public class UserCtrl {
	
	
	@Autowired
	UserService userService;
	
	@Autowired
	UserValidator userValidator;    
		     
    
    @RequestMapping("/registration")
    public String registerForm(@ModelAttribute("user") User user) {
        return "registration.jsp";
    }
    @RequestMapping("/login")
    public String login() {
        return "login.jsp";
    }
    
   
    @RequestMapping(value="/registration", method=RequestMethod.POST)
    public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
    	userValidator.validate(user,result);
    	if(result.hasErrors()) {
    		return "registration.jsp"; 
    	}
    	
    	User u = userService.registerUser(user); 
    	session.setAttribute("userId", u.getId());
    	return "redirect:/home"; 
    	
    }
    
    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model, HttpSession session) {
        // if the user is authenticated, save their user id in session
    	boolean isAuthenticated = userService.authenticateUser(email, password);
    	if(isAuthenticated) {
    		User u = userService.findByEmail(email); 
    		session.setAttribute("userId", u.getId());
    		return "redirect:/home"; 
    		
    	// else, add error messages and return the login page
    	}else {
    		model.addAttribute("error", "Invalid credentials. Try Again");
    		return "login.jsp"; 
    		
    	}       
    }
    
    @RequestMapping("/home")
    public String home(HttpSession session, Model model) {
        // get user from session, save them in the model and return the home page
    	
    	Long userId = (Long) session.getAttribute("userId"); 
    	User u = userService.findUserById(userId);
    	model.addAttribute("user", u);
    	return "home.jsp"; 
    	
    }
    
    @RequestMapping("/logout")
    public String logout(HttpSession session) {
     {
    		// invalidate session
    	session.invalidate();
    		// redirect to login page
    	return "redirect:/login";
    	}
        
    }

}
