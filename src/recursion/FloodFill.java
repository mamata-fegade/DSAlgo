package recursion;
import java.util.*;
public class FloodFill {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter m and n");
		
		int m = sc.nextInt();
		int n= sc.nextInt();
	
		int [][] array= new int[m][n];
		
		for(int i=0;i<m;i++)
		{
			for(int j=0; j<n; j++)
			{
				System.out.println("Enter " +i  +"  "+j );
				array[i][j]= sc.nextInt();
			}
		}
		boolean [][] visited= new boolean[m][n];
		
		
		
		printFloodFill(array,0,0,"",visited);
		
		System.out.println("No printting");
		sc.close();

	}
	
	public static void printFloodFill(int [] []maze, int row, int column,String path,boolean[][] visited)
	{
		if(row < 0 || column < 0 ||row== maze.length || column== maze[0].length|| 
				maze[row][column]==1 || visited[row][column] == true)
		{
			return;
		}
		if(row==maze.length-1 && column == maze[0].length-1)
		{
			System.out.println(path+"  ");
			return;
		}
		visited[row][column]= true;
		printFloodFill(maze,row-1, column, path +"t",visited);
		printFloodFill(maze,row, column-1, path +"l",visited);
		printFloodFill(maze,row+1, column, path +"d",visited);
		printFloodFill(maze,row, column+1, path +"r",visited);
		visited[row][column]= true;
		
		
		
	}

}
