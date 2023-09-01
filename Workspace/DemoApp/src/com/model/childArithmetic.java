package com.model;

public class childArithmetic extends Arithmetic{
	
	//int num=120;
	
	public childArithmetic() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println(num);
	}
	public int parentnum() {
		return super.num;
	}
	public int mul(int a,int b) {
		return a*b;
	}
	public int sub(int a,int b) {
		//return a/b;
		return super.sub(8, 3);
	};
	public float sub(int a,float b) {
		return a*b;
	}
}
