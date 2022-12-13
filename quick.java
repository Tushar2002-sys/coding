import java.util.Arrays;

public class quick {
    public static void main(String args[])
    {
        int arr[]={9,8,7,6,5,4,3,2,1};
        sort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));

    }   
    static void  sort(int arr[],int low,int high)
    {    

        
        if(low>=high)
        return ;
        
        int s=low,e=high-1;
        int mid=s+(e-s)/2;;
        int pivot=arr[mid];

        
        while(s<=e)
        {   
            // basic condition-- we want to sort arr[] before pivot index and after pivot index
            while(arr[s]<pivot)    // when while loop ends s has reached to the index where (arr[s] > pivot )  pivot .
            s++;

            while(arr[e]>pivot)    // when while loop ends e has reached to the index where ( arr[e] < pivot ) pivot  .
            e--;

            if(s<=e)   // voilation of rule swap start with end 
            {
                swap(arr,s,e);   
                s++;
                e--;
            }

        
        }
        
       sort(arr,low,e);     
       sort(arr,s,high);    
    } 
    static void swap(int arr[],int a,int b)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
