package Day4;

public class MyCalculator implements AdvancedArithmetic{

	@Override
	public int divisor_sum(int n) {
		int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        return sum;
	}
	
	public static void main(String[] args) {
		MyCalculator calculator=new MyCalculator();
		System.out.println(calculator.divisor_sum(6));
	}

}
