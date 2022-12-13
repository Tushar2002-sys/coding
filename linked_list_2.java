import java.util.*;
 class list
{
    Node head;     
    class Node
    {
        int data;
        Node next;         
        Node(int d) {this.data = d; this.next = null; }
    }
    
    
 void push(int new_data)
{
    Node x = new Node(new_data);
    x.next = head;
    head = x;
}



 void push_last(int data)
 {
    Node x=head;
    Node y=new Node(data);
    while(x.next!=null)
    x=x.next;
    
    x.next=y;
 }
    
    
    
 void display()
{
    Node x=head;
    System.out.print("Elements of linked list ares :");
    while(x.next!=null)
    {
        System.out.print(x.data+"->");
        x=x.next;
    }System.out.println(x.data);

}
    
void deletestart(){
    head=head.next;
    
}    
void delete_end(){
    Node x=head;
    while(x.next.next!=null){
        x=x.next;
    }
    x.next=null;
    
}
    


void delete_pos(int pos)
{
    Node x=head;
    if(x==null)
    System.out.println("No element to delete:");
    else if(pos==1)
    deletestart();
    else{int c=1;
        while(x!=null && c!=pos-1)
        {
            x=x.next;
            c++;
        }
        if(c==pos-1){
            // x store the node jst beforev of the element we want to delete
            Node y=x.next.next;
            x.next=y;
           
        }
        
    }}
    
    
    void insert_pos(int k,int pos){
        Node x=head;
        if(x==null & pos!=1)
        System.out.println("insertion not possible");
        else if(pos==1)
       push(k);
        else
        {int p=1;
            while(x!=null && p!=pos-1){
                p++;
                x=x.next;
            }
            if(p==pos-1){
                Node Ne=new Node(k);
                Node y=x.next;
                x.next=Ne;
                Ne.next=y;
            }
     
    }
}
    public Node getmid(Node head)
    {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public Node sort(Node head)
    {  
        if(head==null || head.next==null)
        return head;
        Node x=head;
        Node mid=getmid(head);
        while(x.next!=mid)
        {
            x=x.next;
        }
        x.next=null;
        Node left  =sort(head);
        Node right =sort(mid);
        
        return merge(left,right);
        
    }
    public Node gethead()
    {
        return head;
    }
    
    
    public Node merge(Node l1,Node l2)
    {  
       Node dummyhead=new Node(-1);
       Node ans=dummyhead; 
       while(l1!=null && l2!=null)
       {
           if(l1.data>l2.data)
           {
               ans.next=l1;
               ans=ans.next;
               l1=l1.next;
           }
           else 
           {
               ans.next=l2;
               ans=ans.next;
               l2=l2.next;
           }
       }
       while(l1!=null)
            ans.next=l1;
        
       while(l2!=null)
            ans.next=l2;
       
       return dummyhead.next; 
    }
    static int getlength(Node head)
    {
        int l=0;
        Node x=head;
        while(x!=null)
        {
            x=x.next;
            l++;
        }
        return l;
    }


}
class linked_list_2{
    
public static void main(String args[])
{
    
   list list=new list();
	    

   list.push(10);list.push(9);list.push(17);list.push(11);list.push(100);
   list.display();
   System.out.println("sorting is performed length of linkedlist:"+list.getlength(list.gethead()));

   
   System.out.println("Ater sorting :"+list.sort(list.gethead()));
   list.display();

   
  

   /* System.out.println("");
    System.out.println("LINKED LIST");
    System.out.println("");
    Scanner sn=new Scanner(System.in);
    int a=1,b,k,pos;
    String movie;
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
                list.push(k);
                break;
            case 2:
                System.out.print("Enter element to insert at start :");
                k=sn.nextInt();
                list.push_last(k);
                break;
            case 3:
                System.out.print("Enter element  : ");
                k=sn.nextInt();
                System.out.print("Enter position : ");
                pos=sn.nextInt();
                list.insert_pos(k,pos);
                break;
           case 4:
                list.deletestart();
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
        System.out.println("");System.out.println("");System.out.println("");
        System.out.print("press 1 to continue :");
        a=sn.nextInt();
    }


     */

}
}