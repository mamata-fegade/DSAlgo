package array;

public class PushNegative {

	public static void main(String[] args) {

		int arr[] = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
//		 int arr[] = {1, -1, 3, 2, -7, -5, 11, 6 };

		int arr2[] = { -8, 9, 5, 10, 2, 6, -7, 7 };
		int n = arr.length;

		// Rearrange(arr, n);
		rearrangeWithOrder(arr, n);
		
		reaarange(arr2, arr2.length);
		

		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println("\n without preserving order");
		for (int i : arr2) {
			System.out.print(i + " ");
		}
	}

	public static void reaarange(int[] arr, int n) {

		int j=0;
		for (int i = 0; i < n; i++) {

			if (arr[i] < 0) {
				if(i!=j)
				{	
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j++;
			}
		}

	}

	public static void rearrangeWithOrder(int[] arr, int n) {
		int[] temp = new int[n];
		int j = 0;

		for (int i = 0; i < n; i++) {
			if (arr[i] > 0) {
				temp[j] = arr[i];
				j++;
			}

		}

		if (j == n || j == 0)
			return;

		for (int i = 0; i < n; i++) {
			if (arr[i] < 0) {
				temp[j] = arr[i];
				j++;
			}

		}
		for(int i=0; i<n;i++)
		{
			arr[i]= temp[i];
		}
		
	}
	// for ip -8 9 5 10 2 6 -7 7
	// correct o/p 9 5 10 2 6 7 -8 -7

}
