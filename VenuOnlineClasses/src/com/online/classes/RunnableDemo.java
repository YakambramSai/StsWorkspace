package com.online.classes;

public class RunnableDemo implements Runnable {

	@Override
	public void run() {

		try {
		System.out.println("Current running Thread:" + Thread.currentThread().getId());
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}
    
	public static void main(String[] args) {
		
		for(int i=0; i<=10; i++) {
			Thread t= new Thread(new RunnableDemo());
			t.start();
		}
	}
}
