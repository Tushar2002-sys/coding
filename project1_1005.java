import java.util.*;
abstract class Account {
    abstract void calculateInterest();      // declaring a abstract fxn with void return type    
}
class FD_acc extends Account 
{ 
   
    void calculateInterest()
    {   
        
        Scanner sn=new Scanner(System.in);
   Double interest=0.0,amt;
   int age,days;
   System.out.print("Enter your amount :");
   amt=sn.nextDouble();
   System.out.print("Enter no of  days :");
   days=sn.nextInt();
   System.out.print("Enter  your   age :");
   age=sn.nextInt();
   if(amt>10000000)    // greater than 1 crore 
   {
       if(days >6 && days <15)
       interest=6.50;
       else if(days >14 && days <46)
       interest =6.75;
       else if(days >44 && days <61)
       interest= 8.00;
       else if(days >60 && days <185)
       interest=8.50;
       else 
       interest =10.0;



   }
   else               // less than 1 crore
   { boolean snr=(age>64)?true:false;        // if senior citizen snr=true;

       if(days >6 && days <15)
       interest=(!snr)?4.50:5.00;
       else if(days >14 && days <46)
       interest=(!snr)?5.50:6.00;
       else if(days >44 && days <61)
       interest=(!snr)?4:7.50;
       else if(days >60 && days <185)
       interest=(!snr)?7.50:8.00;
       else if(days <366)
       interest=(!snr)?8.00:8.50;
      


   }
        interest=(interest*amt)/100;
        System.out.println("Interest :"+interest);
    }
}
class RD_acc extends Account 
{  
   
    void calculateInterest()
    {   
         Scanner sn=new Scanner(System.in);
         Double interest=0.0,amt;
         int no_of_months,age;
         System.out.print("Enter your amount :");
         amt=sn.nextDouble();
         System.out.print("Enter no of month :");
         no_of_months=sn.nextInt();
         System.out.print("Enter  your   age :");
         age=sn.nextInt();
    
    
        boolean snr=(age>64)?true:false;
        if(no_of_months>5 && no_of_months<10)
        interest=(!snr)?7.50:8.00;
        else if(no_of_months>9 && no_of_months<13)
        interest=(!snr)?7.75:8.25;
        else if(no_of_months >12 && no_of_months <16)
        interest=(!snr)?8.25:8.75;
        else if(no_of_months>17 && no_of_months <19)
        interest=(!snr)?8.50:9.00;
        else if(no_of_months<22)
        interest=(!snr)?8.75:9.25;
        
        interest=(amt*interest)/100;
        System.out.println("Interest :"+interest);
            
    }

}

class SB_acc extends Account 
{  
     void calculateInterest()
    {   
         Scanner sn=new Scanner(System.in);
    Double interest=4.0,amt;
    System.out.print("Enter your amount :");
    amt=sn.nextDouble();

        interest=(interest*amt)/100;
        System.out.println("Interest :"+interest);
    }


}
class project_1005 
{
    public static void main(String args[])
    {
        int a=1,b;
         while(a==1)
        {   System.out.println("");
            System.out.println("Interest Calculator SB  press 1  :");
            System.out.println("Interest Calculator FD  press 2  :");
            System.out.println("Interest Calculator RD  press 3  :");
            Scanner sn=new Scanner(System.in);
            b=sn.nextInt();
            switch(b)
            {
                case 1:{
                    Account o1=new SB_acc();
                    o1.calculateInterest();
                    break;}
                case 2:{
                    Account o1=new FD_acc();
                    o1.calculateInterest();
                    break;}
                case 3:{
                    Account o1=new RD_acc();
                    o1.calculateInterest();
                    break;}
                default:
                    break;
                    
                    
                    
                    
            }
            System.out.println("");System.out.println("");System.out.println("");
            System.out.print("press 1 to continue :");
            a=sn.nextInt();
        }
    }
}
