package string;
import java.util.*;
public class PrintPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String");
		String str= sc.next();
		printAllCombination(str,"");
		sc.close();

	}
	
	public static void printAllCombination(String str,String ans)
	{
		
		if(str.length()==0)
		{
			System.out.println(ans);
			return;
		}
		for(int i=0; i< str.length();i++)
		{
			char ch= str.charAt(i);
			String lpart= str.substring(0,i);
			String rpart= str.substring(i+1);
			
			printAllCombination(lpart+rpart,ans+ch);
		}
		
		
	}

}
