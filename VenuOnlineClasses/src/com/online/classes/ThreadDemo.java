package com.online.classes;

public class ThreadDemo  extends Thread {
	
	public void run() {
		System.out.println("Current running Thread:"+Thread.currentThread().getId());
	}
	
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			ThreadDemo t=new ThreadDemo();
			t.start();
		}
	}
	
	

}
