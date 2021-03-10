package recursion;

import java.util.Scanner;

public class MaxArrayREcursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int n=sc.nextInt();
		int [] array= new int [n];
		System.out.println("Enter array elements one by one");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		
		
		int maxEle=maxArrayRecursion(array,0);
		System.out.println("Maximum element is"+maxEle);
		sc.close();
	}
	
	public static int maxArrayRecursion(int [] array,int index)
	{
		if(index == array.length-1)
		{
			return array[index];
		}
		int max =maxArrayRecursion(array,index+1);
		
		if(max >array[index])
			return max;
		else
			return array[index];
		
	}


}
