<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lead page</title>
</head>
<body>
<h2>Create Lead</h2>
<form action="saveLead">
	<pre>
		First Name<input type="text" name="firstName" />
		Last Name<input type="text" name="lastName" />
		Source<select name="source" >
				  <option value="news">News Paper</option>
				  <option value="online">Online</option>
				  <option value="radio">Radio</option>
				  <option value="tv">TV</option>
			 </select>
		Email<input type="email" name="email" />	 
		Mobile<input type="number" name="mobile" />	
		<input type="submit" value="save" />
		${msg}
	</pre>
</form>

</body>
</html>