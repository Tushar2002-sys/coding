wimport java.util.Scanner;

import javax.swing.text.html.StyleSheet;

public class sort_recursion {

    static boolean sort(int arr[],int index)
    {
        if(index==arr.length-1)   // base condition 
        return true;
        else
        {
            return arr[index]<arr[index+1] && sort(arr,index+1);
        }
    }

    public static void main(String args[])
    {
        int arr[]=new int[5];
        Scanner sn=new Scanner(System.in);
        System.out.println("Enetre 5 elements in array :");
        for(int i=0;i<5;i++)
        arr[i]=sn.nextInt();

        System.out.println(sort(arr,0));
    }
    
}
