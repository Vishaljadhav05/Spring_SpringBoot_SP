<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add User</title>
</head>
<body bgcolor="#e3c6b8">

	<div style="text-align: center;">
		<h2>Add User</h2>
		<br>

		<form action="addUserForm" method="post">
			Name : <input type="text" name="name1"> <br> <br>
			Email : <input type="text" name="email1"> <br> <br>
			Password : <input type="password" name="pass1"> <br> <br>
			Gender : <input type="radio" name="gender1" value="Male"> Male <input
				type="radio" name="gender1" value="FeMale"> FeMale <br> <br> City
			City : <select name="city1">
				<option value="Null">Select City</option>
				<option value="Delhi">Delhi</option>
				<option value="Pune">Pune</option>
				<option value="Mumbai">Mumbai</option>
				<option value="Bhopal">Bhopal</option>
				<option value="Ujjain">Ujjain</option>
				<option value="Indore">Indore</option>
			</select> <br>
			<br> <input type="submit" value="Add User">
		</form>
	</div>

</body>
</html>