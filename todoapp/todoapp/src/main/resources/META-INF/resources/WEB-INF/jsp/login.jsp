<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="webjars/bootstrap/5.2.3/css/bootstrap.min.css">
<title>Login</title>
</head>
<body>

	<div class="container">

		<form method="post">
			<div class="d-block w-50 m-auto mt-5 p-5 border border-primary rounded-3">
				<h1 class="text-primary">Login</h1>
				<input type="text" name="name" class="mt-4 form-control"
					placeholder="Username" /> <input type="password" name="password"
					class="mt-3 form-control" placeholder="Password" /> <input
					type="submit" class="mt-3 btn btn-primary" />
			</div>

		</form>
	</div>



	<script type="text/javascript"
		src="webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="webjars/jquery/3.6.4/jquery.min.js"></script>
</body>
</html>