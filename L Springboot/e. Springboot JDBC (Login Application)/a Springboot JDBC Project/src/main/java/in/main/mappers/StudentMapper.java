package in.main.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import in.main.beans.Student;

public class StudentMapper implements RowMapper<Student>
{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException 
	{
		
		/*
		
		String name1 = rs.getString("name");
		String email1 = rs.getString("email");
		String password1 = rs.getString("password");
		String gender1 = rs.getString("gender");
		String city1 = rs.getString("city");
		
		Student std = new Student();
		std.setName(name1);
		std.setEmail(email1);
		std.setGender(gender1);
		std.setPassword(password1);
		std.setCity(city1);
		
		
		 */
		
		// Better Way 
		
		Student std = new Student();
		std.setName(rs.getString("name"));
		std.setEmail(rs.getString("email"));
		std.setGender(rs.getString("gender"));
		std.setPassword(rs.getString("password"));
		std.setCity(rs.getString("city"));
		
		return std;
	}


}
