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
<h2>Contact Details</h2>
<pre>
	First Name:${contact.firstName}
	Last Name:${contact.lastName}
	Email:${contact.email}
	Mobile:${contact.mobile}
</pre>
<form action="updateContact">
	<input type="hidden" value="${contact.id}" name="id" />
	<input type="submit" value="update" />
</form>
<form action="billingDetails">
	<input type="hidden" value="${contact.id}" name="id" />
	<input type="submit" value="Generate Bill" />
</form>
</body>
</html>