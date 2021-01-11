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

@WebServlet("/admin/list_users")
public class ListUsersSeverlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ListUsersSeverlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		UserServices userServices = new UserServices();

		List<Users> listUsers = userServices.listUser();
		request.setAttribute("listUsers", listUsers);

		String listPage = "user_list.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(listPage);

		requestDispatcher.forward(request, response);
	}

}
