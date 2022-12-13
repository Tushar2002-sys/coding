import java.util.*;
public class implemnt_graph {
    int V;
    LinkedList<Integer> graph[];
    implemnt_graph(int v)
    {
        V=v;
        graph=new LinkedList[V];
        for(int i=0;i<V;i++)
        {
            graph[i]=new LinkedList<>();
        }
    }
    void addEdge(int idx,int value)
    {
        graph[idx].add(value);
    }
    void printGraph()
    {
        for(int i=0;i<V;i++)
        {
            System.out.print("Node :"+i);
            for(int x: graph[i])
            {
                System.out.print("->"+x);
            }
            System.out.println("");
        }
    }

    public static void main(String args[])
    {
        implemnt_graph g= new implemnt_graph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2,0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        g.printGraph();
        
        
        


    }
    
}
