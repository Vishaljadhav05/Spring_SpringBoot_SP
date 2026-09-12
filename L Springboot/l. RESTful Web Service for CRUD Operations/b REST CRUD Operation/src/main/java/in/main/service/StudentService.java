package in.main.service;

import java.util.List;

import in.main.beans.Student;

public interface StudentService 
{
	public Student addStudent(Student std);
	public List<Student> getAllStudent();
	public Student getStudentDetails(int id);
	public Student updateStudent(Student std);
	public boolean deleteStudent(int id);
}
