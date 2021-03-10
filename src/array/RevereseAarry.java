package array;

public class RevereseAarry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input[] = {3,4,5,6,7};
		reverseArray(input);
		
		System.out.println("after reverse array");
		
		for(int i :input)
		{
			System.out.println(i+"");
		}
		
		String str= new String("this is new String");
		
		reverseString(str);
		
		
	}
	
	public static String reverseString(String str)
	{
		if(str.length()==0)
		{
			 return null;
		}
		
		char strArray[] = str.toCharArray();
		
		int low=0;
		int high=strArray.length-1;
		
		while(low<high)
		{
			char temp= strArray[low];
			strArray[low]=strArray[high];
			strArray[high]= temp;
			low++;
			high--;
		}
		
		
		
		return String.valueOf(strArray);
	}
	
	public static void reverseArray(int input[])
	{
		if(input.length==0)
			return;
		
		
		int low=0;
		int high=input.length-1;
		
		
		while(low<high)
		{
			int temp=input[low];
			input[low]=input[high];
			input[high]=temp;
			low++;
			high--;
		}
		
	}
	
	

}
