package array;

public class Seggregate0and1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,0,0,1,1,0,0,1};
		segregate0and1(arr, 8);
		
		for(int i: arr)
		{
			System.out.println(i);
		}

	}

	public static void segregate(int[] arr, int n) {
		// code here
		int low = 0;
		int high = n - 1;

		while (low < high) {
			if (arr[low] == 0) {
				low++;
				continue;
			}
			if (arr[high] == 1) {
				high--;
				continue;
			}
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;

		}
	}
	
	public static void segregate0and1(int[] arr, int n)
	{
		int low=0;
		int high=n-1;
		
		while(low<high)
		{
			if(arr[low]==1)
			{
				if(arr[high]==0)
				{
					int temp= arr[low];
					arr[low]= arr[high];
					arr[high]= temp;
				}
				else high--;
			}
			else 
				low++;
		}
	}

}
