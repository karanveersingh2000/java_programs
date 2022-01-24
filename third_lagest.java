import java.util.Scanner;

public class third_lagest 
{
    static void largest(int arr[],int arr_size)
    {
        if(arr_size<3)
        {
            System.out.println("invalid");
            return;
        }
        int first=arr[0], second =Integer.MIN_VALUE , third=Integer.MIN_VALUE;
        for(int i=0;i<arr_size;i++)
        {
            if(arr[i]>first)
            {
            third=second;
            second=first;
            first=arr[i];
            }
            else if(arr[i]>second)
            {
                third=second;
                second=arr[i];
            }
            else if(arr[i]>third)
            third=arr[i];
        }
        System.out.println("third largest ele is"+third);  
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        n=sc.nextInt();
        int arr[]=new int[n]; 
        System.out.println("enter ele of array");
        for(int j=0;j<arr.length;j++)
        {
            arr[j]=sc.nextInt();

        }
        largest( arr,n);
        sc.close();
    }
    
}
