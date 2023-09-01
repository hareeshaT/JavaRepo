package Day1;
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Number");
		int num1=sc.nextInt();
		System.out.println("Enter second Number");
		int num2=sc.nextInt();
		System.out.println("Enter third Number");
		int num3=sc.nextInt();
		System.out.println((float)(num1+num2+num3)/3);
	}

}
