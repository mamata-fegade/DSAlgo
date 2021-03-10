package pattern;
import java.util.Scanner;
public class PatternSwastik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n; j++)
			{
				//System.out.print("*\t");
				if(i==1) // first line code
				{
					if(j <=(n/2)+1 || j==n)
						System.out.print("*\t");
					else
						System.out.print("\t");
					
				}else if(i <= n/2) // 
				{
					if(j ==(n/2)+1 || j==n)
						System.out.print("*\t");
					else
						System.out.print("\t");
					
				}else if(i== n/2+1)
				{
					System.out.print("*\t");
					
				}else if(i < n)
				{
					if(j ==(n/2)+1 || j==1)
						System.out.print("*\t");
					else
						System.out.print("\t");
					
				}else
				{
					if(j >=(n/2)+1 || j==1)
						System.out.print("*\t");
					else
						System.out.print("\t");
				}
				
			}
			

			System.out.println("");
			System.out.println("");
			
		}
		
		
		sc.close();
		
	}

}
