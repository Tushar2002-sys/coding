public class tele_combination {
    

    public static void main(String rgs[])
    {combination("", "23");

    }

    static void combination(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return ;

        }
        int k=up.charAt(0)-'0';
        for(int i=(k-2)*3;i<(k-1)*3;i++)
        {
            char ch=(char)('a'+i);
            combination(p+ch, up.substring(1));
        }

    
    }
}
