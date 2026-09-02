package in.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootJdbcApplication 
{

	public static void main(String[] args) 
	{
		SpringApplication.run(SpringbootJdbcApplication.class, args);
	}

}


// Database  = "springboot_jdbc_db"

// register table

/*

mysql> select * from register;
+------+---------------+----------+--------+--------+
| name | email         | password | gender | city   |
+------+---------------+----------+--------+--------+
| aaa  | aaa@gmail.com | aaa123   | male   | indore |
| bbb  | bbb@gmail.com | abbb123  | female | ujjain |
+------+---------------+----------+--------+--------+
2 rows in set (0.00 sec)

*/