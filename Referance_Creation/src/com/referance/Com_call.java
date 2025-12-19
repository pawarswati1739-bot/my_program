package com.referance;

public class Com_call {
public static void main(String[] args) {
	Company c;
	c=new Company();
	c.companyName();
	c.Com_loc();
	c=new Manger();
	c.companyName();
	c.Com_loc();
	c=new Employee();
	c.Com_loc();
	c.companyName();
}

}
