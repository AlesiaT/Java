import java.util.Scanner;
public class TicTacToe
{
    public static void main(String args[])
    {
        char[][] board = { {'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};
        Scanner sc = new Scanner (System.in);
        boolean playerX = true;

        while (0 != 1)
        {
            for (int i = 0; i < board.length; i++)
            {
                for (int j = 0; j < board[i].length; j++)
                {
                    System.out.print (board[i][j] + " ");
                }
                System.out.println();
            }
            
            if (playerX == true)
            {
                System.out.println ("Player X, please enter a number of position to fill");
                int pos = sc.nextInt();
                switch (pos)
                {
                    case 1: board[0][0] = 'X'; break;
                    case 2: board[0][1] = 'X'; break;
                    case 3: board[0][2] = 'X'; break;
                    case 4: board[1][0] = 'X'; break;
                    case 5: board[1][1] = 'X'; break;
                    case 6: board[1][2] = 'X'; break;
                    case 7: board[2][0] = 'X'; break;
                    case 8: board[2][1] = 'X'; break;
                    case 9: board[2][2] = 'X'; break;
                    default: System.out.println ("Not a valid position!");
                }
                playerX = false;
            }
            else
            {
                System.out.println ("Player O, please enter a number of position to fill");
                int pos = sc.nextInt();
                switch (pos)
                {
                    case 1: board[0][0] = 'O'; break;
                    case 2: board[0][1] = 'O'; break;
                    case 3: board[0][2] = 'O'; break;
                    case 4: board[1][0] = 'O'; break;
                    case 5: board[1][1] = 'O'; break;
                    case 6: board[1][2] = 'O'; break;
                    case 7: board[2][0] = 'O'; break;
                    case 8: board[2][1] = 'O'; break;
                    case 9: board[2][2] = 'O'; break;
                    default: System.out.println ("Not a valid position!");
                }
                playerX = true;
            }
        }
    }
}
