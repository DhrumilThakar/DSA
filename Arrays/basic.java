//Array is collection of similar data types
// It is a data structure that stores a fixed-size sequential collection of elements of the same type.
// It is used to store multiple values in a single variable, instead of declaring separate variables for each value.
// Arrays are zero-indexed, meaning the first element is at index 0, the second element is at index 1, and so on.
import java.util.*;

public class basic
{
    public static void main(String[] args)
    {
        /* There are different types to declare an array 
        1. int[] arr = new int[5]; // Declares an array of integers with a size of 5
        2. int arr[] = new int[5]; // Also declares an array of integers with a size of 5
        3. int[] arr = {1, 2, 3, 4, 5}; // Declares and initializes an array of integers with values
        4. int arr[] = {1, 2, 3, 4, 5}; // Also declares and initializes an array of integers with values
        5. int arr[] = new int[]{1, 2, 3, 4, 5}; // Declares and initializes an array of integers with values
        6. int arr[] = new int[5]; // Declares an array of integers with a size of 5, but does not initialize the values
        */
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = s.nextInt();
        int[] arr = new int[size];
        for(int i =0; i<size; i++) //We can also use arr.length to get the size of the array
        {
            System.out.print("Enter the element at index " + i + ": ");
            arr[i] = s.nextInt();
        }
        System.out.println("The elements of the array are: ");
        for(int i = 0; i < size; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("Enter the index of the element you want to access: ");
        int index = s.nextInt();
        if(index >= 0 && index < size) {
            System.out.println("The element at index " + index + " is: " + arr[index]);
        } else {
            System.out.println("Index out of bounds");
        }
        s.close();
    }
}