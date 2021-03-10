package string;

import java.util.*;
public class SubSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="ABC";
		
		System.out.println("The subsequence are"+subsequnceRecursion(str));

	}
	
	public static ArrayList<String> subsequnceRecursion(String str)
	{
		if(str.length()==0)
		{
			ArrayList<String> baseResult = new ArrayList<String>();
			baseResult.add("");
			return baseResult;
		}
		
		char ch= str.charAt(0);
		String reaminingString=str.substring(1);
		ArrayList<String> rrecursiveResult=subsequnceRecursion(reaminingString);
		
		ArrayList<String> result= new ArrayList<>();
		
		for(String rstr: rrecursiveResult)
		{
			result.add(""+rstr);
			
		}
		
		for(String rstr: rrecursiveResult)
		{
			result.add(ch+rstr);
			
		}
		
		
		return result;
	}

}
