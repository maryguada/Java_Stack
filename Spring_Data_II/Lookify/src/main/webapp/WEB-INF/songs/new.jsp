<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isErrorPage="true"%>



<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title> Add A New Song </title>
	<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
	
</head>
<body>
<div class="container">

		<a href="/dashboard" class="float-right">Dashboard</a>
	
		<h1>New Song</h1>
		<form:form action="/process" method="post" modelAttribute="newSong">
			<p>
				<form:label path="title">Title</form:label>
				<form:errors path="title" />
				<form:input class="form-control mb-2 col-6" path="title" />
			</p>
			<p>
				<form:label path="artist">Artist</form:label>
				<form:errors path="artist" />
				<form:input class="form-control mb-2 col-6" path="artist" />
			</p>
			<p>
				<form:label path="rating">Rating</form:label>
				<form:errors path="rating" />
				<form:select class="form-control mb-2 col-6" path="rating" >
					<option>1</option>
					<option>2</option>
					<option>3</option>
					<option>4</option>
					<option>5</option>
					<option>6</option>
					<option>7</option>
					<option>8</option>
					<option>9</option>
					<option>10</option>
				</form:select>
					
			</p>

			<input type="submit" value="Submit" class="btn btn-info" />
		</form:form>
	
	
	
	
	</div>

	
</body>
</html>