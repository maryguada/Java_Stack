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
  			<fmt:formatDate pattern="EEEE', the 'dd' of 'MMMM, yyyy" value="${date}" />
		</h1>
	</div>
    <script type="text/javascript" src="js/date.js"></script>
	
</body>
</html>