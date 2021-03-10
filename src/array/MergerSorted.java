package array;

import java.util.Arrays;

public class MergerSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[] = { 1, 3, 5, 7 };
		int arr2[] = { 0, 2, 6, 8, 9 };

		merge(arr1, arr2, arr1.length, arr2.length);

		for (int i : arr1) {
			System.out.print(" " + i);
		}
		System.out.println(" \n");
		for (int i : arr2) {
			System.out.print(" " + i);
		}
	}

	public static void merge(int arr1[], int arr2[], int n, int m) {
		// code here

		int i = n - 1;
		int j = 0;

		while (i >= 0 && j < m) {

			if (arr1[i] > arr2[j]) {
				int temp = arr1[i];
				arr1[i] = arr2[j];
				arr2[j] = temp;
				i--;
				j++;

			}
			else
			{
				break;
			}

		}

		Arrays.sort(arr1);
		Arrays.sort(arr2);

	}

}
