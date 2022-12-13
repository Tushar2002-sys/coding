package Backtracking;
import java.util.*;
public class all_path_traversal {
    public static void main(String args[])
    {       
        boolean[][] maze={
            {true,true,true},
            {true,true,true},
            {true,true,true}
    };
            Direction_all("", 0, 0, maze);
    }

    static void Direction_all(String p,int r,int c,boolean arr[][])
    {
        if(r==2 & c==2)                                              // base condition 
        {
            System.out.println(p);
            return ;
        }
        
        if(!arr[r][c])                                                // if r,c is alredy visited  stop the recurssion
        return ;


        arr[r][c]=false;                                              // make it false if once u have traversed the cell
        if(r<2)                                                       // move down
        {
            
            Direction_all(p+"D", r+1, c, arr);
        }
        if(c<2)                                                       // move right
        {
            
            Direction_all(p+"R", r, c+1, arr);
        }
        if(c>0 )                                    // move left if left is true
        {
            
            Direction_all(p+"L", r, c-1, arr);
        }

        if(r>0 )                                    // move up 
        {
            
            Direction_all(p+"U", r-1, c, arr);
        }
        // this is the pount where the fxn is removed from recurssion 
        // therefore also remove the changes that were made by that function    

        arr[r][c]=true;

        
    }
}
