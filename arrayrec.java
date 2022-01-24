import java.util.Scanner;

public class arrayrec 
{
   static void printarr(int arr[],int i, int n)
    {
        if(i>=n)
        return;
        else 
        System.out.println(arr[i]+" ");
        printarr(arr,i+1,n);
    }
    public static void main(String[] args) 
    {
        int n ,i;
        Scanner sc = new Scanner (System.in);
        System.out.println("enter array size");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array ele");
        for(i=0;i<n;i++)
        {
        arr[i]=sc.nextInt();
        }
        System.out.println("elements of array are " );
        printarr(arr, 0, n);
        
        sc.close();
    }

    
}
