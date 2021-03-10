package recursion;

import java.util.*;

public class PrintMazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter m and n");
		int m = sc.nextInt();
		int n = sc.nextInt();

		printMazePaths(1, 1, m, n, "");

		sc.close();

	}

	public static void printMazePaths(int sr, int sc, int dr, int dc, String path) {
		if(sc>dc || sr>dr)
		{
			return;
		}
		if(sr==dr && sc==dc)
		{
			System.out.println(path+"  ");
		}
		
		
		
		
			printMazePaths(sr + 1, sc, dr, dc, path + "h");
	
			printMazePaths(sr + 1, sc + 1, dr, dc, path + "d");

			printMazePaths(sr, sc + 1, dr, dc, path + "v");
		

	}

}
