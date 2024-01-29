package com.main;
import com.service.*;
public class MainAPP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmetic obj=new Arithmetic();
		/*obj.add();
		
		String store=obj.add1();
		System.out.println(store);
		
		obj.food("Idly");
		
		System.out.println(obj.quantity(3));
		
		int total_money=obj.money(100, 50);
		System.out.println(total_money);
		
		obj.money2(100, 50);
		
		System.out.println(obj.money3(14));
		
		double val2=obj.money4(34.5f,65.999);
		System.out.println(val2);
		
		char gender=obj.gender("Tej");
		System.out.println(gender);
		
		System.out.println(obj.large(3, 6));
		System.out.println(obj.large(6, 3));*/
		
		/*int[] oddseries= {1,3,5,7,9};
		System.out.println(oddseries.length);
		System.out.println("first element is "+oddseries[0]);
		System.out.println(obj.array(oddseries));
		
		System.out.println(obj.sizearray(3));
		
		char[] chars="Hareesha".toCharArray();
		System.out.println(obj.chararray(chars));
		
		int[] arrays= {1,2,3,4,5};
		int[] newarrays=obj.stringarray(arrays);
		for (int i=0;i<newarrays.length;i++) {
            System.out.print(newarrays[i] + " ");
        }
        System.out.println();*/
        
        /*String word="you hareesha";
        char vowels[]= {'a','e','i','o','u'};
        char[] vowelarray=obj.vowel(word,vowels);
        for (int i=0;i<vowelarray.length;i++) {
        	System.out.print(vowelarray[i]);
        }
        System.out.println();*/ 
        
        obj.countCharacterOccurrences("Hello World");
        
        int a=10;
        //a++;
        //System.out.println(a++);
        //System.out.println(++a);
        //System.out.println(a++);
        
        /*int[] numarray = {1,2,3,4,5,6,7,8,9,10,11};
        int[] evenodd=obj.evenodd(numarray);
        for(int i=0;i<evenodd.length;i++) {
        	if(i==0) {
        		System.out.print("Even: ");
        	}
        	else {
        		System.out.print("Odd: ");
        	}
        	System.out.println(evenodd[i]);
        }*/
	}

}
