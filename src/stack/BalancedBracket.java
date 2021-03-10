package stack;

import java.util.*;

public class BalancedBracket {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String expr = sc.next();

		Stack<Character> stack = new Stack<Character>();

		for (int i = 0; i < expr.length(); i++) {
			char ch = expr.charAt(i);

			if (ch == '(' || ch == '[' || ch == '{') {
				
				stack.push(ch);
				
			} else if(ch == ')' || ch == ']' || ch == '}') { 
				
				if (ch == ')' && stack.peek() == '(') {
					stack.pop();
				} else {
					System.out.println("False");
					return;
				}
				if (ch == '}' && stack.peek() == '{') {
					stack.pop();
				} else {
					System.out.println("False");
					return;
				}
				if (ch == ']' && stack.peek() == '[') {
					stack.pop();
				} else {
					System.out.println("False");
					return;
				}
			}
			
		}
		if(stack.size()==0)
		{
			System.out.println("true");
		}
		else
			System.out.println("false");
		sc.close();
	}

}
