package recursion;

import java.util.Scanner;

public class PrintMazePathWithJump {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter m and n");
		int m = sc.nextInt();
		int n = sc.nextInt();
		sc.close();
		if(m>5 || n>5)
		{
			System.out.println("Too big number for maze");
			return;
		}
			printMazePaths(1, 1, m, n, "");

		

	}

	public static void printMazePaths(int sr, int sc, int dr, int dc, String path) {
		
		if (sc == dc && sr == dr) {

			System.out.print(path + "  ");
			return;
		}

		for (int move = 1; move <= dc-sc; move++) {
			printMazePaths(sr, sc + move, dr, dc, path + "h"+move);
		}
		for (int move = 1; move <= dr-sr; move++) {
			printMazePaths(sr + move, sc, dr, dc, path + "v"+move);
		}

		for (int move = 1; move <= dr-sr && move <= dc-sc; move++) {
			printMazePaths(sr + move, sc + move, dr, dc, path + "d"+move);
		}

	}

}
