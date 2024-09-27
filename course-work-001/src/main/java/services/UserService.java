package services;

import java.sql.SQLException;
import java.util.List;

import dao.UserDAO;
import entities.User;

public class UserService implements Service<User> {

	@Override
	public boolean create(User t) {
		try{
			return UserDAO.newEmployee(t);
		}catch(Exception e) {
			return false;
		}
		
	}
	
	@Override
	public boolean update(int id, User user) {
		try {
			return UserDAO.updateEmployee(id,user);
		}catch(Exception e) {
			return false;
		}
	}

	@Override
	public boolean delete(int id) {
		try{
			return UserDAO.delete(id);
		}catch(Exception e) {
			return false;
		}
		
	}

	@Override
	public List<User> getAll(){
		try{
			return UserDAO.getAllEmployee();
		}catch(Exception e) {
			return null;
		}
		
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
