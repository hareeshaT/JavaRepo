package Day3;

public class ReverseString {
	public static String reshape(String str,char ch) {
		String result="";
		for (int i = str.length()-1; i >=0; i--) {
			result+=str.charAt(i);
			if(i>0) {
				result+=ch;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(reshape("rabbit",'-'));
	}

}
