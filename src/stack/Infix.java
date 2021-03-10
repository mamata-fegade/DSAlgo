package stack;

import java.util.Stack;

public class Infix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String expr= "4*8+(7-2)";
		
		int result=solveInfix(expr);
		
		System.out.println("result="+result);

	}

	static int solveInfix(String expr) {

		int result = 0;

		Stack<Character> operator = new Stack<Character>();
		Stack<Integer> operand = new Stack<Integer>();

		for (int i = 0; i < expr.length(); i++) {
			
			char ch = expr.charAt(i);
			System.out.println(ch);

			if (ch == '(') {
				operator.push(ch);

			} else if (ch == ')') {

				while (operator.peek() != '(') {
					char oper = operator.pop();
					int v2 = operand.pop();
					int v1 = operand.pop();
					int r=operation(v1, v2, oper);
					System.out.println(r);
					operand.push(r);
				}
				operator.pop();

			} else if (Character.isDigit(ch)) {
				operand.push(ch - '0');

			} else if (ch == '*' || ch == '/' || ch == '-' || ch == '+') {

				while (operator.size() > 0 && operator.peek() != '(' && precedence(ch) <= precedence(operator.peek())) {
					char oper = operator.pop();
					int v2 = operand.pop();
					int v1 = operand.pop();
					int r=operation(v1, v2, oper);
					System.out.println(r);
					operand.push(r);
				}
				operator.push(ch); //after processing higer priority ch is pushing itself
			}
		}
		while (operator.size() !=0) {
			char oper = operator.pop();
			int v2 = operand.pop();
			int v1 = operand.pop();
			int r=operation(v1, v2, oper);
			System.out.println(r);
			operand.push(r);
		}

		System.out.println(operand.peek());
		result= operand.peek();
		return result;
	}

	static int precedence(char op) {
		
		if(op== '+' || op=='-')
			return 1;
		else
			if(op=='*' || op=='/')
			return 2;
			else return 2;
		
	}

	static int operation(int op1, int op2, char op) {

		System.out.println("op1 "+op1);
		System.out.println("op2 "+op2);
		switch (op) {
		case '+':
			return op1 + op2;
			
		case '-':
			return op1 - op2;

		case '*':
			return op1 * op2;

		case '/':
			return op1 / op2;
		default:
			return 1;
		}
		
	}

}
