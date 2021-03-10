package recursion;

import java.util.*;

public class StrairPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		ArrayList<String> path = getStairPaths(n);

		System.out.println("All paths are ==" + path);
		sc.close();
	}

	public static ArrayList<String> getStairPaths(int n) {
		if(n==0)
		{
			ArrayList<String> baseList= new ArrayList<String>();
			baseList.add("");
			return baseList;
		}
		else if(n<0)
		{
			ArrayList<String> baseList= new ArrayList<String>();
			return baseList;
		}

		
		ArrayList<String> paths1 = getStairPaths(n - 1);
		ArrayList<String> paths2 = getStairPaths(n - 2);
		ArrayList<String> paths3 = getStairPaths(n - 3);

		ArrayList<String> result = new ArrayList<String>();

		for (String s : paths1) {
			result.add(1 + s);
		}

		for (String s : paths2) {
			result.add(2 + s);
		}
		for (String s : paths3) {
			result.add(3 + s);
		}

		return result;
	}

}
