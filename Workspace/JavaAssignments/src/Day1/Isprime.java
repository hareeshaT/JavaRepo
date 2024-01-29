package Day1;
import java.util.Scanner;
public class Isprime {
	
	public static boolean isPrime(int num) {
		if(num<=1) {
			return false;
		}
		for(int i=2;i<=(num/2);i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		if(isPrime(num)) {
			System.out.println("given number is prime");
		}
		else {
			System.out.println("given number is not a prime");
		}
	}

}
