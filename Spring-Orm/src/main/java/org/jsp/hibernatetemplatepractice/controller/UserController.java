package org.jsp.hibernatetemplatepractice.controller;

import java.util.List;
import java.util.Scanner;

import org.jsp.hibernatetemplatepractice.dao.UserDao;
import org.jsp.hibernatetemplatepractice.dto.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserController {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-orm.xml");
		UserDao userDao = context.getBean("userDao", UserDao.class);

		Scanner sc = new Scanner(System.in);

		System.out.println("1. Save User.\n2. Update User.\n3. Find User by Id."
				+ "\n4. Delete User.\n5. Verify User by Phone And Password.\n6. Verify User by Email And Password.\n7. Verify User by Id And Password.\n8. Find User by name.\n9. Find User by Phone number.\n10. Find User by email.");

		switch (sc.nextInt()) {
			case 1: {
				
				User user = new User();
				System.out.println("Enter the user name, phone number, email, password to save user : ");
				user.setName(sc.next());
				user.setPhone(sc.nextLong());
				user.setEmail(sc.next());
				user.setPassword(sc.next());
				
				user = userDao.saveUser(user);
				System.out.println("User saved with id : " + user.getId());
				
				break;
			}
			case 2: {
				
				User user = new User();
				System.out.println("Enter the user id, name, phone number, email, password to save user : ");
				user.setId(sc.nextInt());
				user.setName(sc.next());
				user.setPhone(sc.nextLong());
				user.setEmail(sc.next());
				user.setPassword(sc.next());
				
				user = userDao.updateUser(user);
				
				if( user != null) {
					System.out.println("User updated for id : " + user.getId());
				}
				else {
					System.err.println("User not upadted as user id is incorrect.");
				}
				
				break;
			}
			case 3: {
				
				System.out.println("Enter User id to find User : ");
				int id = sc.nextInt();
				
				User user = userDao.findUserById(id);
				
				if( user != null) {
					System.out.println(user);
				}
				else {
					System.err.println("Invalid User id");
				}
	
				break;
			}
			case 4: {
				
				System.out.println("Enter User id to delete User : ");
				int id = sc.nextInt();
				
				if( userDao.deleteUser(id)) {
					System.out.println("User deleted with id : " + id);
				}
				else {
					System.err.println("Not able to delete User as id is invalid.");
				}
	
				break;
			}
			case 5:{
				System.out.println("Enter the User Phone number and password to verify user:");
				
				User user = userDao.verifyUserByPhoneAndPassword(sc.nextLong(), sc.next());
				
				if(user != null) {
					System.out.println("Verification Successfull.");
					System.out.println(user);
				}
				else {
					System.err.println("Invalid User phone or password.");
				}
			}
			case 6:{
				System.out.println("Enter the User email and password to verify user:");
				
				User user = userDao.verifyUserByEmailAndPassword(sc.next(), sc.next());
				
				if(user != null) {
					System.out.println("Verification Successfull.");
					System.out.println(user);
				}
				else {
					System.err.println("Invalid User email or password.");
				}
			}
			case 7:{
				System.out.println("Enter the User Id and password to verify user:");
				
				User user = userDao.verifyUserByIdAndPassword(sc.nextInt(), sc.next());
				
				if(user != null) {
					System.out.println("Verification Successfull.");
					System.out.println(user);
				}
				else {
					System.err.println("Invalid User id or password.");
				}
			}
			case 8: {
				
				System.out.println("Enter User name to find User : ");
				String name = sc.next();
				
				List<User> user = userDao.findUserByName(name);
				
				if( user.size() > 0) {
					for(User u : user) {
						System.out.println(u);
					}
				}
				else {
					System.err.println("No User found for the entered name.");
				}
	
				break;
			}
			case 9: {
				
				System.out.println("Enter User phone to find User : ");
				
				User user = userDao.findUserByPhoneNumber(sc.nextLong());
				
				if( user != null) {
					System.out.println(user);
				}
				else {
					System.err.println("No User found for the entered phone number.");
				}
	
				break;
			}
			case 10: {
				
				System.out.println("Enter User email to find User : ");
				
				User user = userDao.findUserByEmail(sc.next());
				
				if( user != null) {
					System.out.println(user);
				}
				else {
					System.err.println("No User found for the entered email.");
				}
				break;
			}
			default:
				System.out.println("Invalid choice.");
				((ClassPathXmlApplicationContext) context).close();
				sc.close();
				break;
		}
	}
}
