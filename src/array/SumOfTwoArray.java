package array;

import java.util.Scanner;

public class SumOfTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	Scanner sc = new Scanner(System.in);
		Scanner sc= new Scanner(System.in);
		int n1 = sc.nextInt();
		int array[] = new int[n1];
		
		for(int i=0; i< n1; i++)
		{
			array[i]= sc.nextInt();
		}
		
		int n2 = sc.nextInt();
		int array2[] = new int[n2];
		
		for(int i=0; i< n2; i++)
		{
			array2[i]= sc.nextInt();
		}
		
		 int [] sum=  new int[n1>n2 ? n1: n2];
		 
		 int c=0;
		 int i=n1-1; 
		 int j= n2-1; 
		 int k= sum.length-1;
		 
		 while(k>=0)
		 {
			  	int d=c;
			  	
			  	if(i >= 0) {
			  		d+= array[i];
			  	}
			  	if(j >=0) {
			  		d+= array2[j];
			  	}
			  	
			  	c= d/10;
			  	d=d%10;
			  	
			  	sum[k]=d;
			  	k--;
			  	i--;
			  	j--;
		 }
		 
 		 if(c != 0) {
			 System.out.println(c);
		 }

 		 for(int val: sum)
 		 {
 			 System.out.println(val);
 		 }
		sc.close();

	}

}
