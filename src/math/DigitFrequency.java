package math;

import java.util.Scanner;

public class DigitFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		
		int digit= sc.nextInt();
		
		System.out.println(findFrequency(n,digit)+"");
	}
	
	public static int findFrequency(long n,int digit)
	{
		int count=0;
		while(n>0)
		{
			int temp=(int)n%10;
			n= n/10;
			if(temp==digit) {
				count++;
			}
		}
		
		return count;
	}

}
