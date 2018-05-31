<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login page</title>
<link href="style.css" rel="stylesheet" type="text/css" />
</head>
<body>

	<sf:form action="doLogin.obj" modelAttribute="credentialsBean">
	
	
		<sf:errors />
		<br />
		<sf:label path="email">Email:</sf:label>
		<sf:input path="email" />
		<br />
		<sf:errors path="email" />
		<br />
		
		
		<sf:label path="password">Password:</sf:label>
		<sf:password path="password" />
		<br />
		<sf:errors path="password" />
		<br />
		
		
		<input type="submit" value="Login" />
		<br />
		
		
	</sf:form>


</body>