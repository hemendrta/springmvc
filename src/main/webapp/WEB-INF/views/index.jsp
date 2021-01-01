<%@page import="java.util.List"%>
<%@page import="com.spring.model.Student"%>
<%@page isELIgnored="false" %>

<html>
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
<body class="container text-center">
<%
	Student student=(Student)request.getAttribute("student");

%>

<h4>Welcome: <%=student.getName() %></h4>
 

<% 
	
	List<Student> students=(List<Student>)request.getAttribute("students");
	
	for(Student s:students){
		
		%>
		<div class="text-center">
		<div class="card" style="width: 18rem;">
		
		<div class="card-body">
			<h5 class="card-title"><%=s.getName() %></h5>
			<p class="card-text"><%=s.getId() %></p>
			<a href="#" class="btn btn-primary">Go somewhere</a>
		</div>
		</div>
		</div>
		<%
		
	}
	

%>

<!-- Spring expression language -->

${students}
<br>
${students[2]}
</body>
</html>
