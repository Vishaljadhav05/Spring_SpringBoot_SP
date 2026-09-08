<%@page import="java.util.List"%>
<%@page import="in.main.beans.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All User Details</title>
</head>
<body bgcolor="#c5e0e6" >
	<div style ="width:100%; text-align: center;">
	
		<h2>All User Details</h2>
		<hr>
	
		<%
			List <User> user_list = (List) request.getAttribute("model_allusers");
			for(User user:user_list)
			{
				%>
					<b>Name :</b> <% out.println(user.getName()); %><br><br>
					<b>Email :</b> <% out.println(user.getEmail()) ;%><br><br>
					<b>Gender :</b> <% out.println(user.getGender()); %><br><br>
					<b>City :</b> <% out.println(user.getCity()); %><br><br>
					<hr>
				<%
				
			}
		
		%>
	</div>
</body>
</html>