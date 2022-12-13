import java.util.*;
class vedio                              
{
    
    String title;
    boolean check_out=false;
    double rating=0;
    
}
class vedioStore extends vedio
{
    
    vedio v[]=new vedio[10];
    Scanner sn=new Scanner(System.in);
    
    
    
    
    
    void add_vedio()
    {    for(int i=0;i<3;i++)
         {
            System.out.print("Enter "+(i+1)+"  movie : ");
            v[i]=new vedio();               // new vedio object is created 
            v[i].title=sn.next();
            v[i].check_out=false;
         }
        
    }
    
    void check_out(String movie)
    {   
        int c=0;
        for(int i=0;i<3;i++)
        {   c++;
       // System.out.println("movie is :"+v[i].title +" check_out:"+v[i].check_out);
            if((v[i].title.compareTo(movie)==0)  && v[i].check_out==false)
            {    //System.out.println("inside if to serach :"+movie);
                v[i].check_out=true;
                break;
                
            }
        }
        if(c==3)
        System.out.println("Movie not found or it is checked out ");
    }
    
    void return_vedio(String movie)
    {    int c=0;
        for(int i=0;i<3;i++)
        {   c++;
        
            if((v[i].title.compareTo(movie)==0)  && v[i].check_out==true)
            {
               
                v[i].check_out=false;
                System.out.print("please rate this movie :");
                double k=sn.nextDouble();
                receive_rating(v[i],k);
                break;
                
            }
        }
        
        if(c==3)
        System.out.println("vedio you are returning does not belong here ");
        
    }
    
    void receive_rating(vedio object,double rate)
    {
        object.rating=rate;
        System.out.print("Thanks for rating !");
        
    }
    void display()
    {   System.out.println("title          checked            rating");
        for(int i=0;i<3;i++)
        {  
            System.out.println(v[i].title + "             "+ v[i].check_out+"             "+v[i].rating);
        }
        
    }
    
}
class project_1004{
    public static void main(String args[])
    {
        Scanner sn=new Scanner(System.in);
        vedioStore o1=new vedioStore();
        int a=1,b,k;
        String movie;
        while(a==1)
        {   System.out.println("");
            System.out.println("press 1 to add vedio ");
            System.out.println("press 2 to check_out ");
            System.out.println("press 3 to return   vedio ");
            System.out.println("press 4 to display status ");
            b=sn.nextInt();
            switch(b)
            {
                case 1:
                    o1.add_vedio();
                    break;
                case 2:
                    System.out.print("Enter movie to check out : ");
                    movie=sn.next();
                    o1.check_out(movie);
                    break;
                case 3:
                    System.out.print("Enter movie to check in : ");
                    movie=sn.next();
                    o1.return_vedio(movie);
                    break;
               case 4:
                   o1.display();
                   break;
                    
                    
                    
                    
            }
            System.out.println("");System.out.println("");System.out.println("");
            System.out.print("press 1 to continue :");
            a=sn.nextInt();
        }
    }
}




