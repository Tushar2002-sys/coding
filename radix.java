/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <iostream>

using namespace std;

int main()
{   int arr[]={1,23,41,54,2,12,351,840,215,1020};  // 10 elements
    int size=sizeof(arr)/sizeof(arr[9]);
   

    return 0;
}

int radix(int arr[],int size)
{
    int max=radix(arr,size)
    for(int i=0;max/i>0;i=i*10)
    {
        count_sort(arr,size,i);
    }
}

int count_sort(int arr[],int siz,int ex)
{
    int count[10]={0};
    for(int i=0;i<size;i++)
    count[(arr[i]/ex)%10]++;
    
    for(int i=0;i<10;i++)
    {
        count[i]+=count[i-1];
    }
    for(int i=size-1;i>=0;i--)
}
int max(int arr[],int size)
{
    int max=arr[0];
    for(int i=0;i<size;i++)
    {
        if(max<arr[i])
        max=arr[i];
    }
    return max;
}