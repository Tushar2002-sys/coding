import java.util.ArrayList;

public class subset {


    public static void main(String args[])
    {
        subset_string("","abc");             
       System.out.println(subset_string2("","abc"));
    }


    static void subset_string( String p,String up)     // p: proccessed    up: unprocessed 
    {
        // base condition if(up==null)  print(p)
        if(up.isEmpty())
        {
            System.out.println(p);
            return ;
        }
        
        subset_string(p+up.charAt(0), up.substring(1));    // add first  character
        subset_string(p, up.substring(1));                       // do not add first character 
    }
    

    
    static ArrayList<String> subset_string2( String p,String up)     // p: proccessed    up: unprocessed 
    {
        // base condition if(up==null)  print(p)
        if(up.isEmpty())
        {
            ArrayList<String> l1=new ArrayList<String>();
            l1.add(p);
            return l1;

        }
         
       
        ArrayList<String> left=subset_string2(p, up.substring(1));                       // do not add first character 
        ArrayList<String> right=subset_string2(p+up.charAt(0), up.substring(1));    // add first  character
        left.addAll(right);
        return left;
    }
}
