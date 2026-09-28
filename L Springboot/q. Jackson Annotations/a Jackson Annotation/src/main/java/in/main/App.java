package in.main;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.beans.Student;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
    		// ------------- Object to Json ----------------
    		Student std1 = new Student();
    		std1.setId(101);
    		std1.setName("Vishal");
    		
    		ObjectMapper mapper1 = new ObjectMapper();
    		String jsonStr1 = mapper1.writeValueAsString(std1);
    		System.out.println(jsonStr1);
    		
    		System.out.println("-------------------------------");
    		
    		// ------------- Object to Json ----------------
    		String jsonStr2 = "{\"myid\":101,\"myname\":\"Vishal\"}";
    		
    		ObjectMapper mapper2 = new ObjectMapper();
    		Student std2 = mapper2.readValue(jsonStr2, Student.class);
    		
    		System.out.println(std2.getId());
    		System.out.println(std2.getName());
    		
    }
}

// Output:-

/*
 
{"myid":101,"myname":"Vishal"}
-------------------------------
101
Vishal

 
*/
