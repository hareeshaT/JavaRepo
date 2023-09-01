package Day1;

import java.util.Scanner;

public class squareEvenSum {
	
	public static int sumOfSquaresOfEvenDigits(int num) {
		int r;
		int sum=0;
		while(num!=0) {
			r=num%10;
			num/=10;
			//System.out.println(r);
			//System.out.println(num);
			if(r%2==0) {
				sum+=r*r;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		System.out.println("sum of squares of even digits of given number is "+sumOfSquaresOfEvenDigits(num));
	}

}
