package Challange;

import java.util.*;

public class Celebrity {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter m and n");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] array = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) { 	
				System.out.println("=>" + i + " " + j);
				array[i][j] = sc.nextInt();
			}
		}
		
		findCelebrity(array);
	
		sc.close();
	}

	static void findCelebrity(int[][] array) {

		Stack<Integer> stack = new Stack<Integer>();
		
		

		for (int i = 0; i < array.length; i++) {
			System.out.println(i);
			stack.push(i);
		}

		while (stack.size() >= 2) {
			int i = stack.pop();
			int j = stack.pop();
			
			if (array[i][j] == 1) { // if i know j then i is not celebrity
				stack.push(j);
			} else {
				stack.push(i); // if i don't know j
			}
		}
 
		int potCel = stack.pop();
		
		for (int i = 0; i < array.length; i++) {
			if (i != potCel) {
				if (array[i][potCel] == 0 || array[potCel][i] == 1) {
					System.out.println("None");
					return;
				}
			}
		}
		System.out.println("Celebrity");

	}

}
