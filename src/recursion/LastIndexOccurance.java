package recursion;



import java.util.*;

public class LastIndexOccurance {

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

		//int index = findLastIndex(array, 0, number);
		
	//	System.out.println("Index is "+index);
		
		int index = findLastIndex(array, n-1, number);
		
		System.out.println(" last Index is "+index);
		sc.close();
	}

	public static int findLastIndex(int array[],int index,int tofindNumber)
	{
		
		if(index == 0)
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
				int occurance= findLastIndex(array, index-1, tofindNumber);
				return occurance;
			}
			
		
	
		
	}

	
	

}
