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

<title>Form Example - 1</title>
</head>
<body class="bg-secondary">

	<div class="container mx-auto" >

		<div class="card mx-auto px-4" style="margin-top:80px; width: 70%">
			<div class="card-body">

				<h4 class="text-center">Form Example - 1</h4>

				<div>

					<form action="complexFormController" method="post">

						<div class="form-group">
							<label for="name">Enter Name</label> <input type="text"
								class="form-control" id="name" placeholder="Enter Name"
								name="candidateName"> <small
								class="form-text text-muted">Please enter your legal
								name.</small>
						</div>

						<div class="form-group">
							<label for="name">Enter Date of Birth</label> <input type="text"
								class="form-control" id="dob" placeholder="dd/mm/yyyy"
								name="candidateDob"> <small class="form-text text-muted">Please
								enter your date of birth.</small>
						</div>

						<div class="form-group">
							<label for="name">Enter Email</label> <input type="email"
								class="form-control" id="email" placeholder="Enter Email"
								name="candidateEmail"> <small
								class="form-text text-muted">Please enter your email
								address.</small>
						</div>

						<div class="form-group">
							<label for="skills">Skills</label> <select multiple
								class="form-control" id="skills" name="candidateSkills">
								<option value="Core Java">Core Java</option>
								<option value="Spring & Rest Services">Spring & Rest
									Services</option>
								<option value="SpringBoot">SpringBoot</option>
								<option value="Hibernate">Hibernate</option>
								<option value="JSP, Servlets & Beans">JSP, Servlets &
									Beans</option>
								<option value="Angular">Angular</option>
								<option value="React">React</option>
								<option value="Python">Python</option>
							</select>
						</div>

						<div class="form-group">
							<label for="gender">Gender</label>
							<div class="custom-control custom-radio">
								<input type="radio" id="male" value="Male" name="candidateGender"
									class="custom-control-input"> <label
									class="custom-control-label" for="male">Male</label>
							</div>
							<div class="custom-control custom-radio">
								<input type="radio" id="female" value="Female" name="candidateGender"
									class="custom-control-input"> <label
									class="custom-control-label" for="female">Female</label>
							</div>
						</div>

						<div class="from-group">
							<label for="employmentType">Employment Type</label> <select
								class="custom-select" name="employmentType">
								<option value="Full-Time">Full-Time</option>
								<option value="Part-Time">Part-Time</option>
							</select>
						</div>

						<div class="text-center mt-4">
							<button type="submit" class="btn btn-primary">Submit</button>
						</div>
					</form>

				</div>

			</div>
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