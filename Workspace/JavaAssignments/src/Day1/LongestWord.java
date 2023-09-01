package Day1;
import java.util.Scanner;

public class LongestWord {
	
	public static String getLargestWord(String Sentence) {
		String[] words=Sentence.split(" ");
		int maxLenWord = words[0].length();
		String longWord="";
		for (int i = 0; i < words.length; i++) {
			if(words[i].length()>=maxLenWord) {
				maxLenWord=words[i].length();
				longWord=words[i];
			}
		}
		return longWord;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Sentence");
		String str=sc.nextLine();
		System.out.println(getLargestWord(str));
	}

}
