package com.jbk1;
//....Multithreading
//9 MyThread 's main class
public class ThreadMain {
	
	    public static void main(String[] args) {
	        MyThread1 t1 =new MyThread1();
	        MyThread1 t2 =new MyThread1();
	        
	        MyThread1 t3 =new MyThread1();

	        t1.setName("Low");
	        t2.setName("Normal");
	        t3.setName("High");

	        t1.setPriority(Thread.MIN_PRIORITY);  
	        t2.setPriority(Thread.NORM_PRIORITY); 
	        t3.setPriority(Thread.MAX_PRIORITY); 

	        t1.start();
	        t2.start();
	        t3.start();
	    }
}
