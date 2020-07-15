<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Edit Form<%@ include file="header.jsp"%></title>
</head>
<body>
	<div>
		<form action="update_user" method="post">
			<fieldset>
				<legend> User Edit Form</legend>
				<div>
					<label> User ID</label> <input type="text" name="id"
						readonly="readonly" value="${user.id}">
				</div>
				<div>
					<label> User Name</label> <input type="text" name="userName"
						value="${user.userName}">
				</div>
				<div>
					<label> Email</label> <input type="text" name="email"
						value="${user.email}">
				</div>
				<div>
					<label> Password</label> <input type="password" name="password"
						value="${user.password}">
				</div>
				<div>
					<label> Mobile Number</label> <input type="number" name="mobileNo"
						value="${user.mobileNo}">
				</div>

				<div>
					<label> Gender</label> <input type="radio" name="gender"
						value="Male" ${user.gender=='Male'?'checked':''}> Male <input
						type="radio" name="gender" value="Female"
						${user.gender=='Female'?'checked':''}> Female
				</div>


				<div>
					<label> Hobbies</label> <input type="checkbox" name="hobbies"
						value="Reading"
						<c:if test="${fn:contains(user.hobbies, 'Reading')}">checked</c:if>>
					Reading <input type="checkbox" name="hobbies" value="Playing"
						<c:if test="${fn:contains(user.hobbies, 'Playing')}">checked</c:if>>
					Playing
				</div>
				<div>
					<label>Verification Type</label> <select name="verificationType">
						<option value="Citizenship"
							${user.verificationType=='Citizenship'?'selected':''}>Citizenship</option>
						<option value="Passport "
							${user.verificationType=='Passport'?'selected':''}>Passport</option>
						<option value="SSN" ${user.verificationType=='SSN'?'selected':''}>SSN</option>
					</select>

				</div>

				<div>
					<label> DOB</label> <input type="date" name="dob"
						value="${user.dob}">
				</div>
				<div>
					<div>
						<label style="font-weight: bold;">Address</label><br> <label>
							City Name</label> <input type="text" name="address.cityName"
							value="${user.address.cityName}">
					</div>
					<div>
						<label> Country Name </label> <input type="text"
							name="address.countryName" value="${user.address.countryName}">
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