package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import services.UserService;

import java.io.IOException;
import java.util.List;

import entities.User;

/**
 * Servlet implementation class Controller
 */
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String complete_url=request.getRequestURI();
		String domain=request.getContextPath();
		String action=complete_url.substring(domain.length());
		
		if(action.equals("/create")) {
			createPage(request,response);
			
		}else if(action.equals("/read")) {
			readEmployee(request,response);
		}else if(action.equals("/delete")) {
			deletePage(request,response);
		}else if(action.equals("/update")) {
			updatePage(request,response);
		}
	}
	
	
	
	public void createPage(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("views/user-form.jsp").forward(request,response);
	}
	
	public void deletePage(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("views/delete.jsp").forward(request,response);
	}
	public void updatePage(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("views/update.jsp").forward(request,response);
	}
	
	public void readEmployee(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		List<User> userList=new UserService().getAll();
		request.setAttribute("user_list",userList);
		request.getRequestDispatcher("views/user-list.jsp").forward(request,response);
	}
	
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getRequestURI().substring(request.getContextPath().length());
		if(action.equals("/create")) {
			createEmployee(request,response);
		}else if(action.equals("/delete")) {
			deleteEmployee(request,response);
		}else if(action.equals("/update")) {
			updateEmployee(request,response);
		}
	}
	public void createEmployee(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String position=request.getParameter("position");
		int phone=Integer.parseInt(request.getParameter("phone"));
		String email=request.getParameter("email");
		double bsalary=Double.parseDouble(request.getParameter("bsalary"));
		double othours=Double.parseDouble(request.getParameter("othours"));
		
		User user=new User();
		
		user.setName(name);
		user.setPosition(position);
		user.setPhone(phone);
		user.setEmail(email);
		user.setBas_salary(bsalary);
		user.setOt_hours(othours);
		UserService uservice=new UserService();
		boolean result=uservice.create(user);
		request.setAttribute("result",result);
		
		if(result==true) {
			response.sendRedirect(request.getContextPath()+"/read");
			
		}else {
			response.sendRedirect(request.getContextPath()+"/create");
		}

	}
	
	public void deleteEmployee(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		
		User user=new User();
		user.setId(id);
		UserService uservice = new  UserService();
		boolean result = uservice.delete(id);
		request.setAttribute("result",result);
		
		if(result==true) {
			response.sendRedirect(request.getContextPath()+"/read");
			
		}else {
			response.sendRedirect(request.getContextPath()+"/delete");
		}
//		request.getRequestDispatcher("views/user-list.jsp").forward(request,response);	
	}

	public void updateEmployee(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		int id=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		String position=request.getParameter("position");
		int phone=Integer.parseInt(request.getParameter("phone"));
		String email=request.getParameter("email");
		double bsalary=Double.parseDouble(request.getParameter("bsalary"));
		double othours=Double.parseDouble(request.getParameter("othours"));
		
		User user=new User();
		
		user.setName(name);
		user.setPosition(position);
		user.setPhone(phone);
		user.setEmail(email);
		user.setBas_salary(bsalary);
		user.setOt_hours(othours);
		
		UserService uservice=new UserService();
		boolean result=uservice.update(id,user);
		request.setAttribute("result",result);
		
		if(result==true) {
			response.sendRedirect(request.getContextPath()+"/read");
			
		}else {
			response.sendRedirect(request.getContextPath()+"/update");
		}
	}
	
}
