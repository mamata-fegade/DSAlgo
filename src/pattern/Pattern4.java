package pattern;
import java.util.*;
public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n= sc.nextInt();
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print(j+"\t");
			}
			System.out.println(" ");
		}
		System.out.println("----------------------------------------------------------------------------");
		for(int i=1; i<=10; i++)
		{
		
			System.out.println( n +"  *  "+i +" = "+n*i);
		}
		
	

	}

}
