package string;

import java.util.Scanner;
import java.util.*;

public class KeyPadCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str= sc.next();
		ArrayList<String> list= getkeys(str);
		
		System.out.println("List is"+list);
		sc.close();
	}
	
	static String[] keys= {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
	
	public static ArrayList<String> getkeys(String str)
	{
		if(str.length()==0)
		{
			ArrayList<String> baseList= new ArrayList<String>();
			baseList.add("");
			return baseList;
		}
		char ch= str.charAt(0);
		String remainingString= str.substring(1);
		ArrayList<String> returnedStrings =getkeys(remainingString);
		
		ArrayList<String> result= new ArrayList<String>();
		
		String charAtIndex =keys[ch-'0'];
		
		for(int i=0; i<charAtIndex.length();i++)
		{
			for(String s: returnedStrings)
			{
				result.add(charAtIndex.charAt(i)+s);
			}
		}
		
		return result;
	}

}
