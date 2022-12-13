import java.util.Scanner;

public class reverse {
    static int sum=0;

    static int digits(int n)
    {
        int length=(int)(Math.log10(n))+1;
        return reverse2(n,length);
    }
    static int reverse2(int n,int length)
    {
        if(n%10==n)
        return n;
        else{
            int rem=n%10;
            //int rev=rem*(int)(Math.pow(10,length-1))
            return rem*(int)(Math.pow(10,length-1)) + reverse2(n/10, length-1);

        }
    }
    static void reverse1(int n)
    {
        if(n==0)
        return ;
        else{
            int rem=n%10;
            sum=sum*10+rem;
            reverse1(n/10);
        }
    }
    public static void main(String args[]) 
    {
        //reverse1(4668845);
       System.out.print("Enter no to revere :");
       Scanner sn=new Scanner(System.in);
       int k=sn.nextInt();

        System.out.print("reverse of the num  :"+digits(k));
        
    }
    
}
