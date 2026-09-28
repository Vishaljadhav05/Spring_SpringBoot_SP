package in.main;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.beans.Student;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
    		
    		// String jsonStr = "{\"myid\":101,\"myname\":\"Vishal\"}";
    		// String jsonStr= "{\"myid\":101,\"myname\":\"Vishal\"}";
    		String jsonStr= "{\"id1\":101,\"name1\":\"Vishal\"}";
    		
    		
    		ObjectMapper mapper2 = new ObjectMapper();
    		Student std = mapper2.readValue(jsonStr, Student.class);
    		
    		System.out.println(std.getId());
    		System.out.println(std.getName());
    		
    }
}

// Output:-

/*
 
101
Vishal

 
*/
