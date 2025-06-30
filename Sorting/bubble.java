/*Bubble Sort is the basic sorting algo. The logic Behind bubble sort is similar to soda bubble. as th bubble arise to the top we simply swap number in a way that the smallest come in starting. */
public class bubble {
    public static void bubbleSort(int[] arr)
    {
        for(int i =0;i<arr.length-1;i++)
        {
            for(int j =0;j<arr.length-1;j++)
            {
                if(arr[j]>arr[j+1])
            {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] =temp;
            }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr);
        System.out.println("Sorted array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    
}
