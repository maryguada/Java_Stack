<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> New Product </title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

</head>
<body>
	<div class = "container"> 
	
	<h1> New Category </h1>
	<form:form action = "categories/new" method = "post" modelAttribute="newCategoryObj"> 
		<form:label path ="name" />
		<form:input path ="name" class = "form-control col-6" />
	
		<input type = "submit" value = "Create Category" class = "btn btn-primary" />
	</form:form>
	
	</div>
</body>
</html>