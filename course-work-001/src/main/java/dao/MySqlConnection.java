package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySqlConnection implements DbConnector {

	@Override
	public Connection connectDB() {
		try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://127.0.0.1:3306/CourseWork_1";
            String un = "root";
            String pw = "1234";
            
            Connection con = DriverManager.getConnection(url,un,pw);
            return con;
        } catch (Exception e) {
            System.out.print("Could not connect to the database");
            e.printStackTrace(); // Print the exception for debugging
            return null;
        }
	}
	
}
