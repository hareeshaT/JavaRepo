package Day1;
import java.util.Scanner;
public class oddDigitSum {
	
	public static int checkSum(int num) {
		int r;
		int sum=0;
		while(num!=0) {
			r=num%10;
			num/=10;
			if(r%2==1) {
				sum+=r;
			}
		}
		if(sum%2==1) {
			return 1;
		}
		else {
			return -1;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		if(checkSum(num)==1) {
			System.out.println("Sum of odd digits is odd");
		}
		else {
			System.out.println("Sum of odd digits is even");
		}
	}

}
