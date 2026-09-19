package in.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import in.main.beans.Student;
import tools.jackson.databind.ObjectMapper;

@Controller
public class MyController {
	@GetMapping("/")
	public String printOnJsp(Model model) 
	{
		Student std =null;

		try {
			String jsonStr = "{\r\n" + "	\"id\":101,\r\n" + "	\"name\":\"Vishal\",\r\n"
					+ "	\"gender\":\"Male\",\r\n" + "	\"city\":\"Indore\"\r\n" + "}";

			ObjectMapper objectMapper = new ObjectMapper();

			std = objectMapper.readValue(jsonStr, Student.class);

		} 
		catch (Exception e) {
			e.printStackTrace();
		}

		model.addAttribute("model_std",std);
		return "index";
	}
}
