package com.thread;

public class Main {
	    public static void main(String[] args) throws Exception {

	        ThreadClass t = new ThreadClass();

	        // 1. setName()
	        t.changeName("Worker-1");

	        // 2. getName()
	        t.showName();

	        // 3. setPriority()
	        t.changePriority(Thread.MAX_PRIORITY);

	        // 4. getPriority()
	        t.showPriority();

	        // 5. isAlive()
	        t.checkAlive();

	        // 6. start()
	        t.start();

	        // 7. isAlive() (after start)
	        t.checkAlive();

	        // 8. join()
	        t.join();

	        // 9. currentThread()
	        System.out.println("Current Thread: " +
	                Thread.currentThread().getName());

	        // 10. equals()
	        System.out.println("t1 equals current thread? " +
	                t.equals(Thread.currentThread()));
	   
	    }

}