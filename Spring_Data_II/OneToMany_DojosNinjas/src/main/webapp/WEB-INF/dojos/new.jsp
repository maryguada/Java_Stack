<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title> Create A New Dojo </title>
	<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
	
</head>
<body>

	<div class ="container">
	
		<h1> Create A New Dojo </h1>
		
		<form:form action = "/dojo/new" method ="post" modelAttribute = "newDojoObj" >
		
		
			<p>
			<form:errors path ="name"/>
			<form:label path= "name" > Name </form:label>
			<form:input path="name" class = "form-control col-6" />
			</p>
			
			<input type ="submit" value ="Create Dojo" class = "btn-btn-secondary" />
		</form:form>
	
	</div>

	
</body>
</html>