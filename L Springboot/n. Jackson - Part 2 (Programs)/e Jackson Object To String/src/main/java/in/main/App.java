package in.main;

import com.fasterxml.jackson.databind.ObjectMapper;
import in.beans.Student;


// Question => Convert "Java Object" to "JSON String".

public class App 
{
    public static void main( String[] args ) throws Exception
    {
    		Student std = new Student();
    		std.setName("Ram");
    		std.setId(501);
    		std.setGender("Male");
    		std.setCity("Lakhnow");
    	
    		ObjectMapper objectMapper = new ObjectMapper();
    		String json_str = objectMapper.writeValueAsString(std);
    		
    		System.out.println(json_str);
            
    }
}


// Ouput :-

/*

{"id":501,"name":"Ram","gender":"Male","city":"Lakhnow"}

*/