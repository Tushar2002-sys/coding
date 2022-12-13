import java.util.*;
class project_1003
{
    public static void main(String args[])
    {
        String arr[][]=new String[][]
        {
            {"1001", "Ashish", "01/04/2009", "e", "R&D", "20000", "8000", "3000"},
		    {"1002", "Sushma", "23/08/2012", "c", "PM", "30000", "12000", "9000"},
		    {"1003", "Rahul", "12/11/2008", "k", "Acct", "10000", "8000", "1000"},
		    {"1004", "Chahat", "29/01/2013", "r", "FrontDesk", "12000", "6000", "2000"},
		    {"1005", "Ranjan", "16/07/2005", "m", "Engg", "50000", "20000", "20000"},
		    {"1006", "Suman", "1/1/2000", "e", "Manufacturing", "23000", "9000", "4400"},
		    {"1007", "Tanmay", "12/06/2006", "c", "PM", "29000", "12000", "10000"}
        };
        
       String arr2[][]=new String[][]
       {
           {"e", "Engineer", "20000"},
		   {"c", "Consultant", "32000"},
		   {"k", "Clerk", "12000"},
		   {"r", "Receptionist", "15000"},
		   {"m", "Manager", "40000"}
	   };
	   
	   
	   
	   Scanner sn=new Scanner(System.in);
	   System.out.print("Enter uid you want to search :");
	   String uid=sn.next();
	   String final1[]=new String[10];
	   int k=0;
	   
	   for(int i=0;i<8;i++)
	   {   
	      
	       if(arr[i][0].compareTo(uid)==0)   // if found 
	       { //System.out.println(arr[i][0] +" found ");
	           final1[k++]=uid;                 // uid
	           final1[k++]=arr[i][1];           // name
	           final1[k++]=arr[i][4];           // department 
	           char designation_code=arr[i][3].charAt(0);   // designation code and search in arr2[][]  using switch()
	           int da=0;
	           String designation="";
	           System.out.println(designation);
	           switch(designation_code)
	           {
	               case ('e'):
	                    da=Integer.parseInt("20000");
	                    designation=arr2[0][1];
	                    System.out.println(arr2[0][1]+" designatio found ");
	                    break;
	               case ('c'):
	                     da=Integer.parseInt("32000");
	                     designation=arr2[1][1];
	                     System.out.println("c designation found ");
	                     break;
                   case ('k'):
	                     da=Integer.parseInt("12000");
	                     designation=arr2[2][1];
	                     break;
	               case ('r'):
	                     da=Integer.parseInt("15000");
	                     designation=arr2[3][1];
	                     break;
                   case ('m'):
	                     da=Integer.parseInt("40000");
	                     designation=arr2[4][1];
	                     break;
	               default:
	                     break;
	               
	                     
	           }
	           final1[k++]=designation;
	         //  System.out.println("outside switch designation :"+final1[k]+" "+designation);
	          // System.out.println(arr2[0][1]);
	            
	            int salary=Integer.parseInt(arr[i][5])+Integer.parseInt(arr[i][6])-Integer.parseInt(arr[i][7])+da;
	            final1[k++]=" "+salary;
	            //System.out.println("salary "+final1[k] +" or "+salary);
	            
	            break;
	           
	       }
	       else      // if not found  
	       {
	           System.out.println("uid you search doesn't exsist");
	           
	       }
	       
	   }
	   for(int i=0;i<k;i++)
	   {
	       System.out.print(final1[i]+" ");
	   }
    }
}
    

