//In this code we are pairing element of the array with each other.
// This code takes an array of integers and prints all possible pairs of elements in the array.
//One think to keep in mind is that the pairs are printed in the order they appear in the array, and each pair is printed only once (i.e., (1,2) is printed but not (2,1)) also (1,1) will not print.
public class pair 
{
    public static void pair_in_array(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j =i+1;j<arr.length;j++)
            {
                System.out.print("("+arr[i]+","+arr[j]+") ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) 
    {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println("The pairs in the array are: ");
        pair_in_array(arr);
    }
}