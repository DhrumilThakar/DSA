public class subArrayMaxSum 
{
    public static int maxSum_of_subArray(int arr[])
    {
        int maxSum = Integer.MIN_VALUE;
        int current = 0;

        for (int i = 0; i < arr.length; i++) 
        {
            int start = i;
            for (int j = i; j < arr.length; j++)
            {
                int end = j;
                current = 0;
                for (int k = start; k <= end; k++) 
                {
                    current += arr[k];
                }
                System.out.print(current + " ");
                if (current > maxSum) 
                {
                    maxSum = current;
                }
            }
            System.out.println();
        }
        return maxSum;
    }

    public static void main(String[] args) 
    {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println("\nThe maximum sum of sub array in the array is: " + maxSum_of_subArray(arr));
    }
}
