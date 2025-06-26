public class prefixSum 
{
    public static int prefixsum(int arr[])
    {
        int currentSum =0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++)
        {
            prefix[i]=prefix[i-1]+arr[i];
        }
        for(int i =0;i<prefix.length;i++)
        {
            int start =i;
            for(int j=i;j<prefix.length;j++)
            {
                int end = j;
                currentSum = start ==0 ? prefix[end]:prefix[end] - prefix[start-1];
            }
            System.out.print(currentSum + " ");
            if(currentSum > maxSum)
            {
                maxSum = currentSum;
            }
            System.out.println();
        }
        return maxSum;
    }
    public static void main(String[] args) 
    {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.println("The maximum sum of sub array in the array is: " + prefixsum(arr));
    }
}