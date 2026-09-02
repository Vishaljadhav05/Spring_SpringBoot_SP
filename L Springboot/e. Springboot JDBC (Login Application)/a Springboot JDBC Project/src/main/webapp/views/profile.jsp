<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Profile Page</title>
</head>
<body bgcolor="#c186c2">
	
	<h2>Profile Page</h2>
	
	<h3>Welcome : ${model_student.getName() }</h3>
	<h3>Email : ${model_student.getEmail() }</h3>
	<h3>Gender : ${model_student.getGender() }</h3>
	<h3>City : ${model_student.getCity() }</h3>
</body>
</html>