package com.model;

public class Arithmetic {
	private int a;
	
	public int num=100;

	public Arithmetic() {
		super();
		num=110;
	}

	public int add(int a,int b) {
		return a+b;
	}
	
	public int sub(int a,int b) {
		return a-b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	
}
