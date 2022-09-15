<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>  <%@ include file="search.jsp" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contacts</title>
</head>
<body>
<h2>Contact details</h2>
<table>
	<tr>
		<th>Id</th>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Email</th>
		<th>Mobile</th>
	</tr>
	
<c:forEach var="contact" items="${contact}">
	<tr>
		<td>${contact.id}</td>
		<td><a href="getOneConatct?id=${contact.id}">${contact.firstName}</a></td>
		<td>${contact.lastName}</td>
		<td>${contact.email}</td>
		<td>${contact.mobile}</td>
	</tr>

</c:forEach>
</table>
</body>
</html>