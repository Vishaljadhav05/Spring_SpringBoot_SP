package in.main;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.beans.Student;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
    		
    		Student std = new Student();
    		std.setId(101);
    		std.setName("Vishal");
    		std.addAdditionalProperties("gender", "Male");
    		std.addAdditionalProperties("city", "Indore");
    		
    		ObjectMapper mapper = new ObjectMapper();
    		String jsonStr = mapper.writeValueAsString(std);
    		System.out.println(jsonStr);
		
    }
}

// Output:-

/*
 
{"id":101,"name":"Vishal","gender":"Male","city":"Indore"}

*/
