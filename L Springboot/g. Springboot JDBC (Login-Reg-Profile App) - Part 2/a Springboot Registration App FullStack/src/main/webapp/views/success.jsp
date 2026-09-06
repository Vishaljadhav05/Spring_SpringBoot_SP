<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page  %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Success Page</title>
		<link rel="stylesheet" type="text/css" href="/css/style.css" />
	</head>
<body >

	<div class="body_div">
		<h3 class="body_text_title" style="color: Green; text-align: center; padding:5px; background-color:412D15;">${model_message}</h3>
		
		<jsp:include page="${model_pagename}.jsp" />
		
	</div>
	
</body>
</html>