package com.main;

//import com.model.Arithmetic;
import com.model.childArithmetic;

public class InheritArithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		childArithmetic childcalcu=new childArithmetic();
		//Arithmetic parent =new Arithmetic();
		System.out.println(childcalcu.add(3, 3)); 
		System.out.println(childcalcu.sub(8, 3)); 
		System.out.println(childcalcu.sub(8,3f));
		System.out.println(childcalcu.mul(8,8));
		//System.out.println(childcalcu.num);
		System.out.println(childcalcu.parentnum());
	}
}
