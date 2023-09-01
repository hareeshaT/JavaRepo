package Day3;

public class UserMainCode {
	public static String getString(String str) {
		char firstChar = str.charAt(0);
        char secondChar = str.charAt(1);

        if (firstChar == 'k' && secondChar == 'b') {
            return str.substring(0, 2) + str.substring(2);
        } else if (firstChar == 'k') {
            return str.substring(0, 1) + str.substring(2);
        } else if (secondChar == 'b') {
            return str.substring(1, 2) + str.substring(2);
        } else {
            return str.substring(2);
        }
	}
	public static void main(String[] args) {
		String result=getString("sbcode");
		System.out.println(result);
	}
}
