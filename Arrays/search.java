//we are going to implement linear search and binary search in this file
import java.util.*;
public class search 
{
    public static int linearSearch(int arr[], int target)
    {
        for(int i =0 ;i<arr.length;i++)
        {
            if(arr[i] == target)
            {
                return i; //return the index of the element
            }
        }
        return -1; //if the element is not found, return -1
    }

    public static int binarySearch(int arr[], int target)// ***Most imp thing to keep in mind in binary search is that the array should be of sorted order
    {
        int start = 0;
        int end = arr.length-1;
        while(start<=end)
        {
            int mid = (start+end)/2; //find the middle index
            if(arr[mid]==target)
            {
                return mid; //if the element is found, return the index
            }
            else if(arr[mid]<target)
            {
                start = mid+1;//if the element is on right side, we increase the starting index form middle
            }
            else
            {
                end = mid-1; //if the element is on left side, we decrease the ending index to middle
            }
        }
        return -1 ;//
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = s.nextInt();
        int arr[] = new int[size];
        for(int i =0;i<size;i++)
        {
            arr[i] =s.nextInt();
        }
        System.out.print("The Array is: ");
        for(int i :arr)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.print("Enter the number you want to search: ");
        int search = s.nextInt();
        System.out.print("Linear search: "+linearSearch(arr, search));
        System.out.println();
        System.out.print("Binary search: "+binarySearch(arr, search));
        s.close();
    }
}
//Time complexity of both search are: