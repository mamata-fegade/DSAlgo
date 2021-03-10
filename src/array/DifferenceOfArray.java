package array;

import java.util.Scanner;

public class DifferenceOfArray {

	public static void main(String[] args) {

		// n2 will be greater number

		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int array[] = new int[n1];

		for (int i = 0; i < n1; i++) {
			array[i] = sc.nextInt();
		}

		int n2 = sc.nextInt();
		int array2[] = new int[n2];

		for (int i = 0; i < n2; i++) {
			array2[i] = sc.nextInt();
		}

		int[] sum = new int[n2];

		int c = 0;
		int i = n1 - 1;
		int j = n2 - 1;
		int k = sum.length - 1;

		while (k >= 0) {
			int dif = 0;
			int arrayValue = i>=0 ? array[i] :0; // If array 1 ends early
			
			if (arrayValue <= array2[j] + c) {
				dif = array2[j]+c - arrayValue;
				c = 0;
			} else {

				dif = array2[j] + 10 + c - arrayValue;
				c = -1;
			}

			sum[k] = dif;
			i--;
			j--;
			k--;
		} 
		for (int val : sum) { 	 	
			System.out.print(val);
		}
		sc.close();

	}

}
