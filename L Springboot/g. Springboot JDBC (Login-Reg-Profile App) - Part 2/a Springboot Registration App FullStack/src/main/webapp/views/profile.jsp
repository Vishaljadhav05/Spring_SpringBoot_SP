<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>profile</title>
		<link rel="stylesheet" type="text/css" href="/css/style.css" />
	</head>
	<body >
			
		<div class="body_div" >
		
			<h2>Profile Page</h2>
		
		<h3>Welcome : ${session_name }</h3>
		<h3>Email : ${session_email }</h3>
		<h3>Gender : ${session_gender}</h3>
		<h3>City : ${session_city }</h3>
		
		</div>	
		
	</body>
</html>