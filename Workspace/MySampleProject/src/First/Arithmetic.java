package First;
import java.util.Scanner;

public class Arithmetic {
	
	public static int add(int a, int b) {
		return(a+b);
	}
	
	public static void substract(int a, int b) {
		System.out.println(a-b);
	}
	
	public static double multiply(int a, double b) {
		return(a*b);
	}
	
	public static float division(double a, double b) {
		return (float)(a/b);
	}
	
	public static void division2(double a, double b) {
		System.out.print(a%b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner INP = new Scanner(System.in);
		System.out.print("Enter First Num");
		int a = INP.nextInt();
		System.out.print("Enter Second Num");
		int b = INP.nextInt();
		System.out.println(add(a,b));
		substract(a,b);
		System.out.println(multiply(a,b));
		System.out.println(division(a,b));
		division2(a,b);
	}

}
