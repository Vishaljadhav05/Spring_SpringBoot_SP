package in.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.main.beans.Student;
import in.main.dao.LoginDao;
import in.main.dao.LoginDaoImpl;

@Service
public class LoginServiceImpl implements LoginService
{
	@Autowired
	LoginDao loginDao;

	@Override
	public List<Student> loginService(String eamil, String password) 
	{

		/* Security issue here
		 
		LoginDaoImpl loginDaoImpl = new LoginDaoImpl();
		List<Student> student_list = loginDaoImpl.loginDao(eamil, password);
		return student_list;
		
		*/
		
		/* Again You dont need to create Manually 
		 
		LoginDao loginDao = new LoginDaoImpl();
		List<Student> student_list = loginDao.loginDao(eamil, password);
		return student_list;
		
		*/
		
		List<Student> student_list = loginDao.loginDao(eamil, password);
		return student_list;
	}

}
