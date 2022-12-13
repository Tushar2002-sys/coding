import java.util.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class Project1_1006 
{
   
        public   List <String> l2=new ArrayList<>();
        
        void insert(String s)
        {
            l2.add(s);
        }
        
        void search(String s)
        {  int idx=0;
        boolean found=false;
            for(String x:l2)
            {   idx++;
                if(x.compareTo(s)==0){
                    found=true;
                System.out.println("found  at index :"+(idx));
                }
            }
            if(!found)
            System.out.println("Element doesn't exist");
        }
        
        void delete(String s)
        {
            l2.remove(s);
        }
        void display()
        {
            System.out.println(l2);
        } 
        
    }
    class MyClass extends Project1_1006 
   
    {
        public static void main(String args[]) 
        {
            Scanner sn=new Scanner(System.in);
            Project1_1006 o1=new Project1_1006();
          int a=1,b,c;
          while(a==1)
          {
              System.out.println("press 1 to insert  :");
              System.out.println("press 2 to delete :");
              System.out.println("press 3 search    :");
              System.out.println("press 4 display   :");
              System.out.println();
              c=sn.nextInt();
              switch(c)
              {
                  case 1:
                      {
                          System.out.print("Enter element you want to insert :");
                          String s1=sn.next();
                          o1.insert(s1);
                          break;
                      }
                  case 2:
                      {
                          System.out.print("Enter element you want to delete :");
                          String s1=sn.next();
                          o1.delete(s1);
                          break;
                      } 
                  case 3:
                      {
                          System.out.print("Enter element you want to search :");
                          String s1=sn.next();
                          o1.search(s1);
                          break;
                      }   
                    case 4:
                        {
                            o1.display();
                            break;
                        }
              }
              System.out.println();System.out.println();
              System.out.print("press 1 to continue :");
              a=sn.nextInt();
          }
        }
    }