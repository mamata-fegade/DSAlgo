package array;

import java.util.*;

public class MaximumWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
		int k = 3;
		int n = 9;
		ArrayList<Integer> max_list = max_of_subarraysON2(arr, n, k);
		System.out.println(max_list);

		max_list = max_of_subarrays(arr, n, k);
		System.out.println(" second time==" + max_list);

	}

	static ArrayList<Integer> max_of_subarraysON2(int arr[], int n, int k) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			if (n - i >= k) {
				int max = arr[i];
				for (int j = i; j < i + k; j++) {
					if (arr[j] > max) {
						max = arr[j];
					}
				}
				list.add(max);
			} else {
				return list;
			}

		}

		return list;

	}

	static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		Stack<Integer> stack = new Stack<Integer>();
		int nextGreater[] = new int[n];

		stack.push(0);

		for (int i = 1; i < n; i++) {
			while (stack.size() > 0 && arr[i] > arr[stack.peek()]) {
				int pos = stack.peek();
				nextGreater[pos] = i;
				stack.pop();
			}

			stack.push(i);
		}

		while (stack.size() > 0) {
			int pos = stack.peek();
			System.out.println("pos==" + pos);
			nextGreater[pos] = n;
			stack.pop();
		}

		System.out.println("Next greater " + Arrays.toString(nextGreater));

		int j = 0;
		for (int i = 0; i <= n - k; i++) {
			if (j < i)
				j = i;
			while (nextGreater[j] < i + k) {
				j = nextGreater[j];
			}

			list.add(arr[j]);
		}

		return list;

	}

}
