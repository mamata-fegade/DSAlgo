package array;

import java.util.HashSet;

public class UnionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] a = {1,2,3,4,5};
		int [] b = {1,2,3};
		
		int uni=doUnion(a,a.length,b,b.length);
		System.out.println("union count is"+uni);
		
		

	}
	
	static int doUnion(int a[], int n, int b[], int m)  {
	    //code here
		
		HashSet<Integer> union = new HashSet<Integer>();	
		
		for(int i :a)
		{
			union.add(i);
			
		}
		for(int i:b)
		{
			union.add(i);
		}
		
		return union.size();
		
	}

}
