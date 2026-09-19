package in.main;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

//Question =>Reading "JSON String" using Streaming API .

public class App 
{
    @SuppressWarnings("deprecation")
	public static void main( String[] args ) throws Exception
    {
    		/*
    	
        String jsonStr ="{\r\n"
        		+ "	\"id\":101,\r\n"
        		+ "	\"name\":\"Vishal\",\r\n"
        		+ "	\"gender\":\"Male\",\r\n"
        		+ "	\"city\":\"Indore\"\r\n"
        		+ "}";
        		
        	*/
    	
    	
        String jsonStr =   "[\r\n"
        		+ "	{\r\n"
        		+ "		\"id\": 101,\r\n"
        		+ "		\"name\": \"Komal\",\r\n"
        		+ "		\"gender\": \"Female\",\r\n"
        		+ "		\"city\" : \"Ujjain\"\r\n"
        		+ "	},\r\n"
        		+ "	{\r\n"
        		+ "		\"id\": 102,\r\n"
        		+ "		\"name\": \"Vishal\",\r\n"
        		+ "		\"gender\": \"Male\",\r\n"
        		+ "		\"city\" : \"Indore\"\r\n"
        		+ "	}\r\n"
        		+ "]";
        
	    JsonFactory jsonFactory = new JsonFactory();
	    
	    JsonParser jsonParser = jsonFactory.createParser(jsonStr);
	    
	    while(jsonParser.nextToken() != null)
	    {
	    		// System.out.println(jsonParser.currentToken());
	    		if(jsonParser.currentToken() == JsonToken.FIELD_NAME)
	    		{
	    			String fieldName = jsonParser.getCurrentName();
	    			jsonParser.nextToken();
	    			if (fieldName.equals("id")) 
	    			{
					int id = jsonParser.getIntValue();	
					System.out.println("Id : "+id);
				}
	    			else if(fieldName.equals("name"))
	    			{
	    				String name = jsonParser.getText();
	    				System.out.println("Name : "+name);
	    			}
	    			else if(fieldName.equals("gender"))
	    			{
	    				String gender = jsonParser.getText();
	    				System.out.println("Gender : "+gender);
	    			}
	    			else if(fieldName.equals("city"))
	    			{
	    				String city = jsonParser.getText();
	    				System.out.println("City : "+city);
	    			}
	    		}
	    		else
	    		{
	    			System.out.println("-----------------------");
	    		}
	    }
	    	
    }
}


// Ouput :-

/*

START_OBJECT
FIELD_NAME
VALUE_NUMBER_INT
FIELD_NAME
VALUE_STRING
FIELD_NAME
VALUE_STRING
FIELD_NAME
VALUE_STRING
END_OBJECT

-----------------

Id : 101
Name : Vishal
Gender : Male
City : Indore

-----------------------
-----------------------
Id : 101
Name : Komal
Gender : Female
City : Ujjain
-----------------------
-----------------------
Id : 102
Name : Vishal
Gender : Male
City : Indore
-----------------------
-----------------------

*/