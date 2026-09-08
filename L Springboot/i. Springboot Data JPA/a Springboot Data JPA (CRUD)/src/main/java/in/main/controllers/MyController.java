package in.main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.main.beans.User;
import in.main.service.UserService;

@Controller
public class MyController {
	@GetMapping("/")
	public String openIndexPage() {
		return "index";
	}

	@GetMapping("/addUserPage")
	public String openAddUserPage() {
		return "adduser-page";
	}

	@Autowired
	UserService userService;

	@PostMapping("/addUserForm")
	public String addUser(@RequestParam("name1") String name, @RequestParam("email1") String email,
			@RequestParam("pass1") String password, @RequestParam("gender1") String gender,
			@RequestParam("city1") String city) {
		String page = "error";

		User user = new User();
		user.setName(name);
		user.setEmail(email);
		user.setPassword(password);
		user.setGender(gender);
		user.setCity(city);

		try {

			boolean status = userService.addUser(user);

			if (status) {
				page = "success";
			} else {
				page = "error";
			}
		} catch (Exception e) {
			page = "error";
			e.printStackTrace();
		}

		return page;
	}
	
	
	@GetMapping("/updateUserPage")
	public String openUpdateUserPage()
	{
		return "updateuser-page";
	}
	
	@PostMapping("/updateUserForm")
	public String updateUser(@RequestParam("id1")int id,@RequestParam("name1") String name, @RequestParam("email1") String email,
			@RequestParam("pass1") String password, @RequestParam("gender1") String gender,
			@RequestParam("city1") String city) 
	{
		String page = "error";

		User user = new User();
		user.setId(id);
		user.setName(name);
		user.setEmail(email);
		user.setPassword(password);
		user.setGender(gender);
		user.setCity(city);

		try {

			boolean status = userService.updateUser(user);

			if (status) {
				page = "success";
			} else {
				page = "error";
			}
		} catch (Exception e) {
			page = "error";
			e.printStackTrace();
		}

		return page;
	}
	
	
	
	@GetMapping("/deleteUserPage")
	public String openDeleteUserPage()
	{
		return "deleteuser-page";
	}
	
	@PostMapping("/deleteUserForm")
	public String deleteUser(@RequestParam("id1")int id) 
	{
		String page = "error";
		
		try {

			boolean status = userService.deleteUser(id);

			if (status) {
				page = "success";
			} else {
				page = "error";
			}
		} catch (Exception e) {
			page = "error";
			e.printStackTrace();
		}

		return page;
	}
	
	@GetMapping("/searchUserPage")
	public String openSearchUserPage()
	{
		return "searchuser-page";
	}
	
	@PostMapping("/searchUserForm")
	public String searchUser(@RequestParam("id1") int id, Model model)
	{
		String page = "error";
		
		try 
		{
			User user= userService.searchUser(id);
			
			if(user != null)
			{
				model.addAttribute("model_user",user);
				page = "user-details";

			}
			else
			{
				page = "error";
			}
		} 
		catch (Exception e)
		{
			page = "error";
			e.printStackTrace();
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
