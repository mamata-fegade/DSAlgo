package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class MazeWithJump {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter destination m and n");
		int m = sc.nextInt();
		int n = sc.nextInt();

		ArrayList<String> list = getMazePaths(1, 1, m, n);

		System.out.println("All possible patha are" + list);

		sc.close();

	}

	public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
		if (sr == dr && sc == dc) {
			ArrayList<String> basePath = new ArrayList<String>();
			basePath.add("");
			return basePath;

		}
		ArrayList<String> paths = new ArrayList<String>();

		for (int msize = 1; msize <= dc - sc; msize++) {

			ArrayList<String> hpaths = getMazePaths(sr, sc + msize, dr, dc);

			for (String hpath : hpaths) {
				paths.add("h" + msize + hpath);
			}
		}

		for (int msize = 1; msize <= dr - sr; msize++) {

			ArrayList<String> vpaths = getMazePaths(sr + msize, sc, dr, dc);

			for (String vpath : vpaths) {
				paths.add("v" + msize + vpath);
			}
		}

		for (int msize = 1; msize <= dr - sr && msize <= dc - sc; msize++) {

			ArrayList<String> dpaths = getMazePaths(sr + msize, sc + msize, dr, dc);

			for (String dpath : dpaths) {
				paths.add("d" + msize + dpath);
			}
		}

		return paths;
	}

}
