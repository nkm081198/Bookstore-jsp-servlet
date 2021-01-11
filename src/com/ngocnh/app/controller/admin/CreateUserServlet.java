package com.ngocnh.app.controller.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ngocnh.app.entity.Users;
import com.ngocnh.app.service.UserServices;


@WebServlet("/admin/create_user")
public class CreateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public CreateUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String fullname = request.getParameter("fullname");
		String password = request.getParameter("password");
		
		response.getWriter().println("Email: " + email);
		response.getWriter().println("Fullname: " + fullname);
		response.getWriter().println("Password: " + password);
		
		UserServices userServices = new UserServices();
		userServices.createUser(email, fullname, password);
		
		request.setAttribute("listUsers", userServices.listUser());
		request.setAttribute("message", "Tạo mới người dùng thành công");

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("user_list.jsp");
		requestDispatcher.forward(request, response);
		
	}

	

}
