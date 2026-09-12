package in.main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.main.beans.Student;
import in.main.service.StudentService;

@RestController
public class MyController
{
	@Autowired
	StudentService studentService;
	
	
	/*
	 
	@PostMapping("/student")
	public Student  addStudent(
								@RequestParam("id1")int id,
								@RequestParam("name1") String name,
								@RequestParam("gender1") String gender,
								@RequestParam("city1") String city
								)
	{
		Student std = new Student();
		std.setId(id);
		std.setName(name);
		std.setGender(gender);
		std.setCity(city);
		
		Student std1 = studentService.addStudent(std);
		
		return std1;
		
	}
	
	*/
	
	// -----> Other way
	
	
	
	@PostMapping("/student")
	public Student addStudent( @RequestBody Student std )
	{
		/*
		 How to use postman:-
		 
		 Method -> Post -> goto body section -> then select raw
		 -> then select the JSON format -> and provide data in proper JSON format
		 
		*/
		Student std1 = studentService.addStudent(std);
		
		return std1;
		
	}
	
	@GetMapping("/student")
	public List<Student> getAllStudnet()
	{
		List<Student> std_list= studentService.getAllStudent();
		return std_list;
	}
	
	@GetMapping("/student/{id}")
	public Student getStudent(@PathVariable("id") int id )
	{
		Student std1 =  studentService.getStudentDetails(id);
		return std1;
	}
	
	
	@PutMapping("/student")
	public Student updateStudent( @RequestBody Student std )
	{
		Student student = studentService.updateStudent(std);
		
		return student;
	}
	
	@DeleteMapping("/student/{id}")
	public boolean deleteStudent(@PathVariable("id")int id)
	{
		boolean status = studentService.deleteStudent(id);
		return status;
	}
}
