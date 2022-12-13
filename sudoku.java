import Backtracking.*;
import java.util.*;
import static java.lang.Math.*;
public class sudoku {
    public static void main(String arsg[])
    {  Scanner sn=new Scanner(System.in);
       int  board[][] = 
       { 
         {7, 0, 0, 0, 0, 0, 2, 0, 0},   
         {4, 0, 2, 0, 0, 0, 0, 0, 3},   
         {0, 0, 0, 2, 0, 1, 0, 0, 0},   
         {3, 0, 0, 1, 8, 0, 0, 9, 7},   
         {0, 0, 9, 0, 7, 0, 6, 0, 0},   
         {6, 5, 0, 0, 3, 2, 0, 0, 1},   
         {0, 0, 0, 4, 0, 9, 0, 0, 0},   
         {5, 0, 0, 0, 0, 0, 1, 0, 6},   
         {0, 0, 6, 0, 0, 0, 0, 0, 8}   
       };
       display(board);
       System.out.print("Press 1 to get the answer :");
       int a=sn.nextInt();
       if(a==1)
       {
        if(solve_sudoku(board))
        display(board);
        else
        System.out.println("cannot solve this matrices");
       }
    }



    static boolean solve_sudoku(int [][]board)
    {
        int row=-1,col=-1; 
        boolean is_completely_filled=true;        
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board.length;j++)
            {
                if(board[i][j]==0)              // means empty space is there we need to fill it asap
                {
                    row=i; 
                    col=j;
                    is_completely_filled=false;
                    break;
                }
            }if(!is_completely_filled) break;
        }
        if(is_completely_filled)                // means all null cells are filled 
        return true;
        // co-ordinta of the element which is null is found check which number can fit in that area 
        for(int num=1;num<10;num++)
        {
            if(isSafe(board,row,col, num))      // if putting the no is safe at the movement(but there can be issue in future so ->)
            {
                board[row][col]=num;
                if(solve_sudoku(board))         // check for the other possibke combinations
                return true;
                else                            // backtrack  
                board[row][col]=0;   
                
            }
        }
        return false;


        
    }


    static void display(int [][]board)
    {
       for(int i=0;i<board.length;i++)
       {
        for(int j=0;j<board.length;j++)
        {
            if(j==2 || j==5 || j==8)
            System.out.print(board[i][j]+"   ");
            else 
            System.out.print(board[i][j]+" ");
        }
        if(i==8 || i==2 || i==5)
        {
            System.out.println();System.out.println();
        }
        else
        System.out.println();
       }
    }
    
    

    static boolean isSafe(int [][]board,int row,int col,int num)
    {
        // check if num is present in any of the  row 
        for(int i=0;i<board.length;i++)
        {
            if(board[i][col]==num)       // already have a number present in row 
            return false;                // cant put that no in at row,col

        }
        // check in col if num is present 
        for(int i=0;i<board.length;i++)
        {
            if(board[row][i]==num)
            return false;
        }
        int pqrt=(int)(Math.sqrt(board.length));
        // now chek if number u are trying to put at row,col is not present in that submatrix ;
        int row_submatrix=row-row%pqrt;
        int col_submatrix=col-col%pqrt;
        for(int i=row_submatrix;i<row_submatrix+3;i++)
        {
            for(int j=col_submatrix;j<col_submatrix;j++)
            {   if(board[i][j]==num)               // num matched in any row,col combination of submatrix 
                return false;                        

            }
        }
        return true;    // return true if all the cases above fails t return false bcz this are the possible n only posssible cases 
    }
}
