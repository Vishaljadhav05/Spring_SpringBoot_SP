package in.main.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController 
{
	@RequestMapping("/home")
	public String openHomePage()
	{
		// return "/views/home.jsp"; // This name is given in application.properties
		return "home";
	}
}
