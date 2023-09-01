package Day2;
import java.util.Scanner;

public class VowelCount {
	
	public static char[] vowel(String word,char[] vowels) {
		char[] newarr= new char[word.length()];
		int cnt=0;
		for(int i=0;i<word.length();i++) {
			for(int j = 0; j < vowels.length; j++) {
				if(word.charAt(i)==vowels[j]) {
					cnt++;
					newarr[i]=word.charAt(i);
				}
			}
		}
		System.out.println(cnt);
		return newarr;
	}

	public static void main(String[] args) {
		char[] vowels = {'a','e','i','o','u'};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word");
		String word=sc.nextLine();
		vowels=vowel(word,vowels);
		for (int i = 0; i < vowels.length; i++) {
			System.out.print(vowels[i]);
		}
	}

}
