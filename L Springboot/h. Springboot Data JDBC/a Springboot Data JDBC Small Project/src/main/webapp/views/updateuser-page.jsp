<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update User</title>
</head>
<body bgcolor="#c5e0e6" >
	<div style ="width:100%; text-align: center;">
	
		<h2>Update User</h2>
	
		<form action="updateUserForm" method="post">
			Name : <input type= "text" name="name1"> <br><br>
			Email : <input type="text" name= email1><br><br>
			Gender : <input type="text" name = gender1><br><br>
			City : <select name="city1">
						<option value="Null">Select City</option>
						<option value="Delhi">Delhi</option>
						<option value="Pune">Pune</option>
						<option value="Mumbai">Mumbai</option>
						<option value="Bhopal">Bhopal</option>
						<option value="Ujjain">Ujjain</option>
						<option value="Indore">Indore</option>
			
					</select>
				<br><br>	
			<input type="submit" value="Update User">
		</form>
	</div>

</body>
</html>