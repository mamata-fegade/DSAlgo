package math;
import java.util.*;
public class GcdLcm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc= new Scanner(System.in);
		int no1= sc.nextInt();
		int no2= sc.nextInt();
		
		int ono1=no1;
		int ono2=no2;
		
		while(no1%no2 !=0) // no1=36/n02=24
		{
			int rem= no1%no2;
			no1=no2;
			no2=rem;
		}
		
		int gcd= no2;
		
		int lcm= (ono1*ono2)/gcd;
		
		System.out.println(gcd);
		System.out.println(lcm);
		
	}

}
