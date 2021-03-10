package array;

import java.util.Scanner;
import java.util.Stack;

public class StockSpan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int array[] = new int[n];

		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}

		findSpan(array, n);

		sc.close();
	}

	public static void findSpan(int[] array, int n) {

		Stack<Integer> stack = new Stack<Integer>();
		int[] span = new int[n];
		int i = 0;
		stack.push(0);
		span[0] = 1;
		i++;

		while (i < n) {
			
			while (stack.size() > 0 && array[i] > array[stack.peek()]) {
				stack.pop();
			}
			if (stack.size() == 0) {
				span[i] = i + 1;
			} else {
				span[i] = i - stack.peek();
			}
			stack.push(i);
			i++;
		}

		for (int j = 0; j < n; j++) {
			System.out.println("for " + array[j] + " next greater element is " + span[j]);
		}

	}

}
