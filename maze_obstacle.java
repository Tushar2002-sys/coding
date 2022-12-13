package Backtracking;

public class maze_obstacle
{
    public static void main(String args[])
    {
        
        boolean[][] maze={
                {false,false,false,false},
                {false,false,true,false},
                {false,false,false,false},
                {false,false,false,false}
        };

        count_obstacle("",0,0,maze);

    }

    static void count_obstacle(String p,int r,int c,boolean river[][])
    {
        if(r==river.length-1 && c==river[0].length-1)    // if reached end of the matrix (3,3)
        {
            System.out.println(p);
            return ;
        }

        if(river[r][c])   // if river is there break the loop
        return ;

        if(r < river.length-1)     // row is still less than 3
        {
            count_obstacle(p+"D",r+1,c,river);
        }

        if(c < river[0].length-1)
        {
            count_obstacle(p+"R",r,c+1,river);
        }
        
    }
    
}
