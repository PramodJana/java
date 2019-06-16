import java.util.*;
import java.io.*;
class maze2way
{	
	static int N;
	public static void main(String [] args)
	{
		maze2way m=new maze2way();
		int maze[][]={{1,0,0,0},{1,1,0,1},{0,1,0,0},{1,1,1,1}};
		N=maze.length;
		m.solveMaze(maze);
	}
	
	boolean solveMaze(int maze[][])
	{
		int sol[][]=new int[N][N];
		if(solveMazeUntil(maze,0,0,sol)==false)
		{
			System.out.println("Solution doesn't exists");
			return false;
		}
		printSolution(sol);
		return true;
	}

	boolean solveMazeUntil(int maze[][],int x,int y,int sol[][])
	{
		if((x==N-1)&&(y==N-1))
		{
			sol[x][y]=1;
			return true;
		}
		if(isSafe(maze,x,y)==true)
		{
			sol[x][y]=1;
			
			if(solveMazeUntil(maze,x+1,y,sol))
			{
				return true;
			}
			
			if(solveMazeUntil(maze,x,y+1,sol))
			{
				return true;
			}
			
			sol[x][y]=0;
			return false;
		}
		return false;
	}

	void printSolution(int sol[][])
	{
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N;j++)
			{
				System.out.print(sol[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	boolean isSafe(int maze[][],int x,int y)
	{
		if((x>=0)&&(x<=N-1)&&(y>=0)&&(y<=N-1)&&(maze[x][y]==1))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
