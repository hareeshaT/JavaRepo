package Day3;

public class StringRange {
	static String newStr="";
	public static String strRange(String str,int start,int end) {
		
		for (int i = 0; i < str.length(); i++) {
			if(i>=start && i<=end) {
				newStr+=str.charAt(i);
			}
			else {
				newStr+=" ";
			}
		}
		return newStr.trim();
	}

	public static void main(String[] args) {
		System.out.println(strRange("HelloWorld",3,7));
	}
}