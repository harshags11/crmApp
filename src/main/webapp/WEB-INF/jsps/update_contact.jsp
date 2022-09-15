<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Update Here</h1>
<form action="update">
	<pre>
			<input type="hidden" value="${contact.id}" name="id" />
		First Name<input type="text" name="firstName" value="${contact.firstName}"/>
		Last Name<input type="text" name="lastName" value="${contact.lastName}"/>
		Email<input type="email" name="email" value="${contact.email}"/>	 
		Mobile<input type="number" name="mobile" value="${contact.mobile}"/>	
		<input type="submit" value="update" />
	</pre>
</form>
</body>
</html>