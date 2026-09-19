package in.main;

import java.io.File;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;

//Question => Writing "JSON Object" to "JSON File" using Streaming API.

public class App 
{
    public static void main( String[] args ) throws Exception
    {
	    JsonFactory jsonFactory = new JsonFactory();
	    
	    JsonGenerator jsonGenerator = jsonFactory.createGenerator(new File("G:\\mj_Student.json"),JsonEncoding.UTF8);
	    
	    
	    jsonGenerator.writeStartObject();
	    
	    jsonGenerator.writeNumberField("id", 101);
	    jsonGenerator.writeStringField("name", "Vishal Jadhav");
	    jsonGenerator.writeStringField("gender", "Male");
	    jsonGenerator.writeStringField("city", "Indore");
	    
	    
	    jsonGenerator.writeFieldName("marks");
	    jsonGenerator.writeStartArray();
	    		jsonGenerator.writeNumber(98);
	    		jsonGenerator.writeNumber(78);
	    		jsonGenerator.writeNumber(86);
	    	jsonGenerator.writeEndArray();
	    	
	    	jsonGenerator.writeEndObject();
	    	jsonGenerator.close();
	    	
	    	System.out.println("Success...");
	    
    }
}


// Ouput :-

/*

Success...

*/