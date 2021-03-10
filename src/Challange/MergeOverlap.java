package Challange;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class MergeOverlap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int m = sc.nextInt();
		int n = 2;
		int[][] array = new int[m][n];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) { 	
				//System.out.println("=>" + i + " " + j);
				array[i][j] = sc.nextInt();
			}
		}
		
		Stack<Pair> result= merger(array);
		
		for(Pair p :result) {
			System.out.println(p.st+" -- "+p.et);
		}
		sc.close();

	}
	
	public static Stack<Pair> merger(int [][] array) {
		Pair[] pairs= new Pair[array.length];
		
		for(int i=0; i<array.length; i++) {
			pairs[i]= new Pair(array[i][0], array[i][1]);
		}
		
		Arrays.sort(pairs);
		
		for(int i=0; i<array.length; i++) {
			System.out.println(pairs[i].st);
		}
		
		Stack<Pair> stack = new Stack<Pair>();
		
		for(int i=0; i<array.length; i++) {
			
			if(i==0) { //push first item
				
				stack.push(pairs[i]);
				
			}else {
				Pair top= stack.peek();
				
				if(top.et < pairs[i].st) {  //1-12 vs 14-19
					stack.push(pairs[i]);
				}
				else {
					top.et= Math.max(top.et, pairs[i].et);
					
				}
			}
		}
		
		Stack<Pair> result = new Stack<Pair>();
		
		while(stack.size() >0) {
			result.push(stack.pop());
		}
		
		return result;
		
	}
	
	

}
 class Pair implements Comparable<Pair>{ 
	 
	 int st; 
	 int et;
	 Pair(int st, int et){
		 this.st=st;
		 this.et=et;
	 }
	 
	 public int compareTo(Pair p1) {
		 
		if(this.st < p1.st)
			return -1;
		else if(this.st > p1.st)
			return 1;
		else return 0;
	}
	 
 }