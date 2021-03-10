package array;

import java.util.Arrays;

public class MinMaxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int input[] = {45,23,9,12,87,34};
		
		findMinMax(input);
	}
	
	int middle(int A, int B, int C){
        //code here
		
        if(A>B && A<C || A>C && A<B)
            return A;
          else if(B>A && B<C || B>C && B<A)
            return B;
             else if(C>A && C<B || C >B && C<A)
                return C;
            
            return -1;
    }
	
	public static void findMinMax(int [] input)
	{
	
		if(input.length==0)
			return;
		int min= input[0];
		int max= input[0];
		
		for(int i=0; i<input.length;i++)
			
		{
			if(input[i]<min)
				min=input[i];
			if(input[i]>max)
				max=input[i];
		}
		System.out.println("Minimum no is "+min);		
		System.out.println("Minimum no is "+max);		
	}
	
	
}
