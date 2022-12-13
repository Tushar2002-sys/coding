import java.util.*;

public class queens_position {


    public static void main(String args[])
    {  int n=4;
       boolean board[][]=new boolean[n][n];
       queen(board,0);

    }

    static int queen(boolean board[][],int row)
    {
        if(row==board.length-1)
        {
            display(board);
            System.out.println();
            return 1;
        }
        int count=0;
        for(int col=0;col<board.length;col++)
        {
            if(isSafe(board,row,col))
            {
                board[row][col]=true;    // ,ark the presence of the  queen over that position
               count+=  queen(board,row+1);      // now traverse whole matrix checking for each positioning of queen
                board[row][col]=false;
            }
        }
        return count;
    }

    static boolean isSafe(boolean board[][],int row,int col)
    {
        // check verticle first 
        for(int i=0;i<row;i++)
        {
            if(board[i][col])            // means there exist a queen or not safe loaction
            return false;
        }

        // check  for diagoal left 
        int left_max  =Math.min(row,col);
        int right_max =Math.min(row,board.length-col-1);
        for(int i=1;i<=left_max;i++)                // moving diagonaly left (row--,col--)
        {
            if(board[row-i][col-i])                 // if diagonal left has queen  return false 
            return false;
        }
       
        // check for diagonal right
        for(int i=1;i<=right_max;i++)              // moving diagonaly right (row--,col++)
        {
            if(board[row-i][col+1])                // if diagonal right has any queen return false
            return false; 
        }

        return true;                               // if none of the case exist return true 
    }


    static void display(boolean board[][])
    {   


        for(boolean row[] : board)
        {
            for (boolean ele: row)
            {
                
                    if(ele)
                    System.out.print("Q ");
                    else
                    System.out.print("X ");
                

            }
            System.out.println("");
        }
    }
    
}
