package in.main;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import in.beans.Student;


// Question => Writing "Java Object" to "Java Map File".

public class App 
{
    public static void main( String[] args ) throws Exception
    {
    		Student std = new Student();
    		std.setName("Ram");
    		std.setId(501);
    		std.setGender("Male");
    		std.setCity("Bhopal");
    		
    		Map<String, Object> map = new HashMap<String, Object>();
    		map.put("student", std);
    	
    		ObjectMapper objectMapper = new ObjectMapper();
    		objectMapper.writeValue(new File("G:\\mg_student.json"),map);
    		
    		System.out.println("Success");
            
    }
}


// Ouput :-

/*

Success

*/