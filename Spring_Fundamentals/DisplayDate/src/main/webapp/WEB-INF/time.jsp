<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<h1>
			<fmt:formatDate type="time" timeStyle="short" value="${time}"/>
		</h1>
	</div>
    <script type="text/javascript" src="js/time.js"></script>
</body>
</html>