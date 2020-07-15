<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix = "fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Update Form</title>
</head>
<body>
<div>
	<form action="update_student" method="post">
		<fieldset>
		<legend> Student Update Form</legend>
			<div>
				<label> Id</label>
				<input type ="text" name="id" readonly="readonly" value= "${student.id}">
			</div>
			<div>
				<label>Student Name</label>
				<input type ="text" name="userName" value= "${student.studentName}">
			</div>
			<div>
				<label> Email</label>
				<input type ="email" name="email" value= "${student.email}">
			</div>
			<div>
				<label>Mobile Number</label>
				<input type ="number" name="mobileNumber" value= "${student.mobileNumber}">
			</div>
			<div>
				<label>Date of Birth</label>
				<input type ="date" name="dob" value= "${student.dob}">
			</div>

			<div>
				<label> Documents</label>
				<input type ="checkbox" name="documents" value="SOP"
				<c:if test="${fn:contains(student.documents, 'SOP')}">checked</c:if>
				> SOP
				<input type ="checkbox" name="documents" value="SAT"
				<c:if test="${fn:contains(student.documents, 'SAT')}">checked</c:if>
				> SAT
				<input type ="checkbox" name="documents" value="TOEFL"
				<c:if test="${fn:contains(student.documents, 'TOEFL')}">checked</c:if>
				> TOEFL
				<input type ="checkbox" name="documents" value="Transcript"
				<c:if test="${fn:contains(student.documents, 'Transcript')}">checked</c:if>
				> Transcript
				<input type ="checkbox" name="documents" value="Certificates"
				<c:if test="${fn:contains(student.documents, 'Certificates')}">checked</c:if>
				> Certificates
			</div>
			
			<div>
			<label> Verification Type</label>
				<select name = "verificationType">
				<option value="Citizenship"${student.verificationType=='Citizenship'?'selected':''}>Citizenship</option>
				<option value="Passport"${student.verificationType=='Passport'?'selected':''}> Passport </option>
				<option value = "SSN"${student.verificationType=='SSN'?'selected':''}> SSN </option>
				</select>
			 </div>
			 
			 <div>
			<label>Process Status</label>
				<select name = "processStatus">
				<option value="Incomplete Documents"${student.verificationType=='Incomplete Documents'?'selected':''}>Incomplete Documents</option>
				<option value="Waiting for Approval"${student.verificationType=='Waiting for Approval'?'selected':''}> Waiting for Approval </option>
				<option value = "Admission Approved"${student.verificationType=='Admission Approved'?'selected':''}> Admission Approved </option>
				</select>
			 </div>
			
			<div>
			<label style="font-weight: bold;">Address</label>
			
			<div>
			<label>City Name</label>
			<input type ="text" name="address.cityName" value= "${student.address.cityName}">
			</div>
			<div>
				<label>Country Name</label>
				<input type ="text" name="address.countryName" value= "${student.address.countryName}">
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