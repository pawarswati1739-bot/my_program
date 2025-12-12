package com.acc.type;

public class Custmer {
public static void main(String[] args) {
	SavingAcc sa = new SavingAcc("BOB", 7.00);
	
	sa.DisplayBank();
	sa.showSaving();

CurrentAcc ca = new CurrentAcc("SBI", 8.00);
ca.DisplayBank();
ca.showCurrent();

}

}
