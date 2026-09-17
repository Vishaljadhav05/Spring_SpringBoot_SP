package in.main;

import com.fasterxml.jackson.databind.ObjectMapper;

import in.beans.Student;

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
        
        
        
        ObjectMapper obj = new ObjectMapper();
        
        Student std = obj.readValue(json, Student.class);
        System.out.println("Id : " +std.getId());
        System.out.println("Name : "+std.getName());
        System.out.println("Gender : "+std.getGender());
        System.out.println("City : "+std.getCity());
    }
}


// Ouput :-

/*

Id : 101
Name : Vishal
Gender : Male
City : Indore

*/