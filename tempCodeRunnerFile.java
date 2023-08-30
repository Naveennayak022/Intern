import java.util.*;
public class mergesort
{
    static int size;
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        System.out.println("enter size of array");
        size=in.nextInt();
        int arr[]=new int[size];
        for (int i = 0;i<size;i++)
        {
            arr[i]=in.nextInt();
        }
        sort(arr,0,size-1);
    }
    public static void merge(int a[],int low,int mid, int high)
    {
        int i=low;
        int j=mid+1;
        int k=low;
        int c[]=new int[size];
        while(i<=mid && j<=high)
        {
            if(a[i]<a[j])
            {
                c[k]=a[i];
                i++;
                k++;
            }
            else
            {
                c[k]=a[j];
                j++;
                k++;
            }
        }
        while(i<=mid)
        {
            c[k++]=a[j++];
        }
        for(i=low;i<=high;i++)
        {
            a[i]=c[i];
        }
    }
    public static void sort(int a[],int low,int high)
    {
        int mid;
        if(low<high)
        {
            mid=(low+high)/2;
            sort(a,low,mid);
            sort(a,mid+1,high);
            merge(a,low,mid,high);
        }
    }
}