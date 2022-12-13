import java.util.Stack;

public class sort_stack_recurssion {
    public static void main(String args[])
    {
        Stack<Integer> s1=new Stack<>();
        s1.push(5);s1.push(3);s1.push(4);s1.push(2);s1.push(1);s1.push(18); // 5,3,4,2,1,18;
        System.out.println("before sorting :"+s1);
        sort(s1);
        System.out.println("after sorting  :"+s1);
        
    }
    static void sort(Stack<Integer> s)
    {
        if(s.isEmpty())
        return ;

        int top=s.pop();     
        sort(s);  
        // when compiler will finish calling the stack(s) top will have the very first value or in this case top=5,
        // but top will still have value as stack{3,4,2,1,18}  which will be executed as programs comes out one by one

        sortedInsert(s,top);


    }
    static void sortedInsert(Stack<Integer> s,int key)
    {

        if(s.isEmpty() || key > s.peek())   
        {
            s.push(key);
            return ;
        }
        // remove element which is greater then key and once key is inserted at its correct position add elements to stack.
        int top=s.pop();    
        sortedInsert(s, key);

        s.push(top);   // push popped element bck to stack as key has its correct index 


    }

   
    
}
