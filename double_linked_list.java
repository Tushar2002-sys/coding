import java.util.*;
class linked_list
{   
  public  int size=0;
  public Node head=null,tail=null;
  public linked_list()
  {
      this.size=0;
  }
	
	
	
	private class Node 
	{
	    private int val;
	    private Node next;
	    private Node prev;
	    
	    public Node(int val)
	    {
	        this.val=val;
	    }
	    public Node (int val,Node next,Node prev)
	    {
	        this.val=val;
	        this.next=next;
	        this.prev=prev;
	    }
	}
	
	
	
	
	
	public void insert_start(int val)
	{   Node n=new Node(val);     
	    
	    if(head==null)  // means no elemnet is present 
	    {  
	        head=n;
	        tail=head;
	    }
	    else           // ll is not empty 
	    {   
	       
	        n.next=head;
	        head.prev=n;
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
	        tail=head;
	    }
	    else               // is elemnet is present  
	    {Node x=head;
	    while(x.next!=null)
	    {
	        x=x.next;
	    }
	    x.next=n;
	    n.prev=x;
	        
	    }
	    size=size+1;
	}
	public void insert_at_pos(int val,int pos)
	{  size=size+1;
	    Node n=new Node(val);   
	    Node x=head;
	    int c=0;
	    if(pos==0)
	    {
	    insert_start(val);
	    return;
	    }
	    else if(head==null)
	    {
	    System.out.println("insertion not posssible");
	    return;
	    }
	    
	    else if(pos==size)
	    insert_end(val);
	    else 
	    {while(x.next!=null && c!=pos-1)
	    {
	        x=x.next;
	        c=c+1;
	    }
	    if(c==pos-1)
	    {   Node y=x.next;
	        x.next=n;
	        n.prev=x;
	        
	        n.next=y;
	        y.prev=n;
	        
	    }
	        
	    }
	}
	
	
	
	public void delete_start()
	{ 
	    if(head==null)                           // nothing is present 
	    System.out.println("nothing to delete ");
	    else if(head.next==null)                 // only one elemnet present 
	    {
	        head=null;
	        tail=null;
	    }
        else
        head=head.next;
        head.prev=null;
	}
	public void delete_end()
	{
	    if(head==null || head.next==null)
	   delete_start();
	    else 
	    {
	        Node x=head;
	        while(x.next.next!=null)
	        {
	            x=x.next;
	        }
	        x.next=null;
	    }
	   
	}

	public void delete_pos(int pos)
	{
	    if(head.next==null && pos!=0  || head==null )  
	    System.out.println("Not possible to delete ");
	    else if(pos==0)
	    delete_start();
	    else if(pos==size)
	    delete_end();
	    else 
	    {   int c=0;
	        Node x=head;
	        while(x.next!=null && c!=pos-1)
	        {
	            x=x.next;
	            c++;
	        }
	        if(c==pos-1)
	        {   System.out.println(x.val);
	            Node y=x.next;
	            Node z=y.next;
	            x.next=z;
	            z.prev=x;
	        }
	        
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
	public void reverse()
	{   
		Node ans=new Node(head.val);
		//System.out.print("reverse fxn called :"+ans.val);
		head=head.next;
		Node x=head;
		while(x!=null)
		{//System.out.print("value of node inside while:"+x.val);
		Node y=new Node(x.val);
		 y.next=ans;
		 ans.prev=y;
		 y.prev=null;
		 ans=y;
		 x=x.next;
			
		}
		Node x1=ans;
		while(x1!=null)
		{
			System.out.print(x1.val+"->");
			x1=x1.next;
		}
	}
}
class double_linked_list
{
     
	public static void main(String[] args)
	{    

		linked_list l1=new linked_list();
		l1.insert_start(5);l1.insert_start(6);l1.insert_start(7);l1.insert_start(8);
		l1.insert_start(9);
		l1.display();
		l1.reverse();
	    /*linked_list list=new linked_list();
	    System.out.println("");
        System.out.println("DOUBLE LINKED LIST");
        System.out.println("");
	    Scanner sn=new Scanner(System.in);
	    int a=1,b,k,pos;
       
        while(a==1)
        {   System.out.println("");
            System.out.println("press 1 to inser at start  :");
            System.out.println("press 2 to insert at end   :");
            System.out.println("press 3 to insert at pos   :");
            System.out.println("press 4 to delete at start :");
            System.out.println("press 5 to delete at end   :");
            System.out.println("press 6 to delete at pos   :");
			System.out.println("press 7 to display ll      :");
            b=sn.nextInt();
            switch(b)
            {
                case 1:
                    System.out.print("Enter element to insert at start :");
                    k=sn.nextInt();
                    list.insert_start(k);
                    break;
                case 2:
                    System.out.print("Enter element to insert at start :");
                    k=sn.nextInt();
                    list.insert_end(k);
                    break;
                case 3:
                    System.out.print("Enter element  : ");
                    k=sn.nextInt();
                    System.out.print("Enter position : ");
                    pos=sn.nextInt();
                    list.insert_at_pos(k,pos);
                    break;
               case 4:
                    list.delete_start();
                    System.out.print("element at start deleted : ");
                    break;
               case 5:        
                   list.delete_end();
                   System.out.print("element at end deleted    : ");
                   break;
               case 6:
                    
                    System.out.print("Enter position u want to delete : ");
                    pos=sn.nextInt();
                    list.delete_pos(pos);
                    System.out.println("Element at pos:"+pos+" deleted");
                    break;
               case 7:
                   System.out.print("Element's are :");
                   list.display();
                   break;
                   
                   
                    
                    
                    
            }
            System.out.println("");System.out.println("");
            System.out.print("press 1 to continue :");
            a=sn.nextInt();
        }
		*/
	}
}
