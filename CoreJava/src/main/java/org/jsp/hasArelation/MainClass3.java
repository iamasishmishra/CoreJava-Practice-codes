package org.jsp.hasArelation;

interface BankAccount {
	public double getBalance();
}

class Phonepay {
	private BankAccount bankAccount;

	public BankAccount getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

}

class SBI implements BankAccount{	
	public double getBalance() {
		return 5000;
	}
}

class ICICI implements BankAccount{
	public double getBalance() {
		return 8000;
	}
}

public class MainClass3 {
	public static void main(String[] args) {
		Phonepay phonepay = new Phonepay();
		phonepay.setBankAccount(new ICICI());
		System.out.println(phonepay.getBankAccount().getBalance());
	}
}
