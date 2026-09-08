package in.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.main.beans.User;

public interface UserDao extends JpaRepository<User, Integer>
{

}
