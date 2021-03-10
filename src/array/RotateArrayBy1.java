package array;

public class RotateArrayBy1 {
	
	public static void main(String[] args)
	{
		
		int [] arr = {4,6,2,8,1,9,23,6};
		 rotateArrayBy1(arr, arr.length);
		 
		 for(int i: arr)
		 {
			 System.out.print(" "+i);
		 }
	}
	
	public static void rotateArrayBy1(int arr[], int n)
	{
		
		if(n==0)
		{
			return;
		}
		int temp= arr[0];
		
		for( int i=0; i<n-1; i++)
		{
			arr[i]=arr[i+1];
			
		}
		arr[n-1]=temp;
	}

}
