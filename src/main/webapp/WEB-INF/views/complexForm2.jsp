<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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

<title>From Example - 2</title>
</head>
<body class="bg-secondary">

	<div class="container mx-auto">

		<div class="card mx-auto px-4" style="margin-top: 80px; width: 70%">
			<div class="card-body">

				<h4 class="text-center">Form Example - 2</h4>
				
				<form:errors path="person.*"/>

				<div>

					<form action="handleComplexForm2" method="post">

						<!-- 		
						public class Person {
						
						private Long contact;
						private String name;
						private String email;
						private List<String> languages;
						private Address address;
						
						}
						
						public class Address {

						private String city;
						private String street;
						private Long zip;
						
						} -->

						<div class="form-group">
							<label for="contact">Enter Contact</label> <input type="tel"
								class="form-control" id="contact" placeholder="Enter Contact"
								name="contact"> <small class="form-text text-muted">Please
								enter your contact number.</small>
						</div>

						<div class="form-group">
							<label for="name">Enter Name</label> <input type="text"
								class="form-control" id="name" placeholder="Enter Name"
								name="name"> <small class="form-text text-muted">Please
								enter your legal name.</small>
						</div>

						<div class="form-group">
							<label for="email">Enter Email</label> <input type="email"
								class="form-control" id="email" placeholder="Enter Email"
								name="email"> <small class="form-text text-muted">Please
								enter your email address.</small>
						</div>

						<div class="form-group">
							<label for="languages">Languages</label> <select multiple
								class="form-control" id="languages" name="languages">
								<option value="English">English</option>
								<option value="Hindi">Hindi</option>
								<option value="Urdu">Urdu</option>
								<option value="Marathi">Marathi</option>
								<option value="French">French</option>
								<option value="German">German</option>
							</select>
						</div>

						<h5 class="card-title text-center mt-4">Postal Address</h5>

						<div class="card mt-4">

							<div class="card-body">

								<div class="form-group">
									<label for="city">Enter City</label> <input type="text"
										class="form-control" id="city" placeholder="Enter City"
										name="address.city"> <small class="form-text text-muted">Please
										enter city name.</small>
								</div>

								<div class="form-group">
									<label for="street">Enter Street</label> <input type="text"
										class="form-control" id="street" placeholder="Enter Street"
										name="address.street"> <small class="form-text text-muted">Please
										enter street.</small>
								</div>

								<div class="form-group">
									<label for="zip">Enter ZIP</label> <input type="text"
										class="form-control" id="zip" placeholder="Enter ZIP"
										name="address.zip"> <small class="form-text text-muted">Please
										enter zip code.</small>
								</div>

							</div>

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