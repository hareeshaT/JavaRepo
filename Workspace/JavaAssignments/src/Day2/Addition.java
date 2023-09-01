package Day2;
import Day3.Calculator;

public class Addition {
	
	public static void addition() {
		int sum = 0;
        for (int i = 1; i <= 6; i++) {
            sum += i;
            System.out.print(i);
            if (i < 6) {
                System.out.print("+");
                System.out.print("=" + sum);
            }
            if (i < 6) {
                System.out.print("\n");
            }
        }
	}

	public static void main(String[] args) {
		Calculator calculator=new Calculator();
		System.out.println(calculator.add(3, 4));
		//addition();
	}
}
