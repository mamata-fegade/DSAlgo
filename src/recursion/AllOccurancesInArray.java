package recursion;

import java.util.*;

public class AllOccurancesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter array sizze");
		int n = sc.nextInt();
		int array[] = new int[n];

		System.out.println("Enter array elements ");

		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Enter  element to search ");

		int data = sc.nextInt();

		int[] indices = findOccurances(array, 0, data,0);

		if (indices.length != 0) {
			for (int i = 0; i < indices.length; i++) {
				System.out.println(" " + indices[i]);
			}
		} else {
			System.out.println("Not found");
		}

		sc.close();
	}

	public static int[] findOccurances(int[] array, int index, int data, int fsf) {

		if(index==array.length)
		{
			return new int[fsf];
		}
		
		if(array[index]==data)
		{
			fsf++;
		}
		int[] indices=findOccurances(array, index+1,data,fsf);
		if(array[index]==data)
		{
			
			indices[--fsf]=index;
			
		}
		return indices;
	}

}
