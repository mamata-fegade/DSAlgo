package math;

import java.util.Scanner;

public class PowerCalulate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=  new Scanner(System.in);
		System.out.println("Enter x and n");
		int x=sc.nextInt();
		int n= sc.nextInt();
		//int pow=power(x,n);
		long pow= powerLog(x,n);
		System.out.println("pow =="+pow);
		sc.close();
		

	}
	
	static int power(int x,int n)
	{
		if(n==0)
		{
			return 1;
		}
	
		int xn = power(x,n-1);
		return xn*x;
	}
	
	static long powerLog(int x, int n)
	{
		if(n==0)
		{
			return 1;
		}
		
		long xbn2= powerLog(x,n/2);
		long pow= xbn2*xbn2;
		System.out.println("pow in fun "+pow);
		
		if(n%2==1)
		{
			pow=pow*x;
		}
		
		return pow;
	}

}
