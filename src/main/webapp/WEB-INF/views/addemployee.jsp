<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!doctype html>
<html lang="en">
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<title>Add Employee Page</title>
</head>
<body class="container mt-3">

	<h4 class="text-center mt-4">Employee Registration Form</h4>

	<form action="registeremployee" method="post">
	
		<div class="form-group">
			<label for="employeeEmail">Email</label> <input
				type="email" class="form-control" id="employeeEmail"
				aria-describedby="emailHelp" placeholder="Enter Email" name="employeeEmail">
		</div>

		<div class="form-group">
			<label for="employeeName">Username</label> <input
				type="text" class="form-control" id="employeeName"
				aria-describedby="emailHelp" placeholder="Enter Name" name="employeeName">
		</div>
		
		<div class="form-group">
			<label for="employeePassword">Password</label> <input
				type="password" class="form-control" id="employeePassword"
				aria-describedby="emailHelp" placeholder="Enter Password" name="employeePassword">
		</div>
		<div class="text-center">
		<button type="submit" class="btn btn-success">Sign Up</button>
		</div>
	</form>

	<!-- Optional JavaScript -->
	<!-- jQuery first, then Popper.js, then Bootstrap JS -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>
</html>