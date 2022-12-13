import java.util.*;
public class prefix_suffix
{
	public static void main(String[] args) 
	{
	    Scanner sn=new Scanner(System.in);
	    
	    int n=sn.nextInt();
	    int arr[]=new int[n];
	    System.out.println("enter :"+ n+" elements :");
	    for(int i=0;i<n;i++)
	    arr[i]=sn.nextInt();
	    System.out.println(solve(n,arr));
	    
	    

	}
	static int Solve(int n,int arr[])
	{   
	    boolean found=false;
	    for(int i=0;i<n;i++)
	    {
	     if(arr[i]<0)  // -ve 
	     {   System.out.println(arr[i] +" found is -ve :");
	         arr[i]=(-1)*arr[i];
	         for(int j=i+1;j<n;j++)
	         {   
	             if(arr[j]>=0) 
	             {found=true;
	                System.out.println("elements are +ve afer this:");
	             break;
	             }
	             else 
	             {   System.out.println(arr[j]+" is -ve :");
	             arr[j]=(-1)*arr[j];
	             }
	         }
	         if(found)
	         break;
	     }
	    } // for suffix 
	    
	     found=false;
	    for(int i=n;i>=0;i--)
	    {
	        if(arr[i]<0)
	        {    arr[i]=(-1)*arr[i];
	            for(int j=i-1;j>0;j--)
	            {
	              if(arr[j]>=0)
	              {   found=true;
	                  break;
	                  
	              }
	              else 
	              {
	                  arr[j]=(-1)*arr[j];
	              }
	            }
	            if(found)
	            break;
	        }
	    }  // for prefix 
	    int sum=0;
	    for(int i=0;i<n;i++)
	    sum=sum+arr[i];
	    
	    return sum;
	}
}

    

