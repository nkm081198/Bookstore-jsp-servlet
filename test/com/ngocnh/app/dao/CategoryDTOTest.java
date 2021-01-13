package com.ngocnh.app.dao;

import static org.junit.Assert.*;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ngocnh.app.entity.Category;

public class CategoryDTOTest extends BaseDAOTest {
	
	private static CategoryDAO categoryDAO;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		BaseDAOTest.setUpBeforeClass();
		categoryDAO = new CategoryDAO(entityManager);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		BaseDAOTest.tearDownAfterClass();
	}

	@Test
	public void testCreateCategory() {
//		Category newCat = new Category("Java");
//		Category category = categoryDAO.create(newCat);
		
		Category category = new Category();
		category.setName("ngocnh");
		
		category = categoryDAO.create(category);
		assertTrue(category.getId()>0);
		
		
		assertTrue(category != null && category.getId() > 0);
	}

	@Test
	public void testUpdateCategory() {
		Category cat = new Category("Jave Core");
		cat.setId(1);
		
	Category category =	categoryDAO.update(cat);
	
	assertEquals(cat.getName(), category.getName());
	}

	@Test
	public void testGet() {
		Long CatId = 2L;
		Category cat = categoryDAO.get(CatId);
		assertNotNull(cat);
	}

	@Test
	public void testDeleteObject() {
		Long CatId = 10L;
		categoryDAO.delete(CatId);
		
		Category cat = categoryDAO.get(CatId);
		assertNull(cat);
	}

	@Test
	public void testListAll() {
		List<Category> listCategory = categoryDAO.listAll();
		listCategory.forEach(c -> System.out.println(c.getName() + ","));
		
		assertTrue(listCategory.size() > 0);
	}

	@Test
	public void testCount() {
		long totalCategorys = categoryDAO.count();
		
		assertEquals(4,totalCategorys);
	}
	
	@Test
	public void testFindByName() {
		String name = "Jave asdsa";
		Category category = categoryDAO.findByName(name);
		
		assertNull(category);
	}
	

}
