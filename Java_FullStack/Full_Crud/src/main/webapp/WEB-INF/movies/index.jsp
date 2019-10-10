<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>

	<meta charset="UTF-8">
	<title>All Movies </title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	
</head>
<body>
<div class ="container"> 
	<h1> All Movies </h1>
	<a href ="/createNewMovie"> Add A New Movie </a>
	<table class="table">
  <thead>
    <tr>
     
      <th scope="col">Title </th>
      <th scope="col">Description </th>
      <th scope="col">Language </th>
      <th scope="col"> Actions </th>
    </tr>
  </thead> 
  <tbody>
  
  <c:forEach var="movie" items="${Movies}">
    <tr>
      <th scope="row"><c:out value="${movie.title}" /> </th>
      <td><c:out value="${movie.description}" /></td>
      <td><c:out value="${movie.language}" /></td>
      <td> 
      	<a href ="/movies/${movie.id}/show"> Show </a>
      	<a href ="/movies/${movie.id}/update"> Update </a>
      	<form style = "display: inline-block;" action = "/movies/${movie.id}/delete" method="post">
      		<input type ="hidden" name ="_method" value="delete" />
      		<input type = "submit" value ="Delete" />
      	</form>      
      </td>
     
    </tr>
  </c:forEach>  
  
  </tbody> 
  </table>
  </div>

</body>
</html>