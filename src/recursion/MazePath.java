package recursion;

import java.util.*;



public class MazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter destination m and n");
		int m = sc.nextInt();
		int n = sc.nextInt();

		ArrayList<String> list = getPaths(1, 1, m, n);

		System.out.println("All possible patha are" + list);
		sc.close();
	}

	public static ArrayList<String> getPaths(int sr, int sc, int dr, int dc) {

		ArrayList<String> hpaths = new ArrayList<String>();
		ArrayList<String> vpaths = new ArrayList<String>();

		if(sc==dc && sr==dr)
		{
			ArrayList<String> baseList= new ArrayList<String> ();
			baseList.add("");
			return baseList;
		}
		if (sc < dc) {
			hpaths = getPaths(sr, sc + 1, dr, dc);
		}
		if (sr < dr) {
			vpaths = getPaths(sr + 1, sc, dr, dc);
		}

		ArrayList<String> paths = new ArrayList<>();

		for (String hpath : hpaths) {
			paths.add("h" + hpath);

		}
		for (String vpath : vpaths) {
			paths.add("v" + vpath);

		}

		return paths;
	}

}
