package recursion;

import java.util.*;

public class TargetSumSubset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array element size");
		int n = sc.nextInt();

		int[] array = new int[n];
		System.out.println("Enter array " + n + " elements");
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Enter target number");
		int target = sc.nextInt();
		findSubset(array,0,0,"",target);
		sc.close();
	}

	public static void findSubset(int[] array, int index, int sum, String subset, int target) {
		if (index == array.length) {
			if (sum == target) {
				System.out.println(subset);
				
			} 
			return;
		}

		findSubset(array, index + 1, sum + array[index], subset + "," + array[index], target);
		findSubset(array, index + 1, sum, subset, target);

	}

}
