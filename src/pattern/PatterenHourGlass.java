package pattern;

import java.util.Scanner;

public class PatterenHourGlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int star = n;
		int space = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= space; j++) {
				System.out.print("\t");
			}
			for (int j = 1; j <= star; j++) {
				if (i <= n / 2 && i > 1 && j > 1 && j < star) {
					System.out.print("\t");
				}
				else
				{
					System.out.print("*\t");
				}
			}
			if (i <= n / 2) {
				star -= 2;
				space++;
			} else {
				star += 2;
				space--;
			}

			System.out.println("");
		}

	}

}
