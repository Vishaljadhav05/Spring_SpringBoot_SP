package in.main.service;

import java.util.List;

import in.main.beans.User;

public interface UserService 
{
	public boolean addUser(User user);
	public boolean updateUser(User user);
	public boolean deleteUser(int id);
	public User searchUser(int id);
	public List<User> getAllUsers();
}
