package in.main;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.beans.Student;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
    		
    		String jsonStr= "{\"id\":101,\"name\":\"Vishal\",\"password\":\"vishal123\",\"phoneno\":\"8269XXXX65\"}";
    		
    		
    		ObjectMapper mapper= new ObjectMapper();
    		Student std = mapper.readValue(jsonStr, Student.class);
    		
    		System.out.println(std.getId());
    		System.out.println(std.getName());
    		
    }
}

// Output:-

/*
 
---> Before <---

Exception in thread "main" com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException: Unrecognized field "password" (class in.beans.Student), not marked as ignorable (2 known properties: "id", "name")
 at [Source: REDACTED (`StreamReadFeature.INCLUDE_SOURCE_IN_LOCATION` disabled); line: 1, column: 39] (through reference chain: in.beans.Student["password"])
	

---> After <---

101
Vishal

 
*/
