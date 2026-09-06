package in.main.dao;

import java.util.List;

import in.main.beans.Student;

public interface LoginDao 
{
	public List<Student> loginDao(String email, String Password);
}
