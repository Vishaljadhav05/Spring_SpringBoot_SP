package in.main;

import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;
import in.beans.Student;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	
    		Student std = new Student();
    		std.setId(104);
    		std.setName("Uday");
    		std.setGender("Male");
    		std.setCity("Mumbai");
    		
    		ObjectMapper objectMapper = new ObjectMapper();
    		objectMapper.writeValue(new File("G:\\stdWrite.json"), std);
    }
}


// Ouput :-

/*

The new file is created at given location named "stdWrite.json".


*/