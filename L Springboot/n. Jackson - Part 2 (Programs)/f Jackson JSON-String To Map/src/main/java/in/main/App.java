package in.main;

import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

//Question => Convert "JSON String" to "Java Map".

public class App 
{
    public static void main( String[] args ) throws Exception
    {
	    	String json ="{\r\n"
	        		+ "	\"id\":101,\r\n"
	        		+ "	\"name\":\"Vishal\",\r\n"
	        		+ "	\"gender\":\"Male\",\r\n"
	        		+ "	\"city\":\"Indore\"\r\n"
	        		+ "}";
    	
    		ObjectMapper objectMapper = new ObjectMapper();
    		Map<String, Object> map = objectMapper.readValue(json,new TypeReference <Map<String,Object>>(){});
    		
    		System.out.println("Data in form of map :-");
    		System.out.println(map);
    }
}


// Ouput :-

/*

Data in form of map :-
{id=101, name=Vishal, gender=Male, city=Indore}

*/