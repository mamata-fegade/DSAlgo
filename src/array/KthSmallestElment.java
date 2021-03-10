package array;

import java.util.Arrays;

public class KthSmallestElment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] input = { 7, 10, 4, 20, 15 };
		int min = findKthElement(input, 5);
		System.out.println("minimum no at 4 th position =" + min);

		int[] input2 = { 7, 10, 4, 20, 15 };
		System.out.println("minimum no at 4 th position by using utility =" + findKthElementUtility(input2, 5));

	}

	public static int findKthElementUtility(int[] arr, int k) {
		Arrays.sort(arr);
		return arr[k - 1];

	}

	public static int findKthElement(int[] arr, int k) {
		// Arrays.sort(arr);
		// return arr[k-1];

		

		if (arr.length == 0)
			return -1;
		
	
		/*
		 * for (int i = 0; i < arr.length; i++) { for (int j = 0; j < arr.length-i; j++)
		 * { if (arr[i] > arr[j]) { int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp; }
		 * 
		 * } }
		 */

		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if (arr[j] < arr[j - 1]) {
					
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}

			}
		}
		System.out.println("After sorting");
		for (int i : arr)
			System.out.print(i + "  ");

		return arr[k - 1];

	}

}
