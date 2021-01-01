<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.List"%>
<%@page import="com.spring.model.Student"%>
<%@page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>About Page</title>
<link type="text/css" rel="stylesheet" href="css/stylesheet1.css" />
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>

<script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>
</head>
<body>
	<%
	
		Student student=(Student)request.getAttribute("primaryStudent");
		List<Student> students=(List<Student>)request.getAttribute("students");
	%>
	
	<%
	
		for(Student s:students){
			
			%>

	<div class="card" style="width: 18rem;">

		<div class="card-body">
			<h5 class="card-title"><%=s.getName() %></h5>
			<p class="card-text"><%=s.getId() %>
			</p>
			<a href="#" class="btn btn-primary">Go somewhere</a>
		</div>
	</div>

	<%
			
		}
	
	%>
	


	<div class="card" style="width: 18rem;">

		<div class="card-body">
			
			<h5 class="card-title"><%=student.getName() %></h5>
			<p class="card-text"><%=student.getId() %>
			</p>
			<a href="#" class="btn btn-primary">Go somewhere</a>
		</div>
	</div>
</body>
</html>