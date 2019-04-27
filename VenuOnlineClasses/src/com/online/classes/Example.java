package com.online.classes;

public class Example {
	int a;
	int b;
	int c;
	
	public Example(int i, int j) {
		this.a=i;
		this.b=j;
	}

	public Example(int i, int j, int k) {
		this.a=i;
		this.b=j;
		this.c=k;

	}

	void add(){
		int d=a+b+c;
		System.out.println(d);
	}
	
	void add(int a, int b){
		int d=a+b+c;
		System.out.println(d);
	}
	
	void add(int a, int b, int c){
		int d=a+b+c;
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		Example e=new Example(10, 20);
		e.add();
		
		Example e1=new Example(20, 20, 50);
		e1.add();
	}

}
