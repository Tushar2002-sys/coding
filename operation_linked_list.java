import java.util.*;

import javax.swing.text.StyledEditorKit.BoldAction;
class operation_linked_list {

    public Node head=null;
    public int size=0;
    operation_linked_list()
    {
        this.size=0;
    }
                                 // operation performed merfing of two linked list in java usinfg recurssion 
                                 //     operrtaion performed cycle fromation in linked list usong recurssion





    private class Node
    {
        private int val;
        private Node next;
        Node()
        {

        }
        Node(int val)
        {
            this.val=val;

        }
        Node(int val,Node next)
        {
            this.val=val;
            this.next=next;
        }
    }

    public void insert_start(int val)
	{   Node n=new Node(val);     
	    
	    if(head==null)  // means no elemnet is present 
	    {  
	        head=n;
	        
	    }
	    else           // ll is not empty 
	    {   
	       
	        n.next=head;
	        head=n;
	    }
	    size=size+1;
	    
	}
    public void insert_end(int val)
	{
	    Node n=new Node(val);
	    if(head==null)       // no elemnet is present 
	    {
	        head=n;
	       
	    }
	    else               // is elemnet is present  
	    {Node x=head;
	    while(x.next!=null)
	    {
	        x=x.next;
	    }
	    x.next=n;
	        
	    }
	}
    public void display()
	{   Node x1=head.next;
	
	    System.out.println();
	    Node x=head;
	    while(x.next!=null)
	    {
	        System.out.print(x.val+"->");
	        x=x.next;
	    }
	     System.out.print(x.val);
	}

    public static operation_linked_list mergeTwoLists(operation_linked_list list1, operation_linked_list list2) {
        
        Node m1=list1.head;
        Node m2=list2.head;
        list1.display();
        list2.display(); 
        operation_linked_list ans=new operation_linked_list();
        
              
        while(m1!=null && m2!=null)
        {
            
            ans.insert_end(m1.val);
            ans.insert_end(m2.val);
            m1=m1.next;
            m2=m2.next;
           
        }
        while(m1!=null)
        {   
            ans.insert_end(m1.val);
            m1=m1.next;
        }
        while(m2!=null)
        {
            ans.insert_end(m2.val);
            m2=m2.next;
        }
       
        return ans;
    }

    public boolean cycle(Node l1)
    {   
        Node s=l1;
        Node f=l1;
        while(f!=null && f.next!=null)
        {
            f=f.next.next;
            s=s.next;
            if(f==s)
            return true;
        }
        return false;
    }
            
    public int length_of_cycle(Node head)              // return length of cycle if exist
    {
        Node s=head;
        Node f=head;
        while(f!=null && f.next!=null)
        {
            s=s.next;
            f=f.next.next;
            if(s==f)          // if it is confirmed that cycle do exist now count length of cycle 
            {
              int count=1;
              s=s.next;      // move s one step frwrd
              while(s!=f)    // till s did't came to f
              {
                s=s.next;    // increment s
                count++;    // increment count
              }
              return count;               
            }
        }
        return -1;
    }
    public static int get_length(Node head)
    {
        Node x=head;
        int l=0;
        while(x!=null)
        {
            x=x.next;
            l++;
        }
        return l;
    }

    

    public static void main(String rgs[])
    {
        operation_linked_list o1=new operation_linked_list();
        o1.insert_start(10);o1.insert_start(11);o1.insert_start(12);o1.insert_start(13);
        o1.display();
        System.out.println("length of the node :"+o1.get_length());

        operation_linked_list o11=new operation_linked_list();
        o11.insert_start(14);o11.insert_start(15);o11.insert_start(16);o11.insert_start(17);
        o11.display();

        operation_linked_list o3=mergeTwoLists(o1, o11);
        System.out.println("after merging :");
        
        o3.display();
    }

}