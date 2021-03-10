package array;

import java.math.BigInteger;
import java.util.Arrays;

//import java.math.BigInteger;

public class MissingArrayNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 1, 2, 3, 5 };

		// System.out.println(MissingNumber(array,5));

		//System.out.println(trailingZeroes(384));
		System.out.println(trailingZeroesRecursive(384));
		
		String path="c:\\abs\\bd\\dd.txt";
		System.out.println(path);
		
		String str[]=path.split(":");
		String str2[]=str[1].split("\\\\");
		
		System.out.println("String length"+ str2[str2.length-2]);
		
		/* int d=13;
		 int n=16;
	    double f=(double)n/(double)d;
	    String fraction=f+"";
	    boolean isPrime=true;
		 
	    System.out.println(fraction+"   ");
	    
	    for(int i=2;i<d/2;i++)
	    {
	    	if(d%i==0)
	    	{
	    		isPrime=false;
	    		
	    		
	    	}
	    }
	    
	    String fractionArray[]=fraction.split("\\.");
	    System.out.println("jjjjj"+Arrays.toString(fractionArray));
	    if(isPrime)
	    {
	    	int len=fractionArray[1].length();
	    	
	    }
	    
	    System.out.println(fractionArray[1]);
	    
	    fraction=fractionArray[0]+".("+(fractionArray[1].charAt(0)+")");
	    System.out.println(fraction);
	   
		*/
	}
	
	static int trailingZeroesRecursive(int N){
		if(N<5)
		return 0;
		return (N/5)+trailingZeroes(N/5);
		}

	static int MissingNumber(int array[], int n) {
		// Your Code Here

		int missingNumber = 0;
		int sum = (n * (n + 1)) / 2;

		System.out.println("Summ==" + sum);

		for (int i = 0; i < n - 1; i++) {
			missingNumber += array[i];
		}
		missingNumber = sum - missingNumber;
		return missingNumber;
	}

	static int trailingZeroes(int N) {
		// Write your code here
		BigInteger fact = BigInteger.ONE;
		if (N < 0) {
			return -1;
		} else if (N <= 1) {
			return 1;

		} else {
			for (int counter = N; counter >= 2; counter--) {
				fact = fact.multiply(BigInteger.valueOf(counter));
			}

		}
		String num = "";

		num = fact + "";
		System.out.println("num==" + num + "==");

		int count = 0;
		for (int i = num.length() - 1; i > 0; i--) {
			if (num.charAt(i) == '0') {
				count++;

			} else {
				System.out.println(num.charAt(i));
				if (i == num.length() - 1)
					return 0;
				else
					break;
			}
		}
		return count;
	}
}
