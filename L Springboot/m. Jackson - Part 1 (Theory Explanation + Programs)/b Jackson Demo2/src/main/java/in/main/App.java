package in.main;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.beans.Student;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        String json =   "[\r\n"
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
			        
        
        
        ObjectMapper obj = new ObjectMapper();
        
        Student[] std = obj.readValue(json, Student[].class);
        
       for (Student student : std) 
       {
    	   		System.out.println("Id : " +student.getId());
            System.out.println("Name : "+student.getName());
            System.out.println("Gender : "+student.getGender());
            System.out.println("City : "+student.getCity());
            System.out.println("------------------");
       }
    }
}


// Ouput :-

/*

Id : 101
Name : Komal
Gender : Female
City : Ujjain
------------------
Id : 102
Name : Vishal
Gender : Male
City : Indore
------------------


*/