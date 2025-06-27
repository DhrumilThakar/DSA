public class buyAndSellStock 
{
    public static int maxProfit(int[] arr)
    {
        int maxProfit=0;
        int minProfit=Integer.MAX_VALUE;
        int i;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]<minProfit)
            {
                minProfit=arr[i];
            }
            else
            {
                maxProfit=Math.max(maxProfit,arr[i]-minProfit);
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) 
    {
        int prices[] = {7, 1, 5, 3, 6, 4};
        System.out.println("Maximum profit is: " + maxProfit(prices));
    }
}
