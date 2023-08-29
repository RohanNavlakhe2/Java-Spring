<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="webjars/bootstrap/5.2.3/css/bootstrap.min.css">
<title>Add Todo</title>
</head>
<body>
	<div class="container">
		 
		    <h2 class="text-primary mt-4">Add Todo</h2>

			<form:form class="p-5 border border-primary rounded-3 mt-5 w-50 m-auto" 
			 method="post" modelAttribute="todo">

				<div class="form-group">
					<label for="title">Title</label> 
					<form:input type="text"
						class="form-control mt-2" id="title" placeholder="Enter title"
						   path="title"/>
					 
				</div>

				<div class="form-group mt-3">
					<label for="description">Description</label>
					 <form:input type="text"
						class="form-control mt-2" id="description"
						placeholder="Enter description" 
						 path="description"/>
					 
				</div>
				
				<form:input type="text" path="id"/>
				<form:input type="text" path="completed"/>
				

				<button type="submit" class="btn btn-primary mt-3">Submit</button>
				
				<h5 class="text-danger mt-2">${error}</h5>
			</form:form>
	</div>

	<script type="text/javascript"
		src="webjars/bootstrap/5.2.3/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="webjars/jquery/3.6.4/jquery.min.js"></script>
</body>
</html>