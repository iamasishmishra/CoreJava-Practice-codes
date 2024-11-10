package org.jsp.usermvcapp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.jsp.usermvcapp.dto.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao {
	
	private EntityManager entityManager;
	
	public User saveUser(User user) {
		EntityTransaction transaction = entityManager.getTransaction();
		entityManager.persist(user);
		transaction.begin();
		transaction.commit();
		
		return user;
	}
	
	
	public User findById(int id) {
		return entityManager.find(User.class, id);
	}

}
