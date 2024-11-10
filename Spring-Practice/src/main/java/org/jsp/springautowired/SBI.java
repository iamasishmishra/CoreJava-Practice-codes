package org.jsp.springautowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SBI implements BankAccount {
	
	@Value(value = "25000")
	private double balance;
	
	public double getBalance() {
		return balance;
	}
}
