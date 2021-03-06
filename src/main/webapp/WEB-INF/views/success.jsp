<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
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

<title>Contact Us Page</title>
</head>
<body class="container mt-3">

	<%
		
	%>

	<div class="container">

		<div class="alert alert-success text-center" role="alert">
			<h5>Hello ${username} ${employee.employeeName}
				${candidate.candidateName} ${person.name }</h5>
			<h4>Thanks for registering with us!!!!</h4>
			<br>
			<h5>Your Email is : ${employee.employeeEmail}
				${candidate.candidateEmail} ${person.email}</h5>
			<h5>Your Date of Birth : ${employee.employeeEmail}
				${candidate.candidateDob}</h5>
			<h5>Your Selected Skills : ${employee.employeeEmail}
				${candidate.candidateSkills}</h5>
			<h5>Your Gender : ${employee.employeeEmail}
				${candidate.candidateGender}</h5>
			<h5>Preferred Employment Mode : ${employee.employeeEmail}
				${candidate.employmentType}</h5>
			<h5>Preferred Employment Mode : ${employee.employeeEmail}
				${candidate.employmentType}${person.address.city}</h5>
			<h5>${person.address.street}</h5>
			<h5>${person.address.zip}</h5>

		</div>

	</div>

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