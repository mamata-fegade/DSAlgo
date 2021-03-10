package stack;

import java.util.*;

class getMinimun {

	public static void main(String[] args) {
		int[] arr = { 23, 5, 45, 2 };

		Stack<Integer> mys = new GetMin()._push(arr, 4);

		new GetMin()._getMinAtPop(mys);
	}

}

class GetMin {
	static Stack<Integer> allData;
	static Stack<Integer> minData;

	GetMin() {
		allData = new Stack<Integer>();
		minData = new Stack<Integer>();
	}

	/*
	 * inserts elements of the array into stack and return the stackn
	 */
	public static Stack<Integer> _push(int arr[], int n) {
		// your code here
		for (int i = 0; i < n; i++) {
			allData.push(arr[i]);
			if (minData.size() == 0 || minData.peek() > arr[i]) {
				minData.push(arr[i]);
			}
		}
		return allData;
	}

	/*
	 * print minimum element of the stack each time after popping
	 */
	static void _getMinAtPop(Stack<Integer>s)
    {
        if(s.size() == 0) {
				
				return;
			}
			else {
				int val= s.pop();
				System.out.println("poping "+val +" : min in the stack is "+minData.peek()
				    +".");
				if(val == minData.peek()) {
					minData.pop();
				    System.out.print(" popped "+ val);
				}
			    
			}// your code here
        
    }
   }