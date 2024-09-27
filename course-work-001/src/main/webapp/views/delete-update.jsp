<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="entities.User" %>
<%@page import="java.util.ArrayList" %>

<!DOCTYPE html>
<html>
<head>
<style>
body {
    font-family: Arial, sans-serif;
    margin: 0;
    padding: 0;
    background-color: whitesmoke;
}

h2 {
    text-align: center;
    margin-top: 50px;
}

.container {
    width: 100%;
    padding: 20px;
    box-sizing: border-box;
}

form {
    max-width: 400px;
    margin: 0 auto;
    background-color: white;
    padding: 20px;
    border-radius: 8px;
    box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
}

label {
    font-weight: bold;
}

input[type="text"] {
    width: calc(100% - 20px);
    padding: 8px;
    margin-bottom: 10px;
    border: 1px solid lightgray;
    border-radius: 4px;
}

button[type="submit"] {
    background-color: #4CAF50;
    border: none;
    color: white;
    padding: 15px 32px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    margin: 4px 2px;
    cursor: pointer;
    border-radius: 8px;
    width: 100%;
}

button[type="submit"]:hover {
    background-color: #45a049;
}


</style>

<meta charset="ISO-8859-1">
<title>Delete&update</title>
</head>
<body>
	<form action="<%=request.getContextPath() %>/delete" method="POST">
		<label> Employee Id: </label>
		<input type="text" name="id" id="id" required><br><br>
		<button type="submit">Delete this employee</button>
	</form>
	
	
	<h2>Update Employee</h2>
	
	<form action="<%=request.getContextPath() %>/update" method="POST">
		<label> Employee Id: </label>
		<input type="text" name="id" id="id" required><br><br>
		<label> Employee Name: </label>
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
	
		<button type="submit">Update the details of this Employee</button>
	</form>
</body>
</html>