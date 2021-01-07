package com.ngocnh.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ngocnh.app.entity.Category;

public class categoryTest {
	public static void main(String[] args) {
		Category u = new Category(0, "Nguyen Ha Ngoc");
		EntityManagerFactory createEntityManagerFactory = Persistence.createEntityManagerFactory("BookStoreWebsite");
		EntityManager entityManager = createEntityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();

		entityManager.persist(u);

		entityManager.getTransaction().commit();
		entityManager.close();
		createEntityManagerFactory.close();
		System.out.println("okee");
	}
}
