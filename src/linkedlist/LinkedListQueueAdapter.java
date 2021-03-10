package linkedlist;
import java.util.LinkedList;


public class LinkedListQueueAdapter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		LinkedListQueue stackList= new LinkedListQueue();
		stackList.add(10);
		stackList.add(20);
		stackList.add(30);
		stackList.display();
		System.out.println(stackList.peek());
		stackList.remove();
		
		System.out.println(stackList.peek());
		stackList.add(101);
		stackList.add(201);
		stackList.add(301);
		stackList.display();

	}
	
	public static class LinkedListQueue{
		
		LinkedList<Integer> list;
		
		public LinkedListQueue() {
			list = new LinkedList<Integer>();
		}
		
		public int size() {
			return list.size();
		}
		
		public void add(int data) {
			list.addLast(data);
		}
		
		public void remove() {
			list.removeFirst();
		}
		
		public int peek() {
			return list.getFirst();
		}
		
		public void display() {
			System.out.println(list.toString());
		}
		
	}

}
