import java.util.*;

public class sort_stack_temp {

    public static void  main(String[] args) {
        Stack <Integer> s1=new Stack<>();
        s1.push(50);s1.push(50);s1.push(85);s1.push(58);s1.push(15);s1.push(52);
        System.out.println("before sorting :"+s1);
        Stack<Integer> sf=sort(s1);
        System.out.println("after sorting  :"+sf);
        
    }
    
    static Stack<Integer> sort(Stack<Integer> s)
    {
        Stack<Integer> s1=new Stack<>();
        while(!s.isEmpty())
        {
            int temp=s.pop();
            while(!s1.isEmpty() && s1.peek()>temp)
            {
                int k=s1.pop();
                s.push(k);
            }
            s1.push(temp);
        }
        return s1;
    }
}
