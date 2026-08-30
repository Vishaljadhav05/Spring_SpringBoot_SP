package in.main.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController 
{
	@RequestMapping("/")
	public String openIndexPage()
	{
		return "index";
	}
	
	@GetMapping("/contactUs")
	public String openContactUsPage()
	{
		return "contact-us";
	}
}
