package array;

import java.util.ArrayList;

public class FindDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] input = { 1, 3, 4, 2, 2, 1,5,2,6, };

		//duplicateBF(input);
		duplicateFind(input);

	}

	static void duplicateBF(int[] input) {
		int n = input.length;
		if (n == 0)
			return ;

		for (int i = 0; i < n; i++) {
			int count =0;
			if (input[i] != -1) {
				for (int j = i+1; j < n; j++) {
					if (input[i] == input[j]) {
						count++;
						input[j] = -1;
					}
				}
				if(count>0)
					System.out.println(input[i]+" is duplicate no "+count+" times");
			}

		}

	
	}
	
	static void duplicateFind(int [] input)
	{
		int[] hash = new int[input.length];
		
		
		for(int i=0; i<input.length;i++)
		{
			hash[input[i]]= hash[input[i]]+1 ;
		}
		
		for(int i=0;i<hash.length;i++)
		{
			if(hash[i]>1)
			{
				System.out.println(i+" is duplicate no "+hash[i]+" times");
			}
		}
		
	}
	
	public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        int[] hash = new int[n];
        ArrayList<Integer> duplicate = new ArrayList<Integer>(n);
		
		
		for(int i=0; i<n;i++)
		{
			hash[arr[i]]= hash[arr[i]]+1 ;
		}
		
		for(int i=0;i<hash.length;i++)
		{
			if(hash[i]>1)
			{
			    duplicate.add(i);
			}
		}
     if(duplicate.size()==0)
     
       duplicate.add(-1);
     
    
     
      return duplicate;
        
    }
}
