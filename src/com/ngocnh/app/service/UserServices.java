package com.ngocnh.app.service;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.junit.runner.Request;

import com.ngocnh.app.dao.UserDAO;
import com.ngocnh.app.entity.Users;

public class UserServices {
	private EntityManagerFactory entityManagerFactory;
	private EntityManager entityManager;
	private UserDAO userDAO;

	public UserServices() {
		entityManagerFactory = Persistence.createEntityManagerFactory("BookStoreWebsite");
		entityManager = entityManagerFactory.createEntityManager();
		userDAO = new UserDAO(entityManager);
	}

	public void listUser(HttpServletRequest request, ServletResponse response) throws ServletException, IOException {
		List<Users> listUsers = userDAO.listAll();
		request.setAttribute("listUsers", listUsers);
		request.setAttribute("message"," New user create successfully");

		String listPage = "user_list.jsp";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(listPage);

		requestDispatcher.forward(request, response);

	}

	public void createUser(HttpServletRequest request, ServletResponse response) {
		String email = request.getParameter("email");
		String fullName = request.getParameter("fullname");
		String password = request.getParameter("password");

		Users newUser = new Users(email, fullName, password);

		userDAO.create(newUser);

	}
}