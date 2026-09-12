package in.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class lb_REST_CRUD_Operation {

	public static void main(String[] args) {
		SpringApplication.run(lb_REST_CRUD_Operation.class, args);
	}

}


// Database operations:-

/*


mysql> select * from std_details;
Empty set (0.00 sec)

mysql> select * from std_details;
+----+--------+--------+--------+
| id | city   | gender | name   |
+----+--------+--------+--------+
|  1 | Indore | Male   | Vishal |
+----+--------+--------+--------+
1 row in set (0.00 sec)

mysql> select * from std_details;
+----+--------+--------+--------+
| id | city   | gender | name   |
+----+--------+--------+--------+
|  1 | Indore | Male   | Vishal |
|  2 | Mumbai | Female | Komal  |
|  3 | Pune   | Male   | Uday   |
+----+--------+--------+--------+
3 rows in set (0.00 sec)

mysql> select * from std_details;
+-----+--------+--------+--------+
| id  | city   | gender | name   |
+-----+--------+--------+--------+
|   1 | Indore | Male   | Vishal |
|   2 | Mumbai | Female | Komal  |
|   3 | Pune   | Male   | Uday   |
| 122 | Agra   | Male   | Amit   |
+-----+--------+--------+--------+
4 rows in set (0.00 sec)

mysql> select * from std_details;
+-----+--------+--------+--------+
| id  | city   | gender | name   |
+-----+--------+--------+--------+
|   1 | Indore | Male   | Vishal |
|   2 | Mumbai | Female | Komal  |
|   3 | Pune   | Male   | Uday   |
| 122 | Delhi  | Male   | Amit   |
+-----+--------+--------+--------+
4 rows in set (0.00 sec)

mysql> select * from std_details;
+-----+--------+--------+--------+
| id  | city   | gender | name   |
+-----+--------+--------+--------+
|   1 | Indore | Male   | Vishal |
|   2 | Mumbai | Female | Komal  |
| 122 | Delhi  | Male   | Amit   |
+-----+--------+--------+--------+
3 rows in set (0.00 sec)


*/