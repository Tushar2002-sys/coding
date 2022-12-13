import java.util.*;
public class longestsubstring {
    public static void main(String args[])
    {
        longest_palindrome();
    }
    static void longest_palindrome()
    {
        Scanner sn=new Scanner(System.in);
        System.out.println("Entet String :");
        String s=sn.next();
        String ans="",f1="";
        int rev_length=0;
        for(int i=0;i<s.length();i++)
        {
            for(int k=i+1;k<s.length();k++)
            {   String s2=s.substring(i,k);
                if(s2.length()>=rev_length )   //String must be greater then already exsisting max palindrome (saves time n space )
                {  
                   String rev=reverse(s2); 
                   if(rev.compareTo(s2)==0)               // check for reverse of string 
                   { 
                     System.out.println("reverse of: "+s2 +" is : "+rev);
                     rev_length=s2.length();              //store length of max_length 
                     f1=s2;
                     ans=rev;
                   }
                }
            }            
        }
        System.out.println("String  :"+f1);
        System.out.println("reverse :"+ans);

    }

    static String reverse(String s)
    {
      StringBuilder str=new StringBuilder(s);
      String rev=""+str.reverse();
      return rev;
    }
      
    
}

