package com.example.showWebPage;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class WebPageController {
	
	@RequestMapping(value ="/hello" , method = RequestMethod.GET)
	public  @ResponseBody ModelAndView welcomepage()
	{
		   ModelAndView modelAndView = new ModelAndView();
		   modelAndView.setViewName("index"); 
		return  modelAndView ;
		  
	}
	
/*	
	@RequestMapping("/hi")
	public @ResponseBody String login()
	{
		 
		return "loginpage.jsp";
	}
	
	
	@RequestMapping(value="/views" , method = RequestMethod.GET)
	public @ResponseBody  ModelAndView welcome()
	{
		ModelAndView modelAndView = new ModelAndView();
		   modelAndView.setViewName("view");
		return modelAndView;
	}
	
	@RequestMapping("/hii")
	public @ResponseBody String rept(Model model)
	{
		model.addAttribute("message" , "Welcome to view");
		return "loginpage";
	}*/
	

	
	
	  
}
