package recursion;

import java.util.*;
public class TowerOfHunai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of disc: ");
		int n= sc.nextInt();
		System.out.println("Enter tower names");
		char twId1=sc.next().charAt(0);
		char twId2=sc.next().charAt(0);
		char twId3=sc.next().charAt(0);
		towerOfHunai(n,twId1,twId2,twId3);
		sc.close();
		

	}
	
	public static void towerOfHunai(int n,char twId1,char twId2,char twId3)
	{
		if(n==0)
			return;
		towerOfHunai(n-1,twId1,twId3,twId2);
		
		System.out.println(n+ "[ "+twId1+ " -> "+twId2+" ] ");
		
		towerOfHunai(n-1,twId3,twId2,twId1);
	}

}
