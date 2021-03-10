package array;
import java.util.Scanner;
public class findSpan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int array[] = new int[n]
;
		
		for(int i=0; i< n; i++)
		{
			array[i]= sc.nextInt();
		}

		int max=array[0]; 
		int min=array[0];
		
		for(int i=1; i<n; i++)
		{
			if(array[i]<min)
			{
				min = array[i];
			}
			if(array[i]>max)
			{
				max = array[i];
			}
		}
		
		System.out.println("span is==" + (max-min));
		sc.close();
		
	}

}
