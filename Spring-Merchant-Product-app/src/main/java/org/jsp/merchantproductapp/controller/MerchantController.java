package org.jsp.merchantproductapp.controller;

import java.util.Scanner;

import org.jsp.merchantproductapp.MerchantProductConfig;
import org.jsp.merchantproductapp.dao.MerchantDao;
import org.jsp.merchantproductapp.dto.Merchant;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MerchantController {

	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(MerchantProductConfig.class);
		MerchantDao merchantDao = context.getBean(MerchantDao.class);

		Scanner sc = new Scanner(System.in);

		System.out.println("1. Save Merchant.\n2. Update Merchant.\n3. Find Merchant By Id."
				+ "\n4. Verify Merchant By Phone and Password.\n5. Verify Merchant By Email and Password.");
		
		switch (sc.nextInt()) {
		case 1:{
			Merchant merchant = new Merchant();
			System.out.println("Enter the name, phone, email, gst_number, password : ");
			merchant.setName(sc.next());
			merchant.setPhone(sc.nextLong());
			merchant.setEmail(sc.next());
			merchant.setGst_number(sc.next());
			merchant.setPassword(sc.next());
			
			merchant = merchantDao.saveMerchant(merchant);
			System.out.println("Merchant saved with id : " + merchant.getId());
			break;
		}
		
		case 2:{
			
			Merchant merchant = new Merchant();
			System.out.println("Enter the id, name, phone, email, gst_number, password : ");
			merchant.setId(sc.nextInt());
			merchant.setName(sc.next());
			merchant.setPhone(sc.nextLong());
			merchant.setEmail(sc.next());
			merchant.setGst_number(sc.next());
			merchant.setPassword(sc.next());
			
			merchant = merchantDao.updateMerchant(merchant);
			
			if(merchant != null) {
				System.out.println("Merchant with id " + merchant.getId() + " updated");
			}
			else {
				System.err.println("Cannot update Merchant as id is invalid");
			}
			break;
		}
		
		case 3:{
			System.out.println("Enter the Merchant id to display details : ");
			int id = sc.nextInt();
			
			Merchant merchant = merchantDao.findMerchantById(id);
			
			if(merchant != null) {
				System.out.println(merchant);
			}else {
				System.out.println("No details found for the entered Merchant id");
			}	
			break;
		}
		
		case 4:{
			System.out.println("Enter the Phone number and password to verify : ");
			long phone = sc.nextLong();
			String password = sc.next();
			
			Merchant merchant = merchantDao.verifyMerchant(phone, password);
			
			if(merchant != null) {
				System.out.println("Merchant verification successfull");
				System.out.println(merchant);
			}
			else {
				System.err.println("Invalid Phone number or Password");
			}
			break;
		}
		
		case 5:{
			System.out.println("Enter the Email and password to verify : ");
			String email = sc.next();
			String password = sc.next();
			
			Merchant merchant = merchantDao.verifyMerchant(email, password);
			
			if(merchant != null) {
				System.out.println("Merchant verification successfull");
				System.out.println(merchant);
			}
			else {
				System.err.println("Invalid Email or Password");
			}	
			break;
		}	
		default:
			System.out.println("Invalid Choice");
			sc.close();
			((AnnotationConfigApplicationContext) context).close();
			break;
		}

	}
}
