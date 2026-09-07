package in.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDataJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDataJdbcApplication.class, args);
	}

}


// Output :-

/*

-----> Initially Database <-----


mysql> select * from user;
+--------+------------------+--------+--------+
| name   | email            | gender | city   |
+--------+------------------+--------+--------+
| Vishal | vishal@gmail.com | Male   | Indore |
+--------+------------------+--------+--------+
1 row in set (0.00 sec)

====================================================================================

-----> Database After Adding Users <-----

mysql> select * from user;
+--------+------------------+--------+--------+
| name   | email            | gender | city   |
+--------+------------------+--------+--------+
| Vishal | vishal@gmail.com | Male   | Indore |
| Komal  | komal@gmail.com  | Female | Ujjain |
+--------+------------------+--------+--------+
2 rows in set (0.00 sec)

mysql> select * from user;
+--------+------------------+--------+--------+
| name   | email            | gender | city   |
+--------+------------------+--------+--------+
| Vishal | vishal@gmail.com | Male   | Indore |
| Komal  | komal@gmail.com  | Female | Ujjain |
| Uday   | uday@gmail.com   | Male   | Mumbai |
+--------+------------------+--------+--------+
3 rows in set (0.00 sec)

mysql> select * from user;
+--------+------------------+--------+--------+
| name   | email            | gender | city   |
+--------+------------------+--------+--------+
| Vishal | vishal@gmail.com | Male   | Indore |
| Komal  | komal@gmail.com  | Female | Ujjain |
| Uday   | uday@gmail.com   | Male   | Mumbai |
| Sakshi | sakshi@gmail.com | Female | Delhi  |
+--------+------------------+--------+--------+
4 rows in set (0.00 sec)

====================================================================================

-----> Database After Updating Users <-----

mysql> select * from user;
+---------------+------------------+--------+--------+
| name          | email            | gender | city   |
+---------------+------------------+--------+--------+
| Vishal Jadhav | vishal@gmail.com | Male   | Mumbai |
| Komal         | komal@gmail.com  | Female | Ujjain |
| Uday          | uday@gmail.com   | Male   | Mumbai |
| Sakshi        | sakshi@gmail.com | Female | Delhi  |
+---------------+------------------+--------+--------+
4 rows in set (0.00 sec)

====================================================================================

-----> Database After Deleting Users <-----


mysql> select * from user;
+---------------+------------------+--------+--------+
| name          | email            | gender | city   |
+---------------+------------------+--------+--------+
| Vishal Jadhav | vishal@gmail.com | Male   | Mumbai |
| Komal         | komal@gmail.com  | Female | Ujjain |
| Uday          | uday@gmail.com   | Male   | Mumbai |
+---------------+------------------+--------+--------+
3 rows in set (0.00 sec)

====================================================================================

-----> After Searching Users <-----

			User details
			
		  Name : Komal

	 	  Email : komal@gmail.com

		  Gender : Female

		  City : Ujjain
		  
====================================================================================

-----> After Searching All Users <-----


			All User Details
			
		  Name : Vishal Jadhav

		  Email : vishal@gmail.com

		  Gender : Male

		  City : Mumbai

-------------------------------------------------------------------------------

		  Name : Komal

		  Email : komal@gmail.com

		  Gender : Female

		  City : Ujjain

------------------------------------------------------------------------------

		  Name : Uday

		  Email : uday@gmail.com

		  Gender : Male

		  City : Mumbai
		  
====================================================================================

*/