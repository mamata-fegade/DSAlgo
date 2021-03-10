package array;

public class subArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, -2, 3, 5, -2 };
		
		int sum= subArrayfindSum(arr);
		System.out.println("MAx sum==" +sum);
		}

	public static int subArrayfindSumBF(int[] arr) {
		int n = arr.length;
		if (n == 0)
			return -1;

		int ans = arr[0];
		

		for (int i = 0; i < n; i++) {
			int sum = 0;

			for (int j = i; j < n; j++) {

				sum =sum +arr[j];
				System.out.println(sum);

				if (sum > ans) {
					ans = sum;
				}
				
			

			}
		}
		return ans;
	}
	
	public static int subArrayfindSum(int[] arr) {
		int n = arr.length;
		if (n == 0)
			return -1;

		int maxSoFar = arr[0];
		int maxEnding=0;
		int j=0;
		

		for (int i = 0; i < n; i++) {
			maxEnding= maxEnding+arr[i];
			
			if(maxEnding>maxSoFar) {
				maxSoFar=maxEnding;
			}
			
			if(maxEnding<0)
			{
				maxEnding=0;
			}
			
		}
		return maxSoFar;
	}


}
