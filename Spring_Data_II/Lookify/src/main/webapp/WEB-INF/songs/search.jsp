<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page isErrorPage="true" %>  

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Search Page Results</title>

<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>

	<div class="container">
	<a href="/dashboard" class="float-right">Dashboard</a>
	<table class="table mt-5">
			<thead>
				<tr>
					<th scope="col">Title</th>
					<th scope="col">Rating</th>
					<th scope="col">Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${song}" var="song">
					<tr>
						<td><a href="/songs/${song.id}"><c:out value="${song.title}" /></a></td>
						<td><c:out value="${song.rating}" /></td>
						
						<td>
							<form:form action="/songs/${song.id}" method="post">
								<input type="hidden" name="_method" value="delete" /> 
								<input type="submit" class="btn btn-danger" value="Delete">
							</form:form>
						</td>
					</tr>
				</c:forEach>

			</tbody>
		</table>
	
	
	
	</div>
</body>
</html>