<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="resources/bootstrap/css/bootstrap.min.css" />
<script type="text/javascript" src="resources/jquery.js"></script>
<script type="text/javascript"
	src="resources/bootstrap/js/bootstrap.min.js"></script>
<title></title>
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-inverse bg-dark">
		<a class="navbar-brand" href="admin_home">Admin Home</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link" href="choose">Project
						Home</a></li>
				<li class="nav-item"><a class="nav-link"
					href="list_student_for_admin">Students</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> ${username} </a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<a class="dropdown-item" href="student_profile">Profile</a> <a
							class="dropdown-item" href="reset_password_for_admin">Change
							password</a>
						<div class="dropdown-divider"></div>
						<a class="dropdown-item" href="logout_admin">Logout</a>
					</div></li>

				<!--  <li class="nav-item">
        <a class="nav-link disabled" href="#">Disabled</a>
      </li> -->

			</ul>

			<!-- <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form> -->


		</div>
	</nav>
</body>
</html>