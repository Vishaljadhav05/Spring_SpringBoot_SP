package in.main;

import java.io.File;
import java.util.Map;
import com.fasterxml.jackson.databind.ObjectMapper;


// Question => Reading "Java Map File" to "Java Object".

public class App 
{
    @SuppressWarnings("unchecked")
	public static void main( String[] args ) throws Exception
    {
    	
    		ObjectMapper objectMapper = new ObjectMapper();
    		Map<String, Object> map = objectMapper.readValue(new File("G:\\mg_student.json"),Map.class);
    		
    		System.out.println(map);
    		System.out.println(map.get("student"));
            
    }
}


// Ouput :-

/*

{student={id=501, name=Ram, gender=Male, city=Bhopal}}
{id=501, name=Ram, gender=Male, city=Bhopal}

*/