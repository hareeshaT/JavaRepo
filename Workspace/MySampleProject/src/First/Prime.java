package First;
import java.util.Scanner;
public class Prime {
	static boolean flag =false;
	static boolean primenum(int num) {
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				flag=true;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int n =input.nextInt();
		primenum(n);
		if(!flag) {
			System.out.print("Prime");
		}
		else {
			System.out.print("Not a Prime");
		}
	}

}
