
import java.util.*;

public class n_knights {
    public static void main(String args[])
    {
             int n=4;
             int k=4;
             boolean[][] board=new boolean[n][n];
             knights(board,0,0,k);

    }

    static void knights(boolean [][] board ,int row,int col,int knight)
    {
        if(knight==0)       // base condition if all knights are placed 
        {
            display(board);
            System.out.println();
            return ;
        }
        if(col==board.length)     // u have reached to the end of matix now increment the row by 1
        {
            knights(board, row+1, 0, knight);
        }
        if(isSafe(board,row,col))
        {
            board[row][col]=true;
            knights(board, row, col+1, knight-1);
            board[row][col]=false;
            //knight=knight+1;
        }
        knights(board, row, col+1, knight);

    }


    static boolean isSafe(boolean [][] board ,int row,int col )
    {
        if(isvalid(board,row-2,col+1))
        {
            if(board[row-2][col+1])
            return false;
        }

        if(isvalid(board,row-2,col-1))
        {
            if(board[row-2][col-1])
            return false;
        }

        if(isvalid(board,row-1,col+2))
        {
            if(board[row-1][col+2])
            return false;
        }

        if(isvalid(board,row-1,col-2))
        {
            if(board[row-1][col-2])
            return false;
        }

        return true;


    }
    static boolean isvalid(boolean [][]board,int row,int col)
    {
        if(row>0 && row<board.length && col>0 && col <board.length)
        return true ;
        else 
        return false ;
    }
    static void display(boolean[][] board)
    {
        for(boolean [] row:board)
        {
            for(boolean elem:row)
            {
                if(elem)
                System.out.print("K ");
                else
                System.out.print("0 ");

            }
            System.out.println();

        }
    }

    
}
