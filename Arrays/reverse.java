//In this we are Reversing an array
public class reverse 
{
    public static void reverse_array(int arr[])
    {   
        //This is my Logic
        // System.out.print("The reverse of the array is: ");
        // for(int i=arr.length-1;i>=0;i--)
        // {
        //     System.out.print(arr[i]+" ");
        // }

        //This is Shradha Didi logic
        System.out.print("The reverse of the array is: ");
        int first = 0,last =arr.length-1,temp;
        while(first<last)
        {
            temp=arr[last];
            arr[last]=arr[first];
            arr[first]=temp;

            first++;
            last--;
        }
        for(int i:arr)
        {
            System.out.print(i+" ");
        }

    }
    public static void main(String[] args) 
    {
        int arr[] = new int[]{5,4,8,10,9,1,7};
        reverse_array(arr);
    }
}