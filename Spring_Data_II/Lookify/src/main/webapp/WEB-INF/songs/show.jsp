<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title> Show Song Information </title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div class = "container">
	<h1> Song Information </h1>
	
	<h3> Title: <c:out value = "${song.title}" /> </h3> 
	<h3> Artist: <c:out value = "${song.artist}" /></h3> 
	<h3> Rating: <c:out value = "${song.rating}" /> </h3> 
	
</div>
	
</body>
</html>