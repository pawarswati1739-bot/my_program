package com.acc.type;

public class SavingAcc extends Bank  {
	  
	    double roi;

	    SavingAcc(String bankName, double rate) {
	        super(bankName);
	        this.roi = rate;
	    }

	    void showSaving() {
	        System.out.println("Savings Interest Rate: " +roi + "%");
	    }
	}


