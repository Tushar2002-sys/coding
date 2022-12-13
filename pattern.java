import java.util.*;
public class pattern {

    public static void main(String args[])
    {Scanner sn=new Scanner(System.in);
        for(int i=0;i<3;i++){
            System.out.println("enter string :");
            String s1=sn.next();
            System.out.println("enter check :");
        String s2=sn.next();
        System.out.println(pattern_exist(s1,s2));
        }

    }
    static boolean pattern_exist(String s1,String s2)
    {
        char ch=s2.charAt(0);
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)==ch)
            {
                String check=s1.substring(i,i+s2.length());
                if(check.compareTo(s2)==0)
                {  
                    System.out.println("from length "+i+" to : "+(i+s2.length()));
                    return true;

                }
            }
        }
        return false;
    }
    
}
