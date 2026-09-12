package in.main.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.main.beans.Student;

@RestController
public class MyController
{
	/* 

	@GetMapping("/printStudent")
	public Student  printStdDetails()
	{
		Student std = new Student();
		std.setName("Vishal");
		std.setGender("Male");
		std.setCity("Indore");
		return std;
	}
		
	 */
	
	// Using Constructor
	
	@GetMapping("/printStudent")
	public Student  printStdDetails()
	{
		Student std = new Student("Uday","Male","Mumbail");
		return std;
	}
}
