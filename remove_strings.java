
import java.util.*;

public class remove_strings {
    public static void main(String[] args) 
	{    
	    System.out.println(remove_a("bacaaacadagaaaah",0));
        System.out.println(skip_apple("appleTushaapplerappleSinghapple"));
		System.out.println(skip_App_not_Apple("appTushaapprappappSiappngh is eating appapple"));
	}
	static String remove_a(String s,int index)
	{ 
	  if(index!=s.length()){
	    if(s.charAt(index)!='a' )  
	    {   
	        return s.charAt(index)+remove_a(s,index+1);
	    }
	    else 
	      return remove_a(s,index+1);
	  }
	  return "";
	}

	static String skip_apple(String s)
    {
        if(s.isEmpty())
        return "";
        else if(s.startsWith("apple"))
        return skip_apple(s.substring(5));
		else 
		return s.charAt(0)+skip_apple(s.substring(1));

    }

	static String skip_App_not_Apple(String s)
	{
		if(s.isEmpty())
		return "";
		else if(s.startsWith("app") && !s.startsWith("apple"))
		{return skip_App_not_Apple(s.substring(3));}
		else {
			return s.charAt(0)+skip_App_not_Apple(s.substring(1));
		} 



		
	}
	    
}
