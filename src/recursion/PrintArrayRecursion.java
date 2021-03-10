package recursion;
import java.util.*;
public class PrintArrayRecursion {

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
		
		System.out.println("Your array: ");
		printRecursive(array,0);
		System.out.println("\n Your array in reverse order : ");
		printRecursiveReverse(array,n-1);
		sc.close();
	}

	
	public static void printRecursive(int[] array,int index)
	{
		if(index == array.length)
		{
			return;
		}
		System.out.print("  "+array[index]);
		printRecursive(array,index+1);
		
		
	}
	
	public static void printRecursiveReverse(int[] array,int index)
	{
		
		if(index <0)
		{
			return;
		}
		System.out.print("  "+array[index]);
		printRecursiveReverse(array,index-1);
		
		
		
	}
}
