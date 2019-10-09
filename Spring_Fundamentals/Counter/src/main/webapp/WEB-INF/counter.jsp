<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
</head>
<body>
	<h1>You have visited <a href="http://localhost:8080/">http://localhost:8080/</a> <c:out value="${count}"/> times.</h1>
	<a href="http://localhost:8080/"><h1>Take another visit?</h1></a>
</body>
</html>