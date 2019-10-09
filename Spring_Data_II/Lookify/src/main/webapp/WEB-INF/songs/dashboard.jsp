<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isErrorPage="true"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title> Welcome To Your DashBoard! </title>
	<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
	
	
</head>
<body>

	<div class="container">
	
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="#"> Lookify </a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
				<ul class="navbar-nav mr-auto">
					
					<li class="nav-item"><a class="nav-link" href="/songs/new">Add Song</a></li>
					<li class="nav-item"><a class="nav-link" href="/search/topten">Top Songs</a></li>
					
				</ul>
				
				
				<form  action="/search" class="form-inline my-2 my-lg-0">
					<input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search" name="search">
					<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
				</form>
				
				
			</div>
		</nav>
		
		
		<table class="table mt-5">
			<thead>
				<tr>
					<th scope="col">Title</th>
					<th scope="col">Rating</th>
					<th scope="col">Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${songs}" var="song">
					<tr>
						<td class="text-capitalize"><a href="/songs/${song.id}"><c:out  value="${song.title}" /></a></td>
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