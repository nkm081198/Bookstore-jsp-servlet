package com.ngocnh.app.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

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

	public List<Users> listUser() {
		List<Users> listUsers = userDAO.listAll();
		
		return listUsers;
	}
	
	public void createUser(String email, String fullname, String password) {
		Users user = new Users();
		user.setEmail(email);
		user.setFullName(fullname);
		user.setPassword(password);
		userDAO.create(user);
	}
}
