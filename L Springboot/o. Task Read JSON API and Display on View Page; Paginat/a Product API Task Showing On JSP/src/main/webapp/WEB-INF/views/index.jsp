<%@page import="in.main.beans.Products"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index Page</title>
</head>
<body bgcolor="#7abf84">
	<div style="text-align: center;">
		<table>
			<tr>
				<th> Id </th>
				<th> Title </th>
				<th> Price </th>
				<th> Image </th>
			</tr>
		
				<%
					List<Products> productList = (List<Products>)request.getAttribute("listOfProducts");
					for(Products products : productList)
					{
						%> 
							<tr>
							    <td> <%= products.getId() %> </td>
								<td> <%= products.getTitle() %> </td>
								<td> <%= products.getPrice() %> </td>
								<td> <img src ="<%= products.getThumbnail() %>"  alt="" width="100"/>  </td>
							</tr>
						<% 
					}
				%>
			
		</table>
		
	
	</div>
</body>
</html>