package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;

import entities.User;

public class UserDAO {
	public static List<User> getAllEmployee() throws SQLException{
		MySqlConnection connector=new MySqlConnection();
		Connection con = connector.connectDB();
		String query="SELECT * FROM Details";
		Statement stmt =con.createStatement();
		ResultSet rs=stmt.executeQuery(query);
		List<User> userList=new ArrayList<>();
		while(rs.next()) {
			User user=new User();
			user.setId(rs.getInt("id"));
			user.setName(rs.getString("name"));
			user.setPosition(rs.getString("position"));
			user.setPhone(rs.getInt("phone"));
			user.setEmail(rs.getString("email"));
			user.setBas_salary(rs.getDouble("bas_salary"));
			user.setOt_hours(rs.getDouble("ot_hours"));
			userList.add(user);
		}
		con.close();
		stmt.close();
		return userList;
	}
	
	public static boolean newEmployee(User user) throws SQLException{
		MySqlConnection connector=new MySqlConnection();
		Connection con = connector.connectDB();
		String query="insert into details(name,position,phone,email,bas_salary,ot_hours)" + "values(?,?,?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(query);
		
		ps.setString(1,user.getName());
		ps.setString(2,user.getPosition());
		ps.setInt(3,user.getPhone());
		ps.setString(4,user.getEmail());
		ps.setDouble(5,user.getBas_salary());
		ps.setDouble(6,user.getOt_hours());
		
		if(ps.executeUpdate()>0) {
			return true;
		}else {
			return false;
		}
		
	}
	public static boolean delete(int id) throws SQLException {
	    MySqlConnection connector = new MySqlConnection();
	    Connection con = connector.connectDB();
	    String query = "DELETE FROM details WHERE id = ?";
	    PreparedStatement stmt = con.prepareStatement(query);
	    
	    
	    stmt.setInt(1, id);
	    
	    int rowsAffected = stmt.executeUpdate();
	    
	    if (rowsAffected > 0) {
	        return true; 
	    } else {
	        return false; 
	    }
	}
	
	public static boolean updateEmployee(int id,User user) throws SQLException{
		MySqlConnection connecter=new MySqlConnection();
		Connection con = connecter.connectDB();
		String query = "UPDATE details SET name=?,position=?,phone=?,email=?,bas_salary=?,ot_hours=? where id=?";
		PreparedStatement ps=con.prepareStatement(query);
		
		ps.setString(1,user.getName());
		ps.setString(2, user.getPosition());
		ps.setInt(3,user.getPhone());
		ps.setString(4,user.getEmail());
		ps.setDouble(5,user.getBas_salary());
		ps.setDouble(6,user.getOt_hours());
		
		
		ps.setInt(7,id);
		int rowsAffected=ps.executeUpdate();
		
		if(rowsAffected>0) {
			
			return true;
		}else {
	        return false;
		}
	}

}
