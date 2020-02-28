import java.util.Scanner;
public class PairProgramming2
{
	public static void main (String [] args)
	{
		// Setting up the Board
		//1. How should we set up the board?
		//3. What is the board?
		//2. What should you use?
		//3. Default board character?
		char [][] board = {{'.', '.', '.'}, {'.', '.', '.'}, {'.', '.', '.'}};

		//Setting up the game
		//1. What are the conditions to end the game? 
		boolean endOfTheGame = false;
		//		-> How many moves?
		//		-> Who Wins?
		//2. Who gets 'X' and who gets 'O'?

		//Player Moves
		//1. Whos turn is it?
		int playerNumber = 1;
		//2. How do they select their position?
		Scanner sc = new Scanner(System.in);
		while (endOfTheGame == false)
		{
		    System.out.println("Player " + playerNumber + " enter a row (1-3): ");
    		int row = sc.nextInt();
	    	System.out.println("Player " + playerNumber + " enter a column (1-3): ");
		    int column = sc.nextInt();
		    //3. Is the input valid?
		    playerNumber = checkValidPosition(board, playerNumber, row, column);
		    displayBoard(board);
		    endOfTheGame = checkForWin(board, endOfTheGame);
		    //4. Have they won?
		}
	}

	public static boolean checkForWin (char [][] board, boolean endOfTheGame)
	{
		//1. How do you win at TicTacToe?
		//2. How to check for this winning conditions?
		//3. What is the default character on the board?
		//4. What input parameters if any do you need?
		//5. What if anything should you return?
		if ((board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X')
		    || (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X')
		    || (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X')
		    || (board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X')
		    || (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X')
		    || (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X')
		    || (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X')
		    || (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X'))
	    {
	        System.out.println("Player 1 won!");
	        endOfTheGame = true;
	    }
	    else if ((board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O')
		    || (board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O')
		    || (board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O')
		    || (board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O')
		    || (board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O')
		    || (board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O')
		    || (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O')
		    || (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O'))
	    {
	        System.out.println("Player 2 won!");
	        endOfTheGame = true;
	    }
	    return endOfTheGame;
	}

	public static void displayBoard (char [][] board)
	{
		//1. How would you display the board?
		//2. what is the current state of the board?
		//3. What input parameters if any do you need?
		//4. What if anything should you return?
		for (char [] row : board)
		{
		    for (char element : row)
		    {
		        System.out.print(element + " ");
		    }
		    System.out.println();
		}
	}

	public static int checkValidPosition (char [][] board, int playerNumber, int row, int column)
	{
		//1. Is the selected position taken on the board?
		//2. What input parameters if any do you need?
		//3. What if anything should you return?
		if (board[row - 1][column - 1] == '.')
		{
		    if (playerNumber == 1)
		    {
		        board[row - 1][column - 1] = 'X';
		        playerNumber = 2;
		    }
		    else
		    {
		        board[row - 1][column - 1] = 'O';
		        playerNumber = 1;
		    }
		}
		else
		{
		    System.out.println("Wrong position!");
		}
		return playerNumber;
	}
}
