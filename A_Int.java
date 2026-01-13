package com.array;

public class A_Int {
public static void main(String[] args) {
	System.err.println("------byte-------");
	byte [] b= {123,100,122 ,110,118};
	for(int i=0; i<b.length ; i++) {
		System.out.println(b[i]);
	}
	
System.err.println("-----Short --------");
short [] s= {123,100,122 ,110,118};
for(int i=0; i<s.length ; i++) {
	System.out.println(s[i]);
}
	System.err.println("-----int -------");
	int[] num= {123,1224,125,125};
	for(int i =0 ; i<num.length; i++) {
		System.out.println(num[i]);
	}
	System.err.println("-----Float --------");
	float [] f= {12.3F,10.00f,12.20f ,11.90f,11.08f};
	for(int i=0; i<f.length ; i++) {
		System.out.println(f[i]);
	}
	System.err.println("-----Double --------");
	double [] d= {123.00,100.0,122.00 ,110.899,118.990};
	for(int i=0; i<d.length ; i++) {
		System.out.println(d[i]);
	}
	System.err.println("-----Long --------");
	long [] l= {123233878l,100000l,12265586l,11023543l,1143312438l};
	for(int i=0; i<l.length ; i++) {
		System.out.println(l[i]);
	}
	System.err.println("-----char --------");
	char [] c= {'a','s','d','f','g','f'};
	for(int i=0; i<c.length ; i++) {
		System.out.println(c[i]);
	}
	System.err.println("-----Boolean --------");
	boolean [] bn= {true, false, true,true};
	for(int i=0; i<bn.length ; i++) {
		System.out.println(bn[i]);
	}
	System.err.println("-----String --------");
	String [] str= {"Swati", "Jyoti", "Komal", "Shriraj","Digu","Shambhu"};
	for(int i=0; i<str.length ; i++) {
		System.out.println(str[i]);
	}
}
}
