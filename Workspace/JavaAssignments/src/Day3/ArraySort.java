package Day3;

import java.util.Arrays;

public class ArraySort {
	public static int[] sorting(int[] arr) {
		Arrays.sort(arr);
		return arr;
	}

	public static void main(String[] args) {
		int[] array= {1,4,6,12,3,7,8,2,20,17};
		array=sorting(array);
		for (int i = 0; i < array.length; i++) {
			if(i<array.length-1) {
				System.out.print(array[i]+", ");
			}
			else {
				System.out.print(array[i]);
			}
		}
	}

}
