package in.main;

import java.util.Date;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.beans.Student;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
    		
    		Student std= new Student();
    		std.setId(101);
    		std.setName("Vishal");
    		std.setDob(new Date());
    		
    		ObjectMapper mapper = new ObjectMapper();
    		String jsonStr = mapper.writeValueAsString(std);
    		System.out.println(jsonStr);
    		
    		
    }
}

// Output:-

/*
 
---> Before <---

{"id":101,"name":"Vishal","dob":1789001625788}


---> After <---

{"id":101,"name":"Vishal","dob":"10/09/2026 06:25:57"}
 
*/
