import java.util.Scanner;


public class HackerChallengeSudoku {
	
		public static final int ROWS = 9;
		
		public static final int COLS = 9;
		
	public static int[][] initialPuzzle = {

{9,0,0,8,0,5,0,0,6},

{1,0,3,0,0,0,5,0,4},

{0,6,0,0,2,0,0,7,0},

{0,0,7,1,0,8,6,0,0},

{4,0,0,0,0,0,0,0,9},

{0,0,9,7,0,3,1,0,0},

{0,9,0,0,1,0,0,6,0},

{3,0,2,0,0,0,4,0,7},

{5,0,0,3,0,2,0,0,1}

};

	public static int[][] solvedPuzzle = {

{9,7,4,8,3,5,2,1,6},

{1,2,3,9,6,7,5,8,4},

{8,6,5,4,2,1,9,7,3},

{2,3,7,1,9,8,6,4,5},

{4,8,1,2,5,6,7,3,9},

{6,5,9,7,4,3,1,2,8},

{7,9,8,5,1,4,3,6,2},

{3,1,2,6,8,9,4,5,7},

{5,4,6,3,7,2,8,9,1}

};

public static void resetPuzzle()
{
for (int i = 0; i < ROWS; i++)
	{
	for (int j=0; j < COLS;j++)
	
	workingPuzzle[i][j] = initialPuzzle[i][j];
	}	

}

public static void printPuzzle()
{
	System.out.println("C  1 2 3 4 5 6 7 8 9");
	System.out.println("R  -----------------");
	for (int i = 0; i < ROWS; i++)
	{
		System.out.print(i+1);
		System.out.print(" |");
		
		for (int j=0; j < COLS;j++)
		{
		//System.out.print(workingPuzzle[i][j] + " ");
			if  (workingPuzzle[i][j] < 10 && workingPuzzle[i][j] >0)
			{
				System.out.print(workingPuzzle[i][j] + " ");
			}
			else 
			{
				System.out.print(". ");
			}
			
		}	
		System.out.println();
	}
	
	
}

public static boolean gameIsWon()
{
	for (int i = 0; i < ROWS; i++)
	{
		for (int j=0; j < COLS;j++)
		{
		if (workingPuzzle [i][j] != solvedPuzzle [i][j])
		return false;	
		}
	}		
	
return true;	
}

public static int[][] workingPuzzle = new int[ROWS][COLS];
	
	public static void main (String[] args) {
		
	resetPuzzle();
	printPuzzle();
	
	}
}

