
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color: yellow;">
	<h3> Login Page </h3>
	
	<form action="<c:url value='/login' " method="post">
		Username : <input type="text" name="username" /> <br/> <br/>
		Password : <input type="password" name="password" /> <br/> <br/>
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
		<input type="submit" value="Login" />
	</form>
</body>
</html>
