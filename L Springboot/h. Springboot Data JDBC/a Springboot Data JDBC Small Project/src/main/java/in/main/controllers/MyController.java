package in.main.controllers;

import in.main.dao.UserDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.main.beans.User;
import in.main.services.UserService;

@Controller
public class MyController 
{
	private final UserDao userDao;

	@GetMapping("/")
	public String openIndexPage()
	{
		return "index";
	}
	
	@GetMapping("addUserPage")
	public String openAddUserPage()
	{
		return "adduser-page";
	}
	
	
	@Autowired
	UserService userService;

	MyController(UserDao userDao) {
		this.userDao = userDao;
	}
	
	@PostMapping("/addUserForm")
	public String addUserForm(
								@RequestParam("name1")String name,
								@RequestParam("email1")String email,
								@RequestParam("gender1")String gender,
								@RequestParam("city1")String city
							)
	{
		String page = "error";
		
		User user = new User();
		user.setName(name);
		user.setEmail(email);
		user.setGender(gender);
		user.setCity(city);
		
		boolean status = userService.addUser(user);
		
		if (status)
		{
			page ="success";
		}
		else
		{
			page = "error";
		}
		return page;
	}
	
	
	@GetMapping("updateUserPage")
	public String openUpdateUserPage()
	{
		return "updateuser-page";
	}
	
	
	@PostMapping("/updateUserForm")
	public String updateUser(
								@RequestParam("name1") String name,
								@RequestParam("email1") String email,
								@RequestParam("gender1") String gender,
								@RequestParam("city1") String city
								
							)
	{
		String page = "error";
		
		
		User user = new User();
		user.setName(name);
		user.setEmail(email);
		user.setGender(gender);
		user.setCity(city);
		
		boolean uStatus= userService.updateUser(user);
		if(uStatus)
		{
			page = "success";

		}
		else
		{
			page = "error";
		}
		
		return page;
	}
	
	
	@GetMapping("deleteUserPage")
	public String openDeleteUserPage()
	{
		return "deleteuser-page";
	}
	
	@PostMapping("deleteUserForm")
	public String deleteUser(@RequestParam("email1") String email)
	{
		String page = "error";
		
		boolean status= userService.deleteUser(email);
		
		if(status)
		{
			page = "success";

		}
		else
		{
			page = "error";
		}
		
		return page;
	}
	
	@GetMapping("/searchUserPage")
	public String openSearchPage()
	{
		return "searchuser-page";
	}
	
	@PostMapping("/searchUserForm")
	public String searchUser(@RequestParam("email1") String email, Model model)
	{
		String page = "error";
		
		User user= userService.searchUser(email);
		
		if(user != null)
		{
			model.addAttribute("model_user",user);
			page = "user-deatils";

		}
		else
		{
			page = "error";
		}
		
		return page;
	}
	
	
	@GetMapping("/getAllUserPage")
	public String getAllUsers(Model model)
	{
		String page = "getall-users";
		
		List<User> users_list = userService.getAllUsers();
		model.addAttribute("model_allusers", users_list);
		return page;
	}
}


















