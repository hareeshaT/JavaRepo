package Day2;
import java.util.Scanner;

public class MiddleCharacter {
	
	public static void displayMiddleChar(String input) {
		int strLenght=input.length();
		if(strLenght==0) {
			System.out.println("Input is empty");
		}else if(strLenght%2==0) {
			int middleIndex=(strLenght/2)-1;
			System.out.println(input.charAt(middleIndex));
			System.out.println(input.charAt(middleIndex+1));
		}else if(strLenght%2==1) {
			int middleIndex=strLenght/2;
			System.out.println(input.charAt(middleIndex));
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input string");
		String str=sc.nextLine();
		displayMiddleChar(str);
	}

}