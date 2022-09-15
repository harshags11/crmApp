<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Billing Details</title>
</head>
<body>
<h2>Verify billing Details</h2>
<pre>
	First Name:${bill.firstName}
	Last Name:${bill.lastName}
	Email:${bill.email}
	Mobile:${bill.mobile}
	Product:${bill.product}
	Amount:${bill.amount}
	
</pre>
</body>
</html>