package pattern;
import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n= sc.nextInt();
		int count=1;
		for(int i=1; i<=n;i++)
		{
			for(int j=1; j<= i; j++)
			{
				System.out.print(count+"\t");
				count++;
			}
			System.out.println(" ");
			
		}
	}

}
