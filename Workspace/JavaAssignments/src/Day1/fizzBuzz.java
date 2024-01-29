package Day1;

public class fizzBuzz {
	
	static int num=3;
	static int num2=5;

	public static void main(String[] args) {
		for(int i=1;i<=100;i++) {
			if(i%num==0) {
				System.out.print(i);
				System.out.println("Fizz");
				
			}
			else if(i%num2==0) {
				System.out.print(i);
				System.out.println("Buzz");
			}
			else if((i%num==0) && (i%num2==0)) {
				System.out.print(i);
				System.out.println("fizz buzz");
			}
		}
	}

}
