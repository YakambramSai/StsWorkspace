package com.online.classes;

public class FinalClassDemo {
	
	private final int id;
	private final String name;
	
	public FinalClassDemo(int id, String x) {
		this.id=id;
		this.name=x;
	}

	public int getId(){
		return id;
	}
	
	public String  getName() {
		return name;
	}
	
	public static void main(String[] args) {
		FinalClassDemo fc=new FinalClassDemo(30, "sai");
		System.out.println(fc.id);
		System.out.println(fc.name);
		fc=new FinalClassDemo(70, "aarush");
		System.out.println(fc.id);
		System.out.println(fc.name);
		
	}
}
