<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Employee Management System</title>
    <style>
    	
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
        }
        
        header {
            background-color: #333;
            color: #fff;
            padding: 20px;
            text-align: center;
        }
        
        h1 {
            margin: 0;
        }
        
        .container {
            max-width: 800px;
            margin: 20px auto;
            padding: 0 20px;
        }
        
        .button-container {
            display: flex;
            justify-content: space-between;
            margin-top: 40px;
        }
        
        .button {
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
            transition: background-color 0.3s, transform 0.3s;
        }
        
        .button:hover {
            background-color: #45a049;
            transform: scale(1.05);
        }
        
        footer {
            background-color: #333;
            color: #fff;
            text-align: center;
            padding: 20px 0;
            position: fixed;
            bottom: 0;
            width: 100%;
        }
    	
    </style>
</head>
<body>
    <header>
        <h1>Employee Management System</h1>
    </header>
    
    
    
    <div class="container">
        <div class="button-container">
            <button class="button"><a href="views/user-form.jsp" style="text-decoration: none; color: inherit;">Create Employee</a></button>
            <button class="button"><a href="<%=request.getContextPath() %>/read" style="text-decoration: none; color: inherit;">Show all employees</a></button>
            <button class="button"><a href="views/delete-update.jsp" style="text-decoration: none; color: inherit;"> Delete / Update Employee</a></button>

        </div>
    </div>
    <div>
    	
    </div>
    <footer>
        <p>&copy; 2024 Employee Management System. All rights reserved.</p>
    </footer>
</body>
</html>
