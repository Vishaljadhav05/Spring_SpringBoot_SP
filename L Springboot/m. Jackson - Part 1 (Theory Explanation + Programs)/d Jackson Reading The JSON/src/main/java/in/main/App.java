package in.main;

import java.io.File;
import com.fasterxml.jackson.databind.ObjectMapper;
import in.beans.Student;


// Question => 
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	
    		ObjectMapper objectMapper = new ObjectMapper();
    		Student[] std = objectMapper.readValue(new File("G:\\stdRead.json"), Student[].class);
    		
    		
    		for (Student student : std) 
    		{
    			  System.out.println("Id : " +student.getId());
               System.out.println("Name : "+student.getName());
               System.out.println("Gender : "+student.getGender());
               System.out.println("City : "+student.getCity());
               System.out.println("--------------");
		}
            
    }
}


// Ouput :-

/*

Id : 101
Name : Komal
Gender : Female
City : Ujjain
--------------
Id : 102
Name : Vishal
Gender : Male
City : Indore
--------------
Id : 103
Name : Prafull
Gender : Male
City : Pune
--------------


*/