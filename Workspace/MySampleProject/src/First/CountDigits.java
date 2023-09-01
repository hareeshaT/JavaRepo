package First;

public class CountDigits {
	static int count =0;
	
	static int DigCount(int num) {
		int r;
		while(num!=0) {
			r=num%10;
			num/=10;
			System.out.println(r);
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(DigCount(254));
	}

}

