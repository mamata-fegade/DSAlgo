package string;
import java.util.*;
public class KeyPadCombinationPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String str= sc.next();
		
		printKbc(str,"");
		sc.close();
	}
	
	static String [] codes= {",;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
	public static void printKbc(String question,String answer)
	{
		if(question.length()==0)
		{
			System.out.print(answer+"  ");
			return;
		}
		char ch=question.charAt(0);
		String remainingString=question.substring(1);
		
		String codeForCh= codes[ch-'0'];// 0 is 48 and ch is suppose 56 so 56-48=8
		
		for(int i=0; i<codeForCh.length();i++)
		{
			char cho= codeForCh.charAt(i);
			printKbc(remainingString,answer+cho);
		}
		
		
	}

}
