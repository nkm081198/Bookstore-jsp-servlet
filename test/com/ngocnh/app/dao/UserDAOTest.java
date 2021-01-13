package com.ngocnh.app.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ngocnh.app.entity.Users;

public class UserDAOTest extends BaseDAOTest{
	private static UserDAO userDAO;

	@BeforeClass
	public static void setUpClass() throws Exception {
		entityManagerFactory = Persistence.createEntityManagerFactory("BookStoreWebsite");
		entityManager = entityManagerFactory.createEntityManager();
		userDAO = new UserDAO(entityManager);
	}

	@Test
	public void testCreare() {
		Users u = new Users();
		u.setFullName("Nguyen Khac Manh11133");
		u.setEmail("manhnk11133@gmail.com");
		u.setPassword("22222111");

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
		if (user != null) {
			System.out.println(user.getEmail());
		}
		assertNotNull(user);
	}

	@Test
	public void testGetUserNotFound() {
		Long userId = 99L;
		Users user = userDAO.get(userId);

		assertNull(user);
	}

	@Test
	public void testDeleteUser() {
		Long UserId = 5L;
		userDAO.delete(UserId);
		Users user = userDAO.get(UserId);
		assertNull(user);
	}
	@Test(expected = EntityNotFoundException.class)
	public void testDelateNonExistUsers() {
		Long UserId = 55L;
		userDAO.delete(UserId);
	}
	@Test
	public void testListAll() {
		List<Users> listUsers = userDAO.listAll();
		for(Users user : listUsers) {
			System.out.println(user.getEmail());
		}
		
		assertTrue(listUsers.size() > 0);
	}
	@Test
	public void testCount() {
		long totalUsers = userDAO.count();
		
		assertEquals(8, totalUsers);
	}
	@Test
	public void testFindByEmail() {
		String email = "ngocnh@gmail.com";
	Users user  = userDAO.findByEmail(email);

	assertNotNull(user);
	}

	@AfterClass
	public static void tearDownClass() {
		entityManager.close();
		entityManagerFactory.close();
	}

}
