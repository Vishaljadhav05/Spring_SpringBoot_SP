<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Details</title>
</head>
<body bgcolor="#c5e0e6" >
	<div style ="width:100%; text-align: center;">
	
		<h2>User details</h2>
		Id : ${model_user.getId()} <br> <br>
		Name : ${model_user.getName()}<br><br>
		Email : ${model_user.getEmail()}<br><br>
		Gender : ${model_user.getGender()}<br><br>
		City : ${model_user.getCity()}<br><br>
	</div>
</body>
</html>