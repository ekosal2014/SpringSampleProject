package com.spring.project.Contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping(value="welcome.html")
	public ModelAndView defaultPage(){
		return new ModelAndView("home");
	}

}
