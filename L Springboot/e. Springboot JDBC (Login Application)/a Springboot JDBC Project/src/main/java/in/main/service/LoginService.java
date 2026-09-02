package in.main.service;

import java.util.List;

import in.main.beans.Student;

public interface LoginService 
{
	public List<Student> loginService(String eamil, String password);
}
