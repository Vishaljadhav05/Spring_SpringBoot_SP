package in.main;

import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.beans.Student;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
    		
    	String jsonStr = "{\"id\":101,\"name\":\"Vishal\",\"gender\":\"Male\",\"city\":\"Indore\"}";
		
		ObjectMapper mapper = new ObjectMapper();
		Student std = mapper.readValue(jsonStr, Student.class);
		
		System.out.println(std.getId());
		System.out.println(std.getName());
		
		Map<String, Object> additinal_properties = std.getAdditionalProperties();
		
		for (Map.Entry<String, Object> entry : additinal_properties.entrySet()) 
		{
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
    }
}

// Output:-

/*
 
101
Vishal
gender : Male
city : Indore

*/
