/*Kadans algorithm says that if we add one small +ve number and a big -ve number than the result wil be -ve. But instead of considring -ve value we consider it as 0 */
public class kadansAlgo 
{
    public static void Kadans(int arr[])
    {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            currentSum +=arr[i];
            if(currentSum < 0)
            {
                currentSum = 0; // If current sum is negative, reset it to 0
            }
            if(currentSum > maxSum)
            {
                maxSum = currentSum; // Update maxSum if currentSum is greater
            }
        }
        System.out.println("Maximum subarray sum is: " + maxSum);
    }
    public static void main(String[] args) 
    {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        Kadans(arr); // Calling the Kadans method to find the maximum subarray sum
        // Output should be 7 for this example as the subarray [4, -1, -2, 1, 5] has the maximum sum.
    }   
}//This code will not work for all -ve numbers, it will only work for the case where there is at least one positive number in the array.
// If all numbers are negative, it will return 0 as the maximum subarray sum.