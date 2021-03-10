package array;

import java.util.Arrays;

public class InversionCount {
	//static long count=0;

	public static void main(String [] args)
	{
	    long arr[]= {2, 4, 1, 3, 5};
	    long N=4;
	    
	    
	   // System.out.println("count == "+inversionCount(arr,N));
	    System.out.println("count by merger sort == " +mergesort(arr,0,N));
	    
	    
	    
	}
	    static long inversionCount(long arr[], long N)
	    {
	        // Your Code Here
	    	
	    	//takes too much time should be optimized code
	        int count=0;
	        
	        for(int i=0;i<N;i++)
	        {
	            int j=(int)N-1;
	            while(j>i)
	            { 
	                if(arr[i]>arr[j])
	                {
	                    count++;
	                
	                }
	                j--;
	                
	            }
	        }
	        return count;
	    }
	    
	    static long mergesort(long[] arr,int low,long high) {
	    	
	    	long count=0;
	    	if(low<high)
	    	{
	    		int mid=(low+(int)high)/2;
	    		
	    		count+=mergesort(arr,low,mid);
	    		count+=mergesort(arr,mid+1,high);
	    		count+=merge(arr,low,mid,high);
	    		System.out.println("Count =="+count);
	    	}
	    	
	    	 System.out.println(Arrays.toString(arr));
	    	 return count;
	    	 
	    	
	    	
	    }
	    
	    static long merge(long[] arr,int low,int mid,long high)
	    {
	    	int i,j,k;
	    	
	    	i=low;
	    	k=low;
	    	long inv_count=0;
	    	j=mid+1;
	    	long [] temp= new long[100];
	    	
	    	
	    	while(i<=mid && j<=high)
	    	{
	    		if(arr[i] <=arr[j])
	    		{
	    			temp[k]=arr[i];
	    			k++;
	    			i++;
	    		}
	    		else
	    		{
	    			temp[k]=arr[j];
	    			j++;
	    			k++;
	    			inv_count=inv_count+((mid+1)-i);
	    			System.out.println("inv count"+inv_count);
	    		}
	    	}
	    	for(;i<=mid;i++)
	    	{
	    		temp[k]=arr[i];
	    		k++;
	    	}
	    	for(;j<=high;j++)
	    	{
	    		temp[k]=arr[j];
	    		k++;
	    	}
	    	
	    	for(i=low;i<=high;i++)
	    	{
	    		arr[i]=temp[i];
	    	
	    	}
	    	
	    	return inv_count;
	    	
	    }
	    
	}





