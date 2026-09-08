package in.main.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.main.beans.User;
import in.main.dao.UserDao;

@Service
public class UserServiceImpl implements UserService
{

	@Autowired
	UserDao userDao;
	
	
	@Override
	public boolean addUser(User user) 
	{
		boolean status = false;
		
		try 
		{
			userDao.save(user);
			status = true;
		} 
		catch (Exception e) 
		{
			status = false;
			e.printStackTrace();
		}
		
		return status;
	}
	
	@Override
	public boolean updateUser(User user) 
	{
		boolean status = false;
		
		try 
		{
			if(userDao.existsById(user.getId())) 
			{
				userDao.save(user);
				status = true;
			}
			else
			{
				status = false;
			}
			
		} 
		catch (Exception e) 
		{
			status = false;
			e.printStackTrace();
		}
		
		return status;
	}
	

	@Override
	public boolean deleteUser(int id) 
	{
		boolean status = false;
		
		try 
		{
			userDao.deleteById(id);
			status = true;
		} 
		catch (Exception e) 
		{
			status = false;
			e.printStackTrace();
		}
		
		return status;
	}

	@Override
	public User searchUser(int id) 
	{
		
	User user = null;
		
		try 
		{
		
			Optional<User> optional = userDao.findById(id);
			
			if(optional.isPresent())
			{
				user = optional.get();
			}
		
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	
		return user;
		
	}

	@Override
	public List<User> getAllUsers() 
	{
		Iterable<User> iterable  = userDao.findAll();
		
		List<User> list_users = new ArrayList<User>();
		
		Iterator<User> itr = iterable.iterator();
		
		while (itr.hasNext()) 
		{
			User user = itr.next();
			list_users.add(user);
			
		}
		
		return list_users;
	}
	

}
