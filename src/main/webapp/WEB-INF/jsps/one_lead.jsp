<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead</title>
</head>
<body>
<h2>Lead Details</h2>
<pre>
	First Name:${lead.firstName}
	Last Name:${lead.lastName}
	Source:${lead.source}
	Email:${lead.email}
	Mobile:${lead.mobile}
</pre>
<form action="convertLead">
	<input type="hidden" value="${lead.id}" name="id" />
	<input type="submit" value="convert" />
</form>


</body>
</html>