package linkedlist;

public class Main {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addFirst(100);
		list.addFirst(200);
		list.addFirst(300);
		
		System.out.println("size: "+list.size());
		list.display(); 

	
		
		list.addAt(400, 6); //7
		System.out.println("size after at addat: "+list.size());
		list.display(); 
		
		list.removeLast(); //6
		System.out.println("size after remove last: "+list.size());
		list.display(); 
		
		list.removeAt(2);//5
		System.out.println("size: after remove at "+list.size());
		
		list.display(); 
		
		
		list.reverseList();
		list.display(); 
		list.reverseListPointer();
		list.display(); 
		
		System.out.println("Last = "+list.getLast());
		System.out.println("First: "+list.getFirst());
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
		
		public void reverseList() {
			int start=0;
			int last=size-1;
//			System.out.println("last= "+last);
			
			while(start <last) {
				Node temp1 =getNodeAt(start);
				Node temp2 =getNodeAt(last);
				
				int val =temp1.data;
				temp1.data=temp2.data;
				temp2.data=val;
				start++;
				last--;
			}
		}
		
		public void reverseListPointer() {
			int count=0;
			Node temp=head;
			Node temp1 =null;
			Node temp2=null;
			if(size==1 || size ==0) {
				return;
			}
			else
			{
				while(temp != null) {
					if(count==0) {
						tail=temp;
						count++;
					}
					temp1= temp.next;  // save next node 
					temp.next=temp2;	//set current next to previous 
					temp2=temp;     // save current node as previous
					temp=temp1;		//move to next node
					
					/* 	next = current.next;
			            current.next = prev;
			            prev = current;
			            current = next; */
				}
				head=temp2;
			}
		} //end of function
		
		
		public int kthElementFromEnd(int index) {
			
			
			return 1;
		}

	}

}