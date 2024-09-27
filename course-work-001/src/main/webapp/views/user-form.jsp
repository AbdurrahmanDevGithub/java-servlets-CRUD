<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="layouts/form-css.css">
<title>Insert title here</title>

</head>
<body>
	<h2>Create new user</h2>
	
	<form action="<%=request.getContextPath() %>/create" method="POST">
		<label> employee Name: </label>
		<input type="text" name="name" id="name" required><br><br>
		<label> Position: </label>
		<input type="text" name="position" id="position" required><br><br>
		<label> Phone: </label>
		<input type="text" name="phone" id="phone" required><br><br>
		<label> Email: </label>
		<input type="text" name="email" id="email" required><br><br>
		<label> Basic Salary: </label>
		<input type="text" name="bsalary" id="bsalary" required><br><br>
		<label> OT Hours: </label>
		<input type="text" name="othours" id="othours" required><br><br>
	
		<button type="submit">ADD Employee</button>
	</form>
</body>
</html>