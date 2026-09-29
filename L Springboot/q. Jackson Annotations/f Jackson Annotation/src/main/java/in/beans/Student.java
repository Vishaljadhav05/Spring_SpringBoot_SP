package in.beans;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Student
{
	
	private int id;
	private String name;
	
	
	// @JsonFormat(pattern = "dd/MM/yyy")
	@JsonFormat(pattern = "dd/MM/yyy HH:mm:ss",timezone = "Asia/Kolkata")
	private Date dob;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	// @JsonFormat(pattern = "dd/MM/yyy HH:mm:ss",timezone = "Asia/Kolkata")
	public Date getDob() {
		return dob;
	}
	
	// @JsonFormat(pattern = "dd/MM/yyy HH:mm:ss",timezone = "Asia/Kolkata")
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	
	
}
