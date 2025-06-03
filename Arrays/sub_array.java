public class sub_array 
{
    public static void sub(int arr[])
    {
        int start,end;
        for(int i =0;i<arr.length;i++)
        {
            start =i;
            for(int j=i;j<arr.length;j++)
            {
                end=j;
                for(int k =start;k<=end;k++)
                {
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) 
    {
       int arr[] = {1, 2, 3, 4, 5};
         System.out.println("The sub arrays in the array are: ");
         sub(arr); 
    }
}