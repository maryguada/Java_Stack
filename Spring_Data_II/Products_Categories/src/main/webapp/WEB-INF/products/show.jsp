<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Show Page  </title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

</head>
<body>
	<div class = "container"> 
	
	<h1> <c:out value="${product.name }" /> </h1>
	
	
	<div class ="row"> 
		<div class ="col"> 
		<h2> Categories </h2>
			<c:forEach items = "${product.categories }" var= "cat"> 
				<li><c:out value = "${cat.name }" ></c:out></li>
			</c:forEach>
		</div>
		
		<div class ="col"> 
			<h5>Add Categories </h5>
			<form:form action ="/addCategory" method="post" modelAttribute="middleTableObj">
				<form:select path ="category">
					<c:forEach items = "${allCats}" var ="cat">
						<form:option value = "${cat.id }">
							<c:out value = "${cat.name }" ></c:out>
						</form:option>
				
					</c:forEach>
				
				</form:select>
			
			</form:form>
		</div>
	
	</div>
	
	</div>
	
</body>
</html>