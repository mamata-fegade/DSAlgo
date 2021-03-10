package pattern;

import java.util.Scanner;

public class Patteren5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int space = n / 2;
		int star = 1;
		int value = 1;
		for (int i = 1; i <= n; i++) {
			
			int k = value;
			for (int j = 1; j <= space; j++) {
				System.out.print("\t");
			}
			for (int j = 1; j <= star; j++) {

				System.out.print(k + "\t");

				if (j <= star/ 2) {
					k++;

				} else {
					k--;
				}

			}
			if (i <= n / 2) {
				space--;
				star += 2;
				value++;

			} else {
				space++;
				star -= 2;
				value--;
			}
			System.out.println(" ");
		}
	}

}
