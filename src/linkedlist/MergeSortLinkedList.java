package linkedlist;

public class MergeSortLinkedList {

	public static void main(String[] args) {

		LinkedList list1 = new LinkedList();
	/*	list1.addLast(14);
		list1.addLast(10);
		list1.addLast(4);
		list1.addLast(60);
		list1.addLast(76);
		list1.addLast(170);
		list1.addLast(50);
		list1.addLast(20);
		list1.addLast(80); 
		
		LinkedList mergedList= LinkedList.mergeSortList(list1.head,list1.tail);
		mergedList.display();
		*/
		
		list1.addLast(10);
		list1.addLast(10);
		list1.addLast(20);
		list1.addLast(20);
		list1.addLast(30);
		list1.addLast(40);
		list1.addLast(40);
		list1.addLast(40);
		list1.addLast(50);
		list1.addLast(50);
		list1.addLast(60);
		
		LinkedList ulist= LinkedList.removeDuplicate(list1);
		
		ulist.display();
	

		

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
		
		private static Node  midNode(Node head, Node tail) {
			
			Node mid = head;
			Node temp = head;
			while(temp != tail && temp.next != tail) {
				temp= temp.next.next;
				if(temp!= null) {
					mid= mid.next;
				}
			}
			return mid;
		}
		
		public static LinkedList mergeSortList(Node head, Node tail){
			
			
			Node mid = midNode(head, tail);
			if(tail==head) {
				LinkedList baseResult= new LinkedList();
				baseResult.addLast(head.data);
				return baseResult;
			}
			
			LinkedList fsh=mergeSortList(head,mid);
			LinkedList ssh=mergeSortList(mid.next,tail);
			LinkedList sortedList =mergeList(fsh,ssh);
			
			return sortedList;
		}
		
		private static LinkedList mergeList(LinkedList list1, LinkedList list2) {
			
			Node head1=list1.head;
			Node head2=list2.head;
			
			LinkedList list= new LinkedList();
			
			while(head1 != null && head2 != null) {
				if(head1.data <= head2.data) {
					list.addLast(head1.data);
					head1= head1.next;
				}
				else if(head2.data <head1.data) {
					list.addLast(head2.data);
					head2= head2.next;
				}
			}
			
			while(head1 != null) {
				list.addLast(head1.data);
				head1= head1.next;
			}
			while(head2 != null) {
				list.addLast(head2.data);
				head2= head2.next;
			}
			return list;
		}
		
		public static LinkedList removeDuplicate(LinkedList list) {
			
			Node tempHead= list.head;
			
			LinkedList uniqueList= new LinkedList();
			
			uniqueList.addLast(tempHead.data);
			tempHead= tempHead.next;
			
			while(tempHead != null) {
				
				if(uniqueList.tail.data != tempHead.data) {
					uniqueList.addLast(tempHead.data);
					
				}
				tempHead= tempHead.next;
			}
			
			return uniqueList;
		}
	}
}