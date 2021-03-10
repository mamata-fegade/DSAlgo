package stack;

import java.util.*;

public class InfixToPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String expr = "4*8+(7-2)";
		//String expr= "a+b";

		infixToPrefix(expr);



	}

	public static void infixToPrefix(String expr) {
		
		Stack<String> pre = new Stack<String>();
		Stack<Character> operator = new Stack<Character>();
		Stack<String> post = new Stack<String>();

		for (int i = 0; i < expr.length(); i++) {
			char ch = expr.charAt(i);

			if (ch == '(') {
				operator.push(ch);
			} else if (ch == ')') {
				while (operator.peek() != '(') {
					char oper = operator.pop();

					String v2 = pre.pop();
					String v1 = pre.pop();
					pre.push(oper + v1 + v2);

					v1 = post.pop();
					v2 = post.pop();
					post.push(v1 + v2 + oper);
				}
				operator.pop();
			} else if (ch == '*' || ch == '/' || ch == '+' || ch == '-') {

				while (operator.size() > 0 && operator.peek() != '(' && precedence(ch) >= precedence(operator.peek())) {

					char oper = operator.pop(); // in stack lower precedence
					String v2 = pre.pop();
					String v1 = pre.pop();
					pre.push(oper + v1 + v2);

					v1 = post.pop();
					v2 = post.pop();
					post.push(v1 + v2 + oper);

				}
				operator.push(ch);

			} else if ((ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z')) {
				pre.push(ch + "");
				post.push(ch + "");
			}

		}
		while (operator.size() > 0) {
			char oper = operator.pop(); // remaining in stack
			String v2 = pre.pop();
			String v1 = pre.pop();
			pre.push(oper + v1 + v2);

			v2 = post.pop();
			v1 = post.pop();
			post.push(v1 + v2 + oper);

		}

		System.out.println("prefix=="+pre.pop());
		System.out.println("postfix=="+post.pop());
	}

	public static int precedence(char op) {

		if (op == '+' || op == '-')
			return 1;
		else if (op == '*' || op == '/')
			return 2;
		else
			return 0;

	}

}
