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
	
	<h1> New Product </h1>
	
	<form:form action = "/products/new" method="post" modelAttribute="newProductObj">
		<p>
		<form:label path ="name"> Name </form:label>
		<form:input path="name" class ="form-control col-6" />
		<form:errors path="name"> </form:errors>
		</p>
		
		<p>
		<form:label path ="description"> Description </form:label>
		<form:input path="description" class ="form-control col-6" />
		<form:errors path="description"> </form:errors>
		</p>
		
		<p>
		<form:label path ="price"> Price </form:label>
		<form:input path="price" class ="form-control col-6" />
		<form:errors path="price"> </form:errors>
		</p>
		
		<input type = "submit" class = "btn btn-primary" value = "Create Product"/>
	</form:form>
	
	
	
	
	</div>
	
	
</body>
</html>