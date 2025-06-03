//In this we are finding the largest number from the array
import java.util.*;
public class largest_in_array 
{
    public static int large(int arr[])
    {
        int largest = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                largest=arr[i];
            }
        }
        return largest;
    }
    //To find the smallest
    public static int small(int arr[])
    {
        int smallest = Integer.MAX_VALUE;
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i]<smallest)
            {
                smallest=arr[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int size = s.nextInt();
        int arr[] = new int[size];
        for(int i =0;i<size;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.print("The arry is: ");
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.print("The largest number from the array is: "+large(arr));
        System.out.println();
        System.out.print("The smallest number from the array is: "+small(arr));
        s.close();
    }
}