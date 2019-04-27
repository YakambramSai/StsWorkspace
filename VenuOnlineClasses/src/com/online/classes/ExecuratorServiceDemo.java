package com.online.classes;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuratorServiceDemo {

	public static void main(String[] args) {
		
		int count=Runtime.getRuntime().availableProcessors();
		System.out.println("Available CPUs:"+count);
		ExecutorService executorService=Executors.newFixedThreadPool(100);
		for(int i=0; i<100; i++) {
			executorService.execute(new RunnableDemo());
			executorService.execute(new ThreadDemo());
		}
		

	}

}
