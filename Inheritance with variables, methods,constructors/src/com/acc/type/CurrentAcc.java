package com.acc.type;

public class CurrentAcc extends Bank {
	
	    double accLimit;

	    CurrentAcc(String bankName,  double accLimit) {
	        super(bankName);
	        this.accLimit = accLimit;
	    }

	    void showCurrent() {
	        System.out.println("Account Limit: " +accLimit );
	    }
	
}
