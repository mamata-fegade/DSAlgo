package recursion;

import java.util.*;

public class FirstIndexOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size ");
		int n = sc.nextInt();
		int array[] = new int[n];
		System.out.println("Enter array Element");

		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Enter number to find ");

		int number = sc.nextInt();

		//int index = findIndex(array, 0, number);
		
	//	System.out.println("Index is "+index);
		
		int index = findIndexOptimized(array, 0, number);
		
		System.out.println("Index is "+index);
		sc.close();
	}

	public static int findIndex(int array[],int index,int tofindNumber)
	{
		
		if(index == array.length-1)
		{
			if(array[index]== tofindNumber)
				return index;
			else
				return -1;
		}
		
		int occurance= findIndex(array, index+1, tofindNumber);
		
			if(array[index]==tofindNumber)
			{
				occurance=index;
			}
		
		return occurance;
		
	}

	
	public static int findIndexOptimized(int array[],int index,int tofindNumber)
	{
		
		if(index == array.length-1)
		{
			if(array[index]== tofindNumber)
				return index;
			else
				return -1;
		}
		if(array[index]==tofindNumber)
		{
			return index;
		}
		else
		{
	
			int fiins=findIndex(array, index+1, tofindNumber);
			return fiins;
		}
		
	}

}
