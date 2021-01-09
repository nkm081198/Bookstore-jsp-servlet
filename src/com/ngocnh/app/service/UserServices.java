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
		userDAO  = new UserDAO(entityManager);
	}

	public void listUser() {
	List<Users> listUsers =	userDAO.ListAll();
	}
}
