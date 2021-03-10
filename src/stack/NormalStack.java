package stack;

public class NormalStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackN<String> stack= new StackN<String>(3);
		
		stack.push("Mamata");
			
		stack.push("Dhruv");
			
		stack.push("Pankaj");
		System.out.println(stack.size());
		
		stack.push("Pankaj2");
		stack.push("Pankaj3");
		stack.push("Pankaj4");
		stack.push("Pankaj5");
		
		
		System.out.println(stack.size());
		stack.display();
		System.out.println("peek element is: "+stack.peek());

	}

}

class StackN<T> {
	
	private T[] data;
	private int maxSize;
	private int top;
	
	StackN(){
		this(0);
	}
	@SuppressWarnings("unchecked")
	StackN(int maxSize){
		
		if(maxSize ==0)
			this.maxSize=10;
		else
			this.maxSize=maxSize;
		
		data = (T[])new Object[this.maxSize];
		this.top=-1;
	}
	
	public boolean isFull() {
		if(top == maxSize-1) {
			return true;
		}
		else return false;
	}
	
	public T peek() {
		
		if(top == -1) {
			return null;
		}
		else
		{
			return this.data[top];
		}
	}
	
	public T push(T d) {
		
		if(top == maxSize-1) {
			doubleSize();
		}
		
		top++;
		this.data[top]=d;
		return d;
		
	}
	
	public T pop() {
		if(top == -1) {
			return null;
		}
		else {
			 return this.data[top--];
		}
	}
	
	public int size() {
		return top+1;
	}
	
	public void display() {
		
		for(int i=top; i >=0; i--) {
			System.out.print(data[i]+" ");
		}
		System.out.println();
		
	}
	
	private void doubleSize() {
		@SuppressWarnings("unchecked")
		T[] data2 = (T[])new Object[maxSize*2];
		for(int i=0; i<maxSize; i++) {
			data2[i]= data[i];
		}
		this.maxSize=maxSize*2;
		this.data= data2;
		
		
	}
}
