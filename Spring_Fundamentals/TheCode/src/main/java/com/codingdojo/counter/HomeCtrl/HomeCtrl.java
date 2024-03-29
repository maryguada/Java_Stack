package com.codingdojo.counter.HomeCtrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller 

public class HomeCtrl {
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp" ; 
	}
	
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(@RequestParam(value = "code") String code) {
		if (code.equals("MadMax")) {
			return "code.jsp"; 
			
		}else {
			return "redirect:/createError";
		}
	}
	
	@RequestMapping("/creatError")
	public String flashMessage(RedirectAttributes redirectAttributes) {
		redirectAttributes.addFlashAttribute("error", "You must train harder!"); 
		return "redirect:/"; 
	}
	
}
