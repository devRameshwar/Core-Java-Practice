package com.multithreading;

public class ThreadClass implements Runnable {

	
	 
	@Override
	public void run() {
		 
		for (int i = 1; i <= 5; i++) {
			System.out.println("Run executed...."+i);
		}
	}
	public static void main(String[] args) {
		ThreadClass threadClass = new ThreadClass();
		
		Thread thread = new Thread(threadClass);
		
		thread.start();
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Main executed...."+i);
		}
		
	}

}
 
