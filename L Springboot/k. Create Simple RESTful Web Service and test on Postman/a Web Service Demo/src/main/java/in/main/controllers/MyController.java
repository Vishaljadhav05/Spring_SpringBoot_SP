package in.main.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController 
{
	/*
	 
	@GetMapping("/")
	public String printHello()
	{
		return "Hello Vishal";
	}
	

	@PostMapping("/")
	public String printHi()
	{
		return "Hi Vishal";
	}
	
	
	@GetMapping("/")
	public String printHello(@RequestParam("name1")String name)
	{
		return "Hello :" +name;
	}
	

	@PostMapping("/hi")
	public String printHi(@RequestParam("name1")String name)
	{
		return "Hi : " +name;
	}
	
	
	
	@GetMapping("/")
	public String printHello(@RequestParam("name1")String name, @RequestParam("roll1")String rollno)
	{
		return "Hello :" +name+", your roll no is : "+rollno;
	}
	

	@PostMapping("/hi")
	public String printHi(@RequestParam("name1")String name, @RequestParam("roll1")String rollno)
	{
		return "Hi : " +name+", your roll no is : "+rollno;
	}
	
	*/
	
	@GetMapping("/hello/{name1}")
	public String printHello(@PathVariable("name1") String name)
	{
		return "Hello :" +name;
	}
	

	@PostMapping("/hi/{name1}/{roll1}")
	public String printHi(@PathVariable("name1")String name, @PathVariable("roll1")String rollno)
	{
		return "Hi : " +name+", your roll no is : "+rollno;
	}
	
	
}
