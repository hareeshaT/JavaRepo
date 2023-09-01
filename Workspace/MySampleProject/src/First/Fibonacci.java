package First;

public class Fibonacci {
	static int first =0;
	static int second =1;
	static int next;
	static void fb(int n) {
		System.out.println(first);
		System.out.println(second);
		for(int i=0;i<n;i++) {
			next=first+second;
			first=second;
			second=next;
			System.out.println(next);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fb(10);

	}

}
