package level2_Programs;

import java.util.Scanner;

public class tic_tac_toe_game
{	
	public static void main(String []args)
	{
		char [][] gameBoard = new char[3][3];
		Scanner sc = new Scanner(System.in);
		initializeBoard(gameBoard);
		boolean playAgain;
		
		do
		{
			initializeBoard(gameBoard);
			boolean isFirstPlayer = true;
			boolean endTheGame = false;
			printBoard(gameBoard);
			
		while(!endTheGame)
		{
			char opponent = isFirstPlayer ? 'X' : 'O';
			System.out.println("Player "+ (isFirstPlayer ? "1 (X)" : "2 (O)") + ",now your turn..");
			
			int row;
			int column;
			while(true)
			{
				System.out.println("Enter row(1-3): ");
				row = sc.nextInt()-1;
				System.out.println("Enter column(1-3): ");
				column = sc.nextInt()-1;
			
				if(row < 0 || row >=3 || column < 0 || column >= 3)
				{
					System.out.println("Opps! Invalid, try once again....");
				}
				else if(gameBoard[row][column] != ' ')
				{
					System.out.println("Cell is already filled, Please try again...");	
				}
				else
				{
					break;
				}
			}
				
			printBoard(gameBoard);
			gameBoard[row][column] = opponent;
			if(CheckingWinner(gameBoard, opponent))
			{
				printBoard(gameBoard);
				
				System.out.println("Player"+ (isFirstPlayer ? "1 (X)" : "2 (O) ")+" win the game");
				endTheGame = true;
			}
			else if(checkingDraw(gameBoard))
			{
				printBoard(gameBoard);
				
				System.out.println("oh It's a draw");
				endTheGame = true;
			}
			
			isFirstPlayer =! isFirstPlayer;
		}
		System.out.println("You want to continue the game(yes/no): ");
		playAgain = sc.next().equalsIgnoreCase("yes");
		}
		while(playAgain);
		
		System.out.println("Thank you for playing,  visit again.....");
				
	}	
	
	private static void initializeBoard(char[][] gameBoard) 
	{
		for(int i = 0; i < 3 ;i++)
		{
			for(int j = 0; j < 3; j++)
			{
				gameBoard[i][j]=' ';
			}
		}
		
	}
	

	private static void printBoard(char[][] gameBoard) 
	{
		System.out.println("  1 2 3");
		for(int i = 0; i < 3; i++)
		{
			System.out.print((i + 1) + " ");
			for(int j = 0; j < 3; j++)
			{
				System.out.print(gameBoard[i][j]);
				if( j < 2)
					System.out.print("|");
			}
			
			System.out.println();
			if(i < 2)
				System.out.println("--");
		}
		
	}

	private static boolean CheckingWinner(char[][] gameBoard, char player) 
	{
		
		for(int i = 0; i < 3; i++)
		{
			if(gameBoard[i][0] == player && gameBoard[i][1] == player && gameBoard[i][2] == player)
				return true;
			if(gameBoard[0][i] == player && gameBoard[1][i] == player && gameBoard[2][i] == player)
				return true;
		}
			if(gameBoard[0][0] == player && gameBoard[1][1] == player && gameBoard[2][2] == player)
				return true;
		
			if(gameBoard[0][2] == player && gameBoard[1][1] == player && gameBoard[2][0] == player)
				return true;
				
		return false;
	}

	private static boolean checkingDraw(char[][] gameBoard)
	{
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0;j < 3; j++)
			{
				if(gameBoard[i][j] == ' ')
				{
					return false;
				}
			}
		}
		return true;
		
	}
}


	


	