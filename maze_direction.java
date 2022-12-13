package Backtracking;
import java.util.*;
public class maze_direction {

    
        public static void main(String args[])
        {
            Scanner sn=new Scanner(System.in);
            System.out.print("Enter your   rows  :");
            int r=sn.nextInt();
            System.out.print("Enter your Column  :");
            int c=sn.nextInt();
            System.out.println("Total no of ways :"+count(r,c));
            Direction("" ,r, c);   
            System.out.println("Diagonal Direction :");
            Direction_diagonal("", r, c);
    
        }
    
        static void  Direction(String p,int r,int c)
        {
            if(r==1 && c==1){       // base condition 
            System.out.println(p);
            return ;
            }
            
            if(c>1)
            Direction(p+"R", r, c-1);

            if(r>1)
            Direction(p+"D", r-1, c);

            
        }


        static void Direction_diagonal(String p,int r,int c)
        {
            if(r==1 && c==1)
            {
                System.out.println(p);
                return ;
            }
            if(c>1)
            Direction_diagonal(p+"H", r, c-1);

            if(r>1)
            Direction_diagonal(p+"V", r-1, c);

            if(r>1 && c>1)
            Direction_diagonal(p+"D", r-1, c-1);

        }

        static int count(int r,int c)
        {
         if(r==1|| c==1)
         return 1;
        
         int left=count(r-1,c);
         int right=count(r,c-1);
         return left+right;
        }
        
    } 
    