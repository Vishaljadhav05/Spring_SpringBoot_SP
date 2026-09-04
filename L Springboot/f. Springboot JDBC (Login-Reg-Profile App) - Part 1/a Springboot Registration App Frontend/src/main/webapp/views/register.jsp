<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>register</title>
<link rel="stylesheet" type="text/css" href="/css/style.css" />
</head>

<body>
	<div class="body_div">

		<br>
		<br> <span class="body_text_title">Login Form</span> <br>
		<br><br><br>
		
		<form action="regForm" method="post">
			Name : <input type="text" name="name1"><br><br> 
			Email Id : <input type="text" name="email1"><br><br> 
			Password : <input type="password" name="pass1"><br><br> 
			Gender : <input type="radio" name="gender1" value="Male"> Male <input type="radio" name="gender1" value="Female"> Female<br><br> 
			City : <select>
						<option>Select City</option>
						<option value="Delhi">Delhi</option>
						<option value="Pune">Pune</option>
						<option value="Mumbai">Mumbai</option>
						<option value="Bhopal">Bhopal</option>
						<option value="Ujjain">Ujjain</option>
						<option value="Indore">Indore</option>
			
					</select>
			
			<br><br> 
			<input type="submit" value="Register">
		</form>
	</div>
</body>
</html>