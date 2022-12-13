import java.util.*;
public class permutation {
    public static void main(String args[])
    {   
        Scanner sn=new Scanner(System.in);
        String s=sn.next();
        permi_string("",s);
    }
    static void permi_string(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }

        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++)
        {
            String f=p.substring(0,i);
            String l=p.substring(i, p.length());
            permi_string(f+ch+l, up.substring(1));
        }
    }
    
}
