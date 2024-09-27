<%@page import="entities.User" %>
<%@page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>

<title>Show details</title>
</head>
<body>
<style>
	    body {
        font-family: Arial, sans-serif;
        margin: 0;
        padding: 0;
        background-color: #f4f4f4; /* Light gray */
    }
    
    table {
        border-collapse: collapse;
        width: 80%;
        margin: 20px auto;
    }
    
    th, td {
        border: 1px solid #dddddd;
        padding: 10px;
        text-align: left;
    }
    
    th {
        background-color: #333333; /* Dark gray */
        color: #ffffff; /* White */
    }
    
    tr:nth-child(even) {
        background-color: #f2f2f2; /* Lighter gray */
    }
	
</style>

	<table border="1" cellspacing="0" cellpadding="10" width="80%">
		<tr>
			<th>Id</th> 
			<th>Name</th>
			<th>Position</th>
			<th>Phone</th>
			<th>Email</th>
			<th>Basic salary</th>
			<th>OT Hours</th>
			<th><span style="text-transform: lowercase;">Final Salary (auto calculate)</span></th>

			
			
		</tr>
			<% ArrayList<User> users = (ArrayList<User>)request.getAttribute("user_list"); 
				
			if (users != null) {
				for(User currentUser : users) { %>
			
					<tr>
						<td><%= currentUser.getId() %>
						<td><%= currentUser.getName() %></td>
						<td><%= currentUser.getPosition() %></td>
						<td><%= currentUser.getPhone() %></td>
						<td><%= currentUser.getEmail() %></td>
						<td><%= currentUser.getBas_salary() %></td>
						<td><%= currentUser.getOt_hours() %></td>
						<td><%= currentUser.finalSalary() %></td>
						
					</tr>
			<% } 
				}%>
	</table>
</body>
</html>
