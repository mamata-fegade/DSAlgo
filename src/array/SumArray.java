package array;

import java.util.Arrays;

public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int [] nums = {2,7,11,15};
	int target = 22;
	int [] output=twoSum(nums,target);
	
	System.out.println(Arrays.toString(output));
	

	}
	
	 public static int[] twoSum(int[] nums, int target) {
	        
	        int sum=0;
	        int j=0;
	        int[] output= new int[2];
	        
	        
	        for(int i=0; i<nums.length;i++)
	        {
	            sum=target-nums[i];
	            j=+1;
	              while(j<nums.length)
	              {
	                  if(nums[j]==sum)
	                  {
	                      output[0]=i;
	                      output[1]=j;
	                      break;
	                  }
	                  j++;
	              }
	        }
	        return output;
	        
	    }

}
