package com.jbk1;
// Q9....Multithreading
public class  MyThread1 extends Thread{
	
	    public void run() {
	        System.out.println(
	            Thread.currentThread().getName() +
	            " Priority: " +
	            Thread.currentThread().getPriority()
	        );
	    }
	}

	

