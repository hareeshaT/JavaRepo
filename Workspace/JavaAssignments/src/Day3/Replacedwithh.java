package Day3;

public class Replacedwithh {
	
	public static String replace(String str) {
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)=='d') {
				str=str.replace(str.charAt(i), 'h');
			}
		}
		return str;
	}
	public static void main(String[] args) {
		System.out.println(replace("dada"));
	}
}