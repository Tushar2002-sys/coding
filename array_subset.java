import java.util.*;



public class array_subset {
    
    public static void main(String args[])
   {
    int p1[]={};
    int up1[]={1,2,3};
    
    System.out.println(Arrays.toString(subset1(p1,up1)));

   }
   static int i=0;
   
   
   static int[] subset1(int p[],int up[])
   {
    if(up.length==0)
    return p;
    
    subset1(p,Arrays.copyOfRange(up,1, up.length));
    p[i++]=up[0];
    subset1(p,Arrays.copyOfRange(up,1, up.length));


   }
    
}
