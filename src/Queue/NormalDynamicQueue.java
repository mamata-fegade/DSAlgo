package Queue;

public class NormalDynamicQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QueueN<String> queue= new QueueN<String>();
		
		System.out.println("item added "+ queue.add("Mamata"));
		System.out.println("item added "+ queue.add("Pankaj"));
		System.out.println("item added "+ queue.add("Dhruv"));
		
		System.out.println("item added "+queue.add("Mamata1"));
		System.out.println("item added "+queue.add("Pankaj1"));
		System.out.println("item added "+ queue.add("Dhruv1"));
		
		System.out.println("size =="+queue.size());
		queue.display();
		String name= queue.remove();
		System.out.println("item removed "+name);
		
		System.out.println("item added "+queue.add("Mamata2"));
		System.out.println("item at peek "+queue.peek());
		
		queue.display();
		
	

	}

}

class QueueN<T>{
	
	private T data[];
	private int front;
	private int size;
	

	public QueueN() {
		this(0);
	}
	
	@SuppressWarnings("unchecked")
	public QueueN(int maxSize) {
		if(maxSize == 0) {
			maxSize=5;
		}
		data =(T[]) new Object[maxSize];
		//System.out.println("this.size"+this.size);
		this.front=0;
		this.size=0;
		
	}

	int size() {
		return size;
	}
	
	void display() {
		
		for(int i=0; i < size; i++) {
			int index= (front+i)%data.length;
			System.out.print(data[index]+" ");
		}
		System.out.println();
	}
	
	
	public T add(T d) {
		if(size == data.length)
		{
			//System.out.println("Data OverFlow");
			maximizeSize();
			//return null;
		}  
			int rear=(front+size)% data.length;
			data[rear]=d;
			size++;
		
		return d;
	}
	
	public T peek() {
		if(size==0) {
			System.out.println("Queue is Empty");
			return null;
		}
		else {
			return data[front];
		}
		
	}
	
	public T remove() {
		if(size== 0) {
			System.out.println("Queue undrflow");
			return null;
		}else {
			T val= data[front];
			front= (front+1) % data.length;
			size--;
			return val;
		}
		
		
	}
	
	@SuppressWarnings("unchecked")
	private void maximizeSize() {
		T[] data1 =(T[]) new Object[data.length*2];
		
		for(int i=0; i < size; i++) {
			int index= (front+i)%data.length;
			data1[i]=data[index];
		}
		this.data=data1;
		this.front=0;
	}
	
		
}
