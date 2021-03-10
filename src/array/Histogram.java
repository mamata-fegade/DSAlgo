package array;

import java.util.Arrays;
import java.util.Stack;

public class Histogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N = 7;
		//long arr[] = { 6, 2, 5, 4, 5, 1, 6 };
	
		long arr[] = {9,10 ,4 ,10, 4, 5, 16, };

		long area = getMaxArea(arr, N);
		System.out.println("area is" + area);

	}

	public static long getMaxArea(long hist[], int n) {
		long maxArea = 0;

		long[] rb = new long[n]; // next smaller index on right
		long[] lb = new long[n]; // next smaller index on left

		Stack<Integer> left = new Stack<Integer>();
		left.push(0);
		lb[0]=-1;
		for (int i = 1; i < n; i++) {
			while (left.size() > 0 && hist[i] <= hist[left.peek()]) {
				left.pop();
			}
			if (left.size() == 0) {
				lb[i] = -1;
			} else {
				lb[i] = left.peek();
			}
			left.push(i);
		}

		System.out.println("lb= "+Arrays.toString(lb));
		// next smaller element on right
		Stack<Integer> right = new Stack<Integer>();
		right.push(n - 1);
		rb[n - 1] = n;
		
		for (int i =  n - 2; i >= 0; i--) {
			
			while (right.size() > 0 && hist[i] <= hist[right.peek()]) {
				right.pop();
			}
			if (right.size() == 0) {
				rb[i] = n;
			} else {
				rb[i] = right.peek();
			}
			right.push(i);
		}
		

		System.out.println("rb= "+Arrays.toString(rb));

		for (int i = 0; i < n; i++) {
			long width = rb[i] - lb[i] - 1;
			long area = width * hist[i];	
			System.out.println("width "+width);
			if (area > maxArea) {
				maxArea = area;
			}
		}

		return maxArea;
	}

	public static long getMaxAreaforLong(long hist[], long n) {
		long maxArea = 0;

		long[] rb = new long[(int) n]; // next smaller index on right
		long[] lb = new long[(int) n]; // next smaller index on left

	
		Stack<Integer> left = new Stack<Integer>();
		left.push(0);
		lb[0]=-1;
		for (int i = 1; i < n; i++) {
			while (left.size() > 0 && hist[i] < hist[left.peek()]) {
				left.pop();
			}
			if (left.size() == 0) {
				lb[i] = -1;
			} else {
				lb[i] = left.peek();
			}
			left.push(i);
		}

		// next smaller element on right
		Stack<Integer> right = new Stack<Integer>();
		right.push((int)n - 1);
		rb[(int)n - 1] = n;
		for (int i = (int) n - 2; i >= 0; i--) {
			while (right.size() > 0 && hist[i] <hist[right.peek()]) {
				right.pop();
			}
			if (right.size() == 0) {
				rb[i] = n;
			} else {
				rb[i] = right.peek();
			}
			right.push(i);
		}

		for (int i = 0; i < n; i++) {
			long width = rb[i] - lb[i] - 1;
			long area = width * hist[i];
			if (area > maxArea) {
				maxArea = area;
			}
		}

		return maxArea;
	}

}
