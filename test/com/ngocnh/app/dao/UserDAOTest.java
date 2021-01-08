package com.ngocnh.app.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ngocnh.app.entity.Users;

public class UserDAOTest {
	private static EntityManagerFactory createEntityManagerFactory;
	private static EntityManager entityManager;
	private static UserDAO userDAO;

	@BeforeClass
	public static void setUpClass() {

		createEntityManagerFactory = Persistence.createEntityManagerFactory("BookStoreWebsite");
		entityManager = createEntityManagerFactory.createEntityManager();
		userDAO = new UserDAO(entityManager);
	}

	@Test
	public void testCreare() {
		Users u = new Users();
		u.setFullName("dANG hONG dUC");
		u.setEmail("ducdh@gmail.com");
		u.setPassword("asfdd");

		u = userDAO.creare(u);

		assertTrue(u.getId() > 0);
	}

	@Test(expected = PersistenceException.class)
	public void testCreareFieldsNotSet() {
		Users u = new Users();
		System.out.println(u.getEmail());
		u = userDAO.creare(u);

		assertTrue(u.getId() > 0);
	}

	@Test
	public void testUpdateUser() {
		Users user = new Users();
		user.setEmail("ngocnh@gmail.com");
		user.setFullName("Nguyen Ha Ngoc");
		user.setPassword("123987");
		user = userDAO.update(user);
		String expected = "mysecret";
		String actual = user.getPassword();
		assertEquals(expected, actual);

	}
	@Test(expected = PersistenceException.class)
	public void testGetUsersfound() {
		Long UserId = 1L;
		Users user = userDAO.get(UserId);
		if(user != null) {
			System.out.println(user.getEmail());
		}
		assertNotNull(user);
	}

	@AfterClass
	public static void tearDownClass() {
		entityManager.close();
		createEntityManagerFactory.close();
	}

}
