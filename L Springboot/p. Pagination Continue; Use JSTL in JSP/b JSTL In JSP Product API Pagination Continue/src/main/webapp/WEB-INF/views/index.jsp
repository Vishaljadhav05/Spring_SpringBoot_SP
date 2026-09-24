<%@page import="in.main.beans.Products"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
			<%-- 
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
				
			 --%>
				
				<c:forEach var="productList" items="${listOfProducts}">
					<tr>
						<td> ${productList.getId()} </td>
						<td> ${productList.getTitle()} </td>
						<td> ${productList.getPrice()} </td>
						<td> <img src ="${productList.getThumbnail()}"  alt="" width="100"/>  </td>
					</tr>
				
				</c:forEach>
	
			
		</table>
		
		<%-- 
		
		<%
			int current_page= (int) request.getAttribute("model_currentPage");
			if(current_page > 1)
			{
				%>
					<a href="/products?page=<%=current_page-1%>"  style="color: Blue; font-size: 50px;" >Previous</a>
				
				<%
			}
		
		
		%>
		
		 --%>
		
		<c:if test="${model_currentPage > 1}">
			<a href="/products?page=${model_currentPage-1}"  style="color: Blue; font-size: 50px;">Previous</a>
		</c:if>
		
		<%--  
		
		<%
			int total_pages = (int) request.getAttribute("model_totalPages");
			for(int i = 1;i<=total_pages;i++)
			{
				%>
					<a href="/products?page=<%=i%>"  style="color: Blue; font-size: 50px;"><%= i %></a>
				<%
			}
		
		%>
		 
		 --%>
		<c:forEach var="pageNo" begin="1" end="${model_totalPages}" >
			<a href="/products?page=${pageNo}"  style="color: Blue; font-size: 50px;">${ pageNo }</a>
		</c:forEach>
		
		<%--
		 
		<%
			
			if(current_page < total_pages)
			{
				%>
					<a href="/products?page=<%=c1%>"  style="color: Blue; font-size: 50px;" >Next</a>
				
				<%
			}
		
		%>
		
		--%>
		
		<c:if test="${model_currentPage < model_totalPages}">
			<a href="/products?page=${model_totalPage+1}"  style="color: Blue; font-size: 50px;">Next</a>
		</c:if>
	
	</div>
</body>
</html>