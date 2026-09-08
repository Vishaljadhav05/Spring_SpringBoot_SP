package in.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDataJpaApplication.class, args);
	}

}


// Output:-

/*

----------> Initially Database <----------

mysql> show tables;
Empty set (0.00 sec)

=====================================================================================================================

----------> After Adding User in Database, it will automatically create the table <----------

mysql> select * from user_details;
+---------+-----------+------------------+-------------+-----------+---------------+
| user_id | user_city | user_email       | user_gender | user_name | user_password |
+---------+-----------+------------------+-------------+-----------+---------------+
|       1 | Indore    | vishal@gmail.com | Male        | Vishal    | vishal123     |
|       2 | Mumbai    | komal@gmail.com  | FeMale      | Komal     | komal123      |
|       3 | Bhopal    | uday@gmail.com   | Male        | Uday      | uday123       |
|       4 | Delhi     | sakshi@gmail.com | FeMale      | Sakshi    | sakshi123     |
+---------+-----------+------------------+-------------+-----------+---------------+
4 rows in set (0.00 sec)


=====================================================================================================================

----------> After Updating User in Database<----------


mysql> select * from user_details;
+---------+-----------+-------------------------------+-------------+-----------+---------------+
| user_id | user_city | user_email                    | user_gender | user_name | user_password |
+---------+-----------+-------------------------------+-------------+-----------+---------------+
|       1 | Mumbai    | vishaljadhav.vj8827@gmail.com | Male        | Vishal J  | vishal123     |
|       2 | Mumbai    | komal@gmail.com               | FeMale      | Komal     | komal123      |
|       3 | Bhopal    | uday@gmail.com                | Male        | Uday      | uday123       |
|       4 | Delhi     | sakshi@gmail.com              | FeMale      | Sakshi    | sakshi123     |
+---------+-----------+-------------------------------+-------------+-----------+---------------+
4 rows in set (0.00 sec)

=====================================================================================================================

----------> After Deleting User in Database<----------


mysql> select * from user_details;
+---------+-----------+-------------------------------+-------------+-----------+---------------+
| user_id | user_city | user_email                    | user_gender | user_name | user_password |
+---------+-----------+-------------------------------+-------------+-----------+---------------+
|       1 | Mumbai    | vishaljadhav.vj8827@gmail.com | Male        | Vishal J  | vishal123     |
|       2 | Mumbai    | komal@gmail.com               | FeMale      | Komal     | komal123      |
|       3 | Bhopal    | uday@gmail.com                | Male        | Uday      | uday123       |
+---------+-----------+-------------------------------+-------------+-----------+---------------+
3 rows in set (0.00 sec)


=====================================================================================================================

----------> When We Search for the user <----------

		User details
		
	      Id : 2

	   Name : Komal

	 Email : komal@gmail.com

	  Gender : FeMale

	   City : Mumbai
	   
	   
=====================================================================================================================

----------> When We Search for All the user <----------

		All User Details

	     Name : Vishal J

   	Email : vishaljadhav.vj8827@gmail.com

		Gender : Male

		City : Mumbai
		
-------------------------------------------------------------------------

		 Name : Komal

  	Email : komal@gmail.com

		Gender : FeMale

		City : Mumbai

-------------------------------------------------------------------------

		Name : Uday

	Email : uday@gmail.com

		Gender : Male

		City : Bhopal
		
==============================================================================================

*/