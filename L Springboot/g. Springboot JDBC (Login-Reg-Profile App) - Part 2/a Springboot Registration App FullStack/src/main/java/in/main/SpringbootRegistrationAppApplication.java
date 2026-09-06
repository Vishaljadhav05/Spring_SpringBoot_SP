package in.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootRegistrationAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootRegistrationAppApplication.class, args);
	}

}


// Output:-

/*

-----> Before <-----

mysql> select * from register;
+------+---------------+----------+--------+--------+
| name | email         | password | gender | city   |
+------+---------------+----------+--------+--------+
| aaa  | aaa@gmail.com | aaa123   | male   | indore |
| bbb  | bbb@gmail.com | abbb123  | female | ujjain |
+------+---------------+----------+--------+--------+
2 rows in set (0.00 sec)

-----> After <-----


mysql> select * from register;
+------+---------------+----------+--------+--------+
| name | email         | password | gender | city   |
+------+---------------+----------+--------+--------+
| aaa  | aaa@gmail.com | aaa123   | male   | indore |
| bbb  | bbb@gmail.com | abbb123  | female | ujjain |
| ccc  | ccc@gmail.com | ccc123   | Male   | Bhopal |
+------+---------------+----------+--------+--------+
3 rows in set (0.00 sec)


*/