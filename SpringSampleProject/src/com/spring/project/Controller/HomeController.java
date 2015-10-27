package com.spring.project.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping(value="welcome.html")
	public ModelAndView defaultPage(){
		System.out.println("Heool");
		return new ModelAndView("home");
	}

}
