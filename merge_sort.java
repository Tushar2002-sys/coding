import java.util.Arrays;

public class merge_sort{
    public static void main(String args[])
    {int arr[]={5,4,6,3,2,1};
    System.out.println(Arrays.toString(mergesort(arr)));

    }

    static int[] mergesort(int arr[])
    {
        if(arr.length==1)
        return arr;
         
        int mid=arr.length/2;
        int l1[]=mergesort(Arrays.copyOfRange(arr,0,mid));                   
        int r1[]=mergesort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(l1,r1);

    }
    static int[] merge(int left[],int right[])
    {
        int f1[]=new int[left.length+right.length];
        int i=0,j=0,k=0;
        while(i<left.length && j<right.length)
        {
            if(left[i] < right[j])    //meqans left element is smaller 
            {

                f1[k++]=left[i];
                i++;

            }
            else
            {
                f1[k++]=right[j];
                j++;
            }

        }

        while(i<left.length)
        {
            f1[k++]=left[i];
            i++;
        }
        
        while(j<right.length)
        {
            f1[k++]=right[j];
            j++;

        }

        return f1;

    }
}