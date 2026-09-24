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
		
		<%
			int current_page= (int) request.getAttribute("model_currentPage");
			if(current_page > 1)
			{
				%>
					<a href="/products?page=<%=current_page-1%>"  style="color: Blue; font-size: 50px;" >Previous</a>
				
				<%
			}
		
		
		%>
		
		
		
		<%
			int total_pages = (int) request.getAttribute("model_totalPages");
			for(int i = 1;i<=total_pages;i++)
			{
				%>
					<a href="/products?page=<%=i%>"  style="color: Blue; font-size: 50px;"><%= i %></a>
				<%
			}
		
		%>
		
		
		<%
			
			if(current_page < total_pages)
			{
				%>
					<a href="/products?page=<%=current_page+1%>"  style="color: Blue; font-size: 50px;" >Next</a>
				
				<%
			}
		
		
		%>
	
	</div>
</body>
</html>