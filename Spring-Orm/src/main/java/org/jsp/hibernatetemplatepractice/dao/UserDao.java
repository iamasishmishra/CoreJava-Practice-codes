package org.jsp.hibernatetemplatepractice.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.jsp.hibernatetemplatepractice.dto.User;
import org.springframework.orm.hibernate5.HibernateTemplate;

public class UserDao {

	
	private HibernateTemplate hibernateTemplate;

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	
	
	
	
	
	@Transactional
	public User saveUser(User user) {

		hibernateTemplate.save(user);
		return user;
	}
	
	
	
	
	

	@Transactional
	public User updateUser(User user) {

		User dbUser = hibernateTemplate.get(User.class, user.getId());

		if (dbUser != null) {

			dbUser.setName(user.getName());
			dbUser.setPhone(user.getPhone());
			dbUser.setEmail(user.getEmail());
			dbUser.setPassword(user.getPassword());

			hibernateTemplate.save(dbUser);
			return dbUser;
		}
		return null;
	}
	
	
	
	
	
	

	
	public User findUserById(int id) {

		return hibernateTemplate.get(User.class, id);
	}

	
	
	
	
	@Transactional
	public boolean deleteUser(int id) {

		User user = findUserById(id);

		if (user != null) {

			hibernateTemplate.delete(user);
			return true;
		}
		return false;
	}
	
	
	
	

	public User verifyUserByPhoneAndPassword(long phone, String password) {

//		List<User> user = (List<User>) hibernateTemplate.findByNamedParam("select u from User where u.phone = :ph and u.password = :ps", new String[] {"ph" , "ps"}, new Object[] {phone, password});
		List<User> user = (List<User>) hibernateTemplate.find("select u from User"
				+ " u where u.phone = ?0 and u.password = ?1", phone, password);

		if (user.isEmpty()) {
			return null;
		}
		return user.get(0);
	}
	
	
	
	
	
	

	public User verifyUserByEmailAndPassword(String email, String password) {

		List<User> user = (List<User>) hibernateTemplate.find("select u from User "
				+ "u where u.email = ?0 and u.password = ?1", email, password);

		if (user.isEmpty()) {
			return null;
		}
		return user.get(0);
	}

	
	
	
	
	
	
	public User verifyUserByIdAndPassword(int id, String password) {

		List<User> user = (List<User>) hibernateTemplate.find("select u from User "
				+ "u where u.id = ?0 and u.password = ?1", id, password);

		if (user.isEmpty()) {
			return null;
		}
		return user.get(0);
		
	
	}
	
	
	
	
	
	
	
	
	public List<User> findUserByName(String name) {
		
		List<User> user = (List<User>) hibernateTemplate.find("select u from User u where u.name = ?0", name);

		return user;
	}
	
	
	
	
	
	
	
	
	
	public User findUserByPhoneNumber(long phone) {
		
		List<User> user = (List<User>) hibernateTemplate.find("select u from User u where u.phone = ?0", phone);

		if (user.isEmpty()) {
			return null;
		}
		return user.get(0);
	}
	
	
	
	
	
	
	public User findUserByEmail(String email) {
		
		List<User> user = (List<User>) hibernateTemplate.find("select u from User u where u.email = ?0", email);

		if (user.isEmpty()) {
			return null;
		}
		return user.get(0);
	}
}
