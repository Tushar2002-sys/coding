import java.util.*;
class Node 
{
    public int data;
    public Node right,left;
    Node(int k)
    {
        this.data=k;
        right=left=null;
    }
}
class Traversal
{
   Node root;
   Traversal(){ root=null ;}
   void inorder(Node node)
   {
       if(node==null)
       return ;
       
       inorder(node.left);
       System.out.print(node.data+"  ");
       inorder(node.right);
   }
   
   
   
    void preorder(Node node)
   {
       if(node==null)
       return ;
       
       
       System.out.print(node.data+"  ");
       preorder(node.left);
       preorder(node.right);
   }
   
   
   
   void postorder(Node node)
   {
       if(node==null)
       return ;
       
       
       System.out.print(node.data+"  ");
       postorder(node.left);
       postorder(node.right);
   }
   int findmin_depth(Node node)
   {
    if(node==null)
    return 0;

    int l=findmin_depth(node.left);
    int r=findmin_depth(node.right);

    if(node.left==null)     // if left child is null then consder depth of right child .
    return 1+r;

    if(node.right==null)    // if right child is null then consder depth of left child .
    return 1+l;


    int k=(l<r)? l:r;       // minimum of (l,r)  
    return k+1;
   }
   
   
   
   
}
 class Binary_tree
{
    
	public static void main(String[] args) {
	Traversal pt=new Traversal();

    /*                                  35
                                    /        \
                                  25          45
                                /    \      /    \
                              20     30    40     55
                            /    \              /     \
                           10     23           50      66
    


     
     */
        pt.root = new Node(35);  
        pt.root.left = new Node(25);  
        pt.root.right = new Node(45);  
        pt.root.left.left = new Node(20);  
        pt.root.left.right = new Node(30);  
        pt.root.left.left.left = new Node(10);  
        pt.root.left.left.right = new Node(23);  
        pt.root.right.left = new Node(40);  
        pt.root.right.right = new Node(55);  
        pt.root.right.right.left = new Node(50);  
        pt.root.right.right.right = new Node(66);  
        
        System.out.print("inorder    :");
        pt.inorder(pt.root);
        System.out.println("");
        
        System.out.print("preorder   :");
        pt.preorder(pt.root);
        System.out.println("");
        
        System.out.print("postorder  :");
         
        pt.postorder(pt.root);
        System.out.println("");

        System.out.println("minimum depth of tree : "+pt.findmin_depth(pt.root));
    
	}
}
