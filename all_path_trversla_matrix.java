package Backtracking;

public class all_path_trversla_matrix {public static void main(String args[])
    {       int num[][]=new int[3][3];
        boolean[][] maze={
            {true,true,true},
            {true,true,true},
            {true,true,true}
    };
            Direction_all_with_matrix("", 0, 0, maze,1,num);
    }

    static void Direction_all_with_matrix(String p,int r,int c,boolean arr[][],int idx,int num[][])
    {
        if(r==2 & c==2)                                              // base condition 
        {   num[r][c]=idx;
            for(int i=0;i<3;i++)
            {
                for(int j=0;j<3;j++)
                {
                    System.out.print(num[i][j]+" ");
                }
                System.out.println("");
            }
            System.out.println(p);
            return ;
        }
        
        if(!arr[r][c])                                                // if r,c is alredy visited  stop the recurssion
        return ;

        num[r][c]=idx;
        arr[r][c]=false;                                              // make it false if once u have traversed the cell
        if(r<2)                                                       // move down
        {
            
            Direction_all_with_matrix(p+"D", r+1, c, arr,idx+1,num);
        }
        if(c<2)                                                       // move right
        {
            
            Direction_all_with_matrix(p+"R", r, c+1, arr,idx+1,num);
        }
        if(c>0 )                                                      // move left if left is true
        {
            
            Direction_all_with_matrix(p+"L", r, c-1, arr,idx+1,num);
        }

        if(r>0 )                                                      // move up 
        {
            
            Direction_all_with_matrix(p+"U", r-1, c, arr,idx+1,num);
        }
        // this is the pount where the fxn is removed from recurssion 
        // therefore also remove the changes that were made by that function    
        idx=0;
        arr[r][c]=true;

        
    }
}
