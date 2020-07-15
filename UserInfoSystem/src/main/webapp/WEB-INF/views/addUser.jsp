<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Registration Form</title>
<%@ include file="header.jsp"%>
</head>
<body>
	<div>
		<form action="save_user" method="post">
			<fieldset>
				<legend> User Registration Form</legend>
				<div>
					<label> User Name</label> <input type="text" name="userName">
				</div>
				<div>
					<label> Email</label> <input type="text" name="email">
				</div>
				<div>
					<label> Password</label> <input type="password" name="password">
				</div>
				<div>
					<label> Mobile Number</label> <input type="number" name="mobileNo">
				</div>

				<div>
					<label> Gender</label> <input type="radio" name="gender"
						value="Male"> Male <input type="radio" name="gender"
						value="Female"> Female
				</div>


				<div>
					<label> Hobbies</label> <input type="checkbox" name="hobbies"
						value="Reading"> Reading <input type="checkbox"
						name="hobbies" value="Playing"> Playing
				</div>
				<div><label>Verification Type</label>
					<select name="verificationType">
						<option value="Citizenship">Citizenship</option>
						<option value="Passport ">Passport</option>
						<option value="SSN">SSN</option>
					</select>

				</div>








				<div>
					<label> DOB</label> <input type="date" name="dob">
				</div>
				<div>
					<div>
						<label style="font-weight: bold;">Address</label><br> <label>
							City Name</label> <input type="text" name="address.cityName">
					</div>
					<div>
						<label> Country Name </label> <input type="text"
							name="address.countryName">
					</div>
				</div>

				<div>
					<input type="submit" value="Submit">
				</div>

			</fieldset>
		</form>
	</div>
</body>
</html>