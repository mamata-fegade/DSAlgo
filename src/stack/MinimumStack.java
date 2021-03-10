package stack;
import java.util.*;
public class MinimumStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MinStack stack = new MinStack();
		stack.push(34);
		stack.push(56);
		stack.push(3);
		stack.push(39);
		stack.push(22);
		stack.push(8);
		stack.push(4);
		stack.push(15);
		
		System.out.println(stack.size());
		System.out.println(stack.min());
		System.out.println(stack.pop());
		stack.push(1);
		System.out.println(stack.min());

	}
	
	public static class MinStack{
		Stack<Integer> allData;
		Stack<Integer> minData;
		
		public MinStack() {
			allData = new Stack<Integer>();
			minData = new Stack<Integer>();
		}
		
		int size() {
			return allData.size();
		}
		
		void push(int val) {
			allData.push(val);
			
			if(minData.size() == 0 || val < minData.peek()) {
				minData.push(val);
				
			}
		}	
		int min() {
				if(size() == 0) {
					System.out.println("Stack underflow");
					return -1;
				}
				else {
					return minData.peek();
				}
			}
		int top() {
			if(size() == 0) {
				System.out.println("Stack underflow");
				return -1;
			}
			else {
				return allData.peek();
			}
		}
		
		int pop() {
			if(size() == 0) {
				System.out.println("Stack underflow");
				return -1;
			}
			else {
				int val= allData.pop();
				
				if(val == minData.peek()) {
					minData.pop();
				}
				return val;
			}
			
		}
	}

}
