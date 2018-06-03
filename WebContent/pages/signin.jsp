<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
		 pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<meta name="description" content="">
	<meta name="author" content="">

	<title>Shop Homepage</title>

	<link href="pages/resources/css/bootstrap.min.css" rel="stylesheet">

	<link href="pages/resources/css/shop-homepage.css" rel="stylesheet">
</head>
<body>

<jsp:include page="template/navigation.jsp" />

<div class="container">

	<div class="row">


        <sf:form action="doLogin.req" modelAttribute="credentialsBean">


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

	</div>

</div>

<jsp:include page="template/footer.jsp" />

<script src="pages/resources/js/jquery-3.3.1.min.js"></script>
<script src="pages/resources/js/bootstrap.bundle.min.js"></script>

</body>

</html>