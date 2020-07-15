<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%-- <%@ taglib uri=" %> --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List User</title>
<%@ include file="header.jsp"%>
</head>
<body>
	<%
//scriplet use of JAVA
%>

	<%!//declaration use of JAVA in jsp%>
	<div>
		<a href="add_user"> Add Student </a>
	</div>
	<div>
		<h1>User List</h1>
	</div>
	<c:if test="${!empty users}">
		<table>
			<thead>
				<tr>
					<th>SN</th>
					<th>ID</th>
					<th>Name</th>
					<th>Password</th>
					<th>Gender</th>
					<th>Hobbies</th>
					<th>Email</th>
					<th>Verification Type</th>
					<th>Date OF Birth</th>
					<th>Mobile Number</th>
					<th>Address</th>
					<th>Actions</th>

				</tr>
			</thead>
			<tbody>
				<c:forEach items="${users}" var="user" varStatus="i">
					<tr>
						<td>${i.count}</td>
						<td>${user.id}</td>
						<td>${user.userName}</td>
						<td>${user.password}</td>
						<td>${user.gender}</td>
						<td>${user.hobbies}</td>
						<td>${user.email}</td>
						<td>${user.verificationType}</td>
						<td>${user.dob}</td>
						<td>${user.mobileNo}</td>
						<td>${user.address.cityName},${user.address.countryName}</td>
						<td><a href="edit_user?id=${user.id}">Edit</a><a
							href="delete_user?id=${user.id}">Delete</a></td>
					</tr>


				</c:forEach>
			</tbody>
		</table>
	</c:if>


</body>
</html>