package contest;

public class largest_local_in_matrix {

        public static int[][] largestLocal(int[][] grid) {
            
            int n=grid.length;
            int ans[][]=new int[n-2][n-2];
            for(int i=0;i<=(n-3);i++)
            {   
                for(int j=0;j<=(n-3);j++)
                {int max=0;
                    for(int row=i;row<i+3;row++)
                    {
                        for(int col=j;col<j+3;j++)
                        {
                            if(max<grid[row][col])
                            max=grid[row][col];
                            
                        }
                    }
                  System.out.print(max+" ");  
                  ans[i][j]=max;  
                }
            }
            return ans;
            
        }
        public static void main(String args[])
        
        {
            int grid1[][]={
                           {1,1,1,1,1},
                           {1,1,1,1,1},
                           {1,1,2,1,1},
                           {1,1,1,1,1},
                           {1,1,1,1,1}
                          };
            System.out.println("length of aorigibal array :"+grid1.length);
            System.out.println("length of answer array :"+(grid1.length-3));
            int grid[][]=largestLocal(grid1);
            for(int i=0;i<=grid1.length-3;i++)
            {
                for(int j=0;j<=grid1.length-3;j++)
                {
                    System.out.print(grid[i][j]+" ");
                }System.out.println();
            }
        }
    }