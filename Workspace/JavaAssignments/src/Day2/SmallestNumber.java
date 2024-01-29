package Day2;

public class SmallestNumber {
	
	public static int smallestNumber(int[] numarr) {
		int minNum=numarr[0];
		for (int i = 0; i < numarr.length; i++) {
			if(numarr[i]<minNum) {
				minNum=numarr[i];
			}
		}
		return minNum;
	}

	public static void main(String[] args) {
		int[] num= {2,4,6};
		System.out.println(smallestNumber(num));
	}

}
