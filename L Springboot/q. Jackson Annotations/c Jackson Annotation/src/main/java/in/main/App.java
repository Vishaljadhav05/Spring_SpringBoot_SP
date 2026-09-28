package in.main;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.beans.Student;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
    		
    		Student std= new Student();
    		std.setId(101);
    		std.setName("Vishal");
    		std.setPassword("vishal123");
    		
    		ObjectMapper mapper = new ObjectMapper();
    		String jsonStr = mapper.writeValueAsString(std);
    		System.out.println(jsonStr);
    		
    		
    }
}

// Output:-

/*
 
---> Before <---

{"id":101,"name":"Vishal","password":"vishal123"}


---> After <---

{"id":101,"name":"Vishal"}

 
*/
