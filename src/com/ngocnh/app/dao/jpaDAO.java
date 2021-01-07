package com.ngocnh.app.dao;

import javax.persistence.EntityManager;

public class jpaDAO<E> {
	protected EntityManager entityManager;

	public jpaDAO(EntityManager entityManager) {
		super();
		this.entityManager = entityManager;
	}
	
	public E create(E t) {
		entityManager.getTransaction().begin();
		
		entityManager.persist(t);
		entityManager.flush();
		entityManager.refresh(t);
		
		entityManager.getTransaction().commit();
		
		return t;
	}
	public E update(E entity) {
		entityManager.getTransaction().begin();
		entity = entityManager.merge(entity);
		entityManager.getTransaction().commit();
		return entity;
	}
}
