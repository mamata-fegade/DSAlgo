package array;

import java.util.Scanner;

public class BarChart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int array[] = new int[n];

		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}

		int max = array[0];

		for (int i = 0; i < n; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}

		for (int j = max; j >= 1; j--) {
			
			for (int i = 0; i < n; i++) {
				
				if (array[i] >= j) {
					System.out.print("*\t");
				} else {
					System.out.print("\t");
				}
			}
			System.out.println("");
		}
		sc.close();
	}

}
