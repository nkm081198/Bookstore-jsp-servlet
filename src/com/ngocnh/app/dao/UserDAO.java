package com.ngocnh.app.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.ngocnh.app.entity.Users;

public class UserDAO extends jpaDAO<Users> implements GenericDAO<Users> {

	public UserDAO(EntityManager entityManager) {
		super(entityManager);
		// TODO Auto-generated constructor stub
	}

	public Users creare(Users user) {
		return super.create(user);
	}

	@Override
	public Users update(Users user) {
		// TODO Auto-generated method stub
		return super.update(user);
	}

	@Override
	public Users get(Object UserId) {
		return super.find(Users.class, UserId);
	}

	@Override
	public void delete(Object UserId) {
		super.delete(Users.class, UserId);

	}

	@Override
	public List<Users> ListAll() {
		return super.findWithNamedQuery("Users.findAll");
	}

	@Override
	public long count() {
		return super.countWithNameQuery("Users.countAll");
	}

}
