package Day3;

public class Search {
	static int op;
	
	public static int findAnElement(int[] arr,int num) {
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==num) {
				op=arr[i];
			}
		}
		return op;
	}

	public static void main(String[] args) {
		int[] array= {1,4,6,12,3,7,8,2,20,17};
		System.out.println(findAnElement(array, 6));
	}

}
