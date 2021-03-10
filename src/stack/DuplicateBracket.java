package stack;
import java.util.Scanner;
import java.util.*;
public class DuplicateBracket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str= sc.next();
		
		Stack<Character> stack = new Stack<Character>();
		
		for(int i=0; i<str.length(); i++) {
			
			char ch= str.charAt(i);
			if( ch == ')')
			{
				if(stack.peek()=='('){
					System.out.println("true");
					return;
				}
				else
				{
					while(stack.peek() != '(')
					{
						stack.pop();
					}
					stack.pop();
				}
			}
			else
			{
				stack.push(ch);
			}
			
		}
		System.out.println("False");

	}

}
