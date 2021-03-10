package array;

public class Segregate0and1and2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {2,0 ,2, 0, 0, 1, 2, 2, 2, 1, 1, 0, 1, 1, 1, 2, 0, 1, 2, 1, 0, 1, 2, 0, 0, 0 };
		int[] arr2 = {2,0 ,2, 0, 0, 1, 2, 2, 2, 1, 1, 0, 1, 1, 1, 2, 0, 1, 2, 1, 0, 1, 2, 0, 0, 0 };
//		segregate0and1(arr, 8);
		segregate(arr, arr.length);
		sort012(arr2, arr.length);

		for (int i : arr) {
			System.out.print(i+" ");
		}
		
		System.out.println("Another same try");
		for (int i : arr2) {
			System.out.print(i+" ");
		}

	}

	public static void segregate(int[] arr, int n) {

//		int[] arr = {2,0 ,2, 0, 0, 1, 2, 2, 2, 1, 1, 0, 1, 1, 1, 2, 0, 1, 2, 1, 0, 1, 2, 0, 0, 0 };
		int low = 0;
		int high = n - 1;
		int mid = low;
		
		while(mid<=high)
		{
			//System.out.println("mid =="+mid);
			if(arr[mid]==0)
			{
				int temp =arr[low];
				arr[low]=arr[mid];
				arr[mid]=temp;
				low++;
				mid++;
			}
			
			else if(arr[mid]==2)
			{
				int temp =arr[high];
				arr[high]=arr[mid];
				arr[mid]=temp;
				high--;
				//mid++;
			}
			else if(arr[mid]==1)
				mid++;
			
		}
		
		

//		while (mid<high) {
//			if (arr[low] == 0) {
//				low++;
//				continue;
//			}
//			else if (arr[high] == 0) {
//				int temp = arr[low];
//				arr[low] = arr[high];
//				arr[high] = temp;
//				//System.out.println("low swapped");
//			}
//			if (arr[mid] == 1) {
//				mid++;
//				continue;
//			}
//			else if(arr[high] == 1) {
//				int temp = arr[mid];
//				arr[mid] = arr[high];
//				arr[high] = temp;
//				//System.out.println("mid swapped");
//			}
//			if (arr[high] == 2) {
//				high--;
//				continue;
//			}
//			
//		}
		
		
	}
	
	public static void sort012(int arr[] , int n)
	{
		int low=0; 
		int mid=0; 
		int high=n-1;
		
		while(mid<=high)
		{
			if(arr[mid]==0)
			{
				int temp=arr[low];
				arr[low]=arr[mid];
				arr[mid]=temp;
				low++;
				mid++;
			}
			else if(arr[mid]==1)
			{
				mid++;
			}
			if(arr[mid]==2)
			{
				int temp= arr[high];
				arr[high]=arr[mid];
				arr[mid]=temp;
				high--;
			}
		}
		
		
		
	}

}
