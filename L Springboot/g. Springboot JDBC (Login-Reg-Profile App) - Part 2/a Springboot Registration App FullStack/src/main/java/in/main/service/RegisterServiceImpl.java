package in.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.main.beans.Student;
import in.main.dao.RegisterDao;

@Service
public class RegisterServiceImpl implements RegisterService
{

	@Autowired
	RegisterDao registerDao;
	
	@Override
	public boolean registerServiceStudent(Student std) 
	{
		boolean status =  registerDao.registerDao(std);
		
		return status;
	}

}
