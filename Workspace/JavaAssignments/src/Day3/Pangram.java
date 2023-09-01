package Day3;

public class Pangram {
	public static boolean isPangram(String str) {
		boolean[] alphabet = new boolean[26];
       
        str = str.toLowerCase();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                int index = ch - 'a';
                alphabet[index] = true;
            }
        }
        
        for (boolean present : alphabet) {
            if (!present) {
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args) {
		String str="The quick brown fox jumps over the lazy dog sp";
		boolean op=isPangram(str);
		if(op==true) {
			System.out.println("pangram");
		}
		else {
			System.out.println("Not a pangram");
		}
	}
}
