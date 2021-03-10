package linkedlist;


public class MergeLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList list1= new LinkedList();
		list1.addLast(10);
		list1.addLast(12);
		list1.addLast(45);
		list1.addLast(66);
		list1.addLast(67);
		list1.addLast(70);
		
		LinkedList list2= new LinkedList();
		list2.addLast(20);
		list2.addLast(40);
		list2.addLast(60);
		list2.addLast(80);
		
		LinkedList mergedList= LinkedList.mergeList(list1,list2);
		
		mergedList.display();

	}
	public static class Node {
		private int data;
		private Node next;

	}

	public static class LinkedList {

		Node tail;
		Node head;
		int size;

		public void addLast(int data) {
			Node node = new Node();
			node.data = data;
			node.next = null;

			if (head == null) {
				head = node;
				tail = node;
			} else {
				tail.next = node;
				tail = node;
			}
			size++;
		}

		public void addFirst(int data) {
			Node node = new Node();
			node.data = data;

			if (head == null) {
				node.next = null;
				head = node;
				tail = node;
			} else {
				node.next = head;
				head = node;
			}
			size++;
		}
		public void display() {
			Node temp = head;
			if (temp == null) {
				System.out.println("No items in list");
			}
			while (temp != null) {
				System.out.print(temp.data + " -->");
				temp = temp.next;
			}
			System.out.println();
		}
		
		public static LinkedList mergeList(LinkedList l1, LinkedList l2) {
			Node list1= l1.head;
			Node list2= l2.head;
		
			
			LinkedList list= new LinkedList();
			
			while(list1 != null && list2 != null) {
				
				if(list1.data <= list2.data) {
					list.addLast(list1.data);
					list1 = list1.next;
				} else {
//					System.out.println(list2.data);
					list.addLast(list2.data);
					list2 = list2.next;
				}
			}
			
			while(list1 != null) {
				list.addLast(list1.data);
				list1=list1.next;
			}
			
			while(list2 != null) {
				list.addLast(list2.data);
				list2=list2.next;
			}
			
			return list;
		}
	}
	
	

}
