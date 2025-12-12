package com.Dec_8;

public class AccHolder {
public static void main(String[] args) {
Saving s =new Saving();
	System.err.println("Saving Account....!");
	s.bankname();
	s.branch();
	s.accCreate();
	s.accHolderName();
	s.accNo();
	
	s.intrestRate();
	s.minmumBalace();
	
	
	System.err.println("Current Account ......!");
	Current_Account c = new Current_Account();
	c.bankname();
	c.branch();
	c.accCreate();
	c.accHolderName();
	c.accNo();
	 
	c.businessName();
	c.accLimit();
}
}
