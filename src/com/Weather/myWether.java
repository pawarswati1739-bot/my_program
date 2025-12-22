package com.Weather;

public class myWether {
public static void main(String[] args) {
	Weather w;
	w=new Summer();
	w.session();
	w=new Rainy();
	w.session();
	w=new Winter();
	w.session();
}
}
