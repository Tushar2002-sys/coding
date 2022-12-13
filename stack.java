import java.util.*;
public class stack {

    int arr[],top,capacity;
    public static void main(String args[])
    { 
           stack o1=new stack(5);
           o1.push(12);o1.push(10);o1.push(11);o1.push(15);o1.push(124);

           o1.pop(); o1.display();o1.pop(); o1.display();o1.pop(); o1.display();

    }
    
    stack(int size)
    {
         arr=new int[size];
         top=-1;
         capacity=size;
    }
     void push(int k)
     {   System.out.println("push is called :");
        if(top==capacity-1)
        {
            System.out.println("Overflow");
            return ;
        }
        top=top+1;
        arr[top]=k;
        System.out.println("Element inserted : "+arr[top]+" at index :"+top);

    }
     void pop()
    {
          System.out.println("pop is called :");
        if(top==-1)
        System.out.println("nothing to delete");
    

        System.out.println("Element deleted : "+arr[top]); 
        top=top-1;

    }

     void display()
    {  for(int i=0;i<=top;i++)
       System.out.print(arr[i]+" ");
    }
    
}
