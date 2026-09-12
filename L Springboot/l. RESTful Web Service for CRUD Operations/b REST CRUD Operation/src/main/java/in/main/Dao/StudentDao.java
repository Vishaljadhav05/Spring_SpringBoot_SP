package in.main.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import in.main.beans.Student;

public interface StudentDao extends JpaRepository<Student, Integer>
{

}
