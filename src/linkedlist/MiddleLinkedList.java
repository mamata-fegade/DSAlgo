package linkedlist;





public class MiddleLinkedList {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		list.addLast(60);
		list.addLast(70);
		list.addLast(80);
		list.addLast(90);
		
		
		int middle=list.findMiddle();
		System.out.println("middle: "+middle);

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

		public void addAt(int data, int index) {
			Node node = new Node();
			node.data = data;

			if (index < 0 || index > size) {
				System.out.println("Invalid argument");
				return;
			}
			if (head == null) {
				node.next = null;
				head = node;
				tail = node;
				size++;
			} else if (index == size) {
				addLast(data);
				System.out.println("Item added at last");

			} else {
				Node temp = head;
				for (int i = 0; i < index - 1; i++) {
					temp = temp.next;
				}
				node.next = temp.next;
				temp.next = node;
				size++;
			}
			
		}

		public int size() {
			return size;
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

		public void removeFirst() {
			if (size == 0) {
				System.out.println("No items in list");
				return;
			}
			if (head == tail) {
				head = null;
				tail = null;
				size = 0;
			} else {
				head = head.next;
				size--;
			}
		}

		public int getFirst() {

			if (size == 0) {
				return -1;
			}
			return head.data;

		}

		public int getLast() {

			if (size == 0) {
				return -1;
			}
			return tail.data;
		}

		public int getAt(int index) {
			if (size == 0) {
				return -1;
			}
			if (index > size - 1 || index < 0) {
				System.out.println("Invalid index");
				return -1;
			}
			Node temp = head;
			int count = 0;
			while (count < index) {
				temp = temp.next;
				count++;
			}
			return temp.data;

		}

		public void removeLast() {
			if (size == 0) {
				System.out.println("No items in list");
				return;
			}
			if (head == tail) {
				head = null;
				tail = null;
				size = 0;
				return;
			} else {

				Node temp = head;
				while (temp.next != tail) {
					temp = temp.next;
					//System.out.println("at remove data: "+temp.data);
				}
				temp.next = null;
				tail = temp;
				size--;
			}
		}

		public void removeAt(int index) {
			if (size == 0) {
				System.out.println("No items in list");
				return;
			} else if (index < 0 || index > size) {
				System.out.println("Invalid argument");
				return;
			} else if (index == 0) {
				removeFirst();
			} else if (index == size - 1) {
				removeLast();
			} else {

				Node temp = head;
				for (int i = 0; i < index - 1; i++) {
					temp = temp.next;
				}
				temp.next = temp.next.next;
				size--;
			}
		}
		
		private Node getNodeAt(int index) {
			
			Node temp = head;
			int count = 0;
			while (count < index) {
				temp = temp.next;
				count++;
			}
			return temp;
		}
		
		
		public  int findMiddle() {
			
			Node middle= head;
			Node temp= head;
			
			while(temp != null && temp.next !=null) {
				temp= temp.next.next;
				
				if(temp!= null) {
					middle= middle.next;
				}
				
			}
			
			return middle.data;
		}
		
	}
	
}
