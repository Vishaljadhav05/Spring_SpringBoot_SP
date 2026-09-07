package in.main.dao;

import org.springframework.data.repository.CrudRepository;

import in.main.beans.User;

public interface UserDao extends CrudRepository<User, String>
{
	
}
