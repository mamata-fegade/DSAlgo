package array;

import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int array[] = new int[n];

		for (int i = 0; i < n; i++) { 
			array[i] = sc.nextInt();
		}
		findGreaterBF(array, n);
		System.out.println("***************************************************");
		findNextGreaterON(array, n);
		System.out.println("***************************************************");
		findNextGreaterLtoR(array,n);
		sc.close();
	}

	public static void findGreaterBF(int[] array, int n) {
		int[] garray = new int[n];

		for (int i = 0; i < n; i++) {
			int max = array[i];
			for (int j = i + 1; j < n; j++) {
				if (max < array[j]) {
					max = array[j];
					break;
				}
			}
			if (max == array[i]) {
				garray[i] = -1;
			} else {
				garray[i] = max;
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.println("for " + array[i] + " next greater element is " + garray[i]);
		}
	}

	public static void findNextGreaterON(int[] array, int n) {
		Stack<Integer> stack = new Stack<Integer>();
		int i = n - 1;
		int[] greaterArray = new int[n];
		while (i >= 0) {
			if (i == n - 1) {
				stack.push(array[i]);
				greaterArray[i] = -1;
			} else {
				while (stack.size() > 0 && array[i] > stack.peek()) {
					stack.pop();
				}

				if (stack.size() != 0) {
					greaterArray[i] = stack.peek();
					stack.push(array[i]);
				} else {
					greaterArray[i] = -1;
					stack.push(array[i]);
				}
			}
			i--;

		}
		for (int j = 0; j < n; j++) {
			System.out.println("for " + array[j] + " next greater element is " + greaterArray[j]);
		}

	}

	public static void findNextGreaterLtoR(int[] array, int n) {
		Stack<Integer> stack = new Stack<Integer>();
		int i = 0;
		int[] greaterArray = new int[n];
		
		stack.push(i);
		i++;
		
		
		while(i<n)
		{
			while(stack.size() >0 && array[i] > array[stack.peek()])
			{
				int pos= stack.peek();
				greaterArray[pos]=array[i];
				stack.pop();
			}
			stack.push(i);
			
			i++;
			
		}
 		
		while(stack.size() > 0)
		{
			int pos= stack.peek();
			greaterArray[pos]=-1;
			stack.pop();
		}
		
		System.out.println("L to r==" );
		for (int j = 0; j < n; j++) {
			System.out.println("for " + array[j] + " next greater element is " + greaterArray[j]);
		}

	}

}
