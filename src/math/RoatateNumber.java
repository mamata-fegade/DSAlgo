package math;

import java.util.*;

public class RoatateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int number = sc.nextInt();
		int n = sc.nextInt();

		
		int temp = number;
		int nod = 0;
		while (temp > 0) {
			temp = temp / 10;
			nod++;
		}
		
		n=n%nod;
		if(n<0)
		{
			n=n+nod;
		}
	

		int div = 1;
		int mul = 1;

		for (int i = 1; i <= nod; i++) {

			if (i <= n) {
				div = div * 10;
			} else {
				mul = mul * 10;
			}
		}
		
		int q= number/div;
		int re= number %div;
		
		int rotated_number=re*mul+q;
		System.out.println(" roatated number: "+rotated_number);

		sc.close();
	}

}
