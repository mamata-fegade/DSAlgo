package math;
import java.util.Scanner;
public class BenjminBulb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		//we discuss the solution of the puzzle Benjamin Bulbs. To understand the puzzle, click here: 
		//For a better experience and more exercises, VISIT: https://www.pepcoding.com/resources/o...
		
		//solution
		// perfect square root we have to check because if number has even number
		//of prime factorial then it will be off at  the end. and if it is odd then it will be on
		
		for(int i=1; i*i<=n; i++)
		{
			System.out.print(" "+ i);
		}
		sc.close();
	}

}
