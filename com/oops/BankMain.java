package com.oops;
//Q12 ..encapsulation
public class BankMain {
	  public static void main(String[] args) {
	        BankAcc acc = new BankAcc();

	        acc.deposit(5000);
	        acc.withdraw(2000);
	        System.out.println("Balance: " + acc.getBalance());
	    }
}
