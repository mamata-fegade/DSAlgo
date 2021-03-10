package pattern;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*  ");
			}
			System.out.println(" ");
		}
		System.out.println(" ------------------------------------------");

		for (int i = n; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				System.out.print("*  ");
			}
			System.out.println(" ");
		}

		System.out.println(" ------------------------------------------");

		int space = n - 1;
		int star = 1;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= space; j++) {
				System.out.print("\t");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print("*\t");
			}
			space--;
			star++;
			System.out.println("");
		}
		System.out.println(" ------------------------------------------");

		space = 0;
		star = n;
		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= space; j++) {
				System.out.print("\t");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print("*\t");
			}
			space++;
			star--;
			System.out.println("");
		}
		System.out.println(" ------------------------------------------");

		space = n / 2;
		star = 1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print("\t");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print("*\t");
			}
			if (i <= n / 2) {

				space--;
				star += 2;
			} else {

				space++;
				star -= 2;
			}
			System.out.println("");
		}

		System.out.println(" ------------------------------------------");

		star = n / 2 + 1;
		space = 1;

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= star; j++) {
				System.out.print("*\t");
			}
			for (int j = 1; j <= space; j++) {
				System.out.print("\t");
			}
			for (int j = 1; j <= star; j++) {
				System.out.print("*\t");
			}

			if (i <= n / 2) {
				star--;
				space += 2;
			} else {

				star++;
				space -= 2;
			}
			System.out.println("");
		}
		
		System.out.println(" -----------------------------------------------------------");

		for(int i=1; i<= n;i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i == j)
				{
					System.out.print("*\t");
				}
				else
				{
					System.out.print("\t");
				}
			}
			System.out.println("");
		}
		
		System.out.println(" -----------------------------------------------------------");

		for(int i=1; i<= n;i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i+j == n+1)
				{
					System.out.print("*\t");
				}
				else
				{
					System.out.print("\t");
				}
			}
			System.out.println("");
		}
		
		System.out.println(" -----------------------------------------------------------");

		for(int i=1; i<= n;i++)
		{
			for(int j=1; j<=n; j++)
			{
				if(i==j)
				{
					System.out.print("*\t");
				}
				
				else if(i+j == n+1)
				{
					System.out.print("*\t");
				}
				else
				{
					System.out.print("\t");
				}
			}
			System.out.println("");
		}

		System.out.println("--------------------------------------------------------------------\n");
		int outerSpace=n/2;
		int innerSpace=-1;
		
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=outerSpace;j++)
			{
				System.out.print("\t");
			}
			System.out.print("*\t");
			for(int j=1; j<=innerSpace;j++)
			{
				System.out.print("\t");
			}
			
			if(i>1 &&  i<n)
			{
				System.out.print("*\t");
			}
			
			if(i<= n/2)
			{
				outerSpace--;
				innerSpace+=2;
			}
			else
			{
				outerSpace++;
				innerSpace-=2;
			}
			System.out.println("");
		}

		sc.close();
	}
	
	
}
