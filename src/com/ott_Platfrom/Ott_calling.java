package com.ott_Platfrom;

public class Ott_calling {
public static void main(String[] args) {
	OTT o;
	o=new NetFlix();
	o.stream();
	System.out.println(" ");
	o = new Amazon_Prime();
	o.stream();
	 System.out.println("   ");
	 o = new Hotstar();
	 o.stream();
			
}
}
