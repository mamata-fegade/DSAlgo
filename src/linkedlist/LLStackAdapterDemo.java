package linkedlist;
import java.util.LinkedList;
public class LLStackAdapterDemo {

	public static void main(String[] args) {

		LinkedListStack stackList= new LinkedListStack();
		stackList.push(10);
		stackList.push(20);
		stackList.push(30);
		System.out.println(stackList.top());
		stackList.pop();
		System.out.println(stackList.top());
		stackList.push(101);
		stackList.push(201);
		stackList.push(301);
		stackList.disply();
		
	}
	
	public static class LinkedListStack{
		LinkedList<Integer> list;
		
		LinkedListStack(){
			list= new LinkedList<Integer>();
			
		}
		
		public int size() {
			
			return list.size();
		}
		
		public void push(int data) {
			list.addFirst(data);
		}
		
		public int pop() {
			
			int val=list.removeFirst();
			return val;
		}
		
		public int top() {
			return list.getFirst();
		}
		
		public void disply() {
			System.out.println(list.toString());
		}
	}

}
