package in.main.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.main.Dao.StudentDao;
import in.main.beans.Student;


@Service
public class StudentServiceImpl implements StudentService
{

	@Autowired
	StudentDao studentDao;
	
	@Override
	public Student addStudent(Student std) 
	{
		Student std1 = studentDao.save(std);
		return std1;
	}

	@Override
	public List<Student> getAllStudent() 
	{
		List<Student> std_list = studentDao.findAll();
		return std_list;
	}

	@Override
	public Student getStudentDetails(int id) 
	{
		Optional<Student> optional = studentDao.findById(id);
		return optional.get();
	}

	@Override
	public Student updateStudent(Student std) 
	{
		Student student = studentDao.save(std);
		return student;
	}

	@Override
	public boolean deleteStudent(int id) 
	{
		boolean status =false;
		
		try 
		{
			studentDao.deleteById(id);
			status = true;
		} 
		catch (Exception e)
		{
			status =false;
			e.printStackTrace();
		}
		
		return status;
	}

	

}
