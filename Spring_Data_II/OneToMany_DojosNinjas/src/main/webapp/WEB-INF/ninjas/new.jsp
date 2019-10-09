<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Create New Ninja </title>
		<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
</head>
<body>
	
	<div class = "container"> 
	
	<h1> Create A New Ninja </h1>
	<form:form action ="/ninja/new" method="post" modelAttribute="newNinjaObj" >
		<p>
		
		<form:label path= "firstName" > First Name </form:label>
		<form:input path="firstName" class = "form-control col-6" />
		<form:errors path ="firstName"/>
		
		</p>
		
		<p>
		
		<form:label path= "lastName" > Last Name </form:label>
		<form:input path="lastName" class = "form-control col-6" />
		<form:errors path ="lastName"/>
		
		</p>	
		
		<p>
		
		<form:label path= "Age" > Age </form:label>
		<form:input path="Age" class = "form-control col-6" />
		<form:errors path ="Age"/>
		
		</p>
		
		
		<p>
		<form:select path="dojo" class = "form-control col-6"> 
			<c:forEach items= "${Dojos}" var="dojo">
			
				<form:option value = "${dojo.id}">
					<c:out value ="${dojo.name }" />  

					</form:option>
				</c:forEach>
			</form:select>
		<input type ="submit" class = "btn btn-secondary" value = "Create New Ninja" />
		</form:form>
		
	</div>
	
</body>
</html>