package com.oops;
//Q13 encapsulation
public class BankAcc {
	 private double balance;

	    public void deposit(double amount) {
	        balance = balance + amount;
	        System.out.println("Deposited: " + amount);
	    }

	    public void withdraw(double amount) {
	        if (amount <= balance) {
	            balance = balance - amount;
	            System.out.println("Withdrawn: " + amount);
	        } else {
	            System.out.println("Insufficient Balance");
	        }
	    }

	    public double getBalance() {
	        return balance;
	    }
}
