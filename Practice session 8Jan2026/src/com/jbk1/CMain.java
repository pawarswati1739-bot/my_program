package com.jbk1;
//Q10.....Multithreading
// run  and  start
public class CMain {
	public static void main(String[] args) {
        MyThread t = new MyThread();
        t.run();   
         t.start(); 
    }
}
