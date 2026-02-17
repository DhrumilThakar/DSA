import java.util.Arrays;

public class zero {

    public static int[] brute(int arr[]){ //Time complexity => O(n) and Space Complexity => O(n)

        int temp[]= new int[arr.length];
        int index = 0;

        for(int i =0;i<arr.length;i++){
            if(arr[i]!=0){
                temp[index]=arr[i];
                index++;
            }
        }

        for(int i =0;i<arr.length;i++){
            arr[i] = temp[i];
        }

        return arr;
    }
   
   public static int[] optimal(int arr[]){ //Time complexity => O(n) and space Complexity => O(1)

    int j =-1;

    for(int i=0;i<arr.length;i++){
        if(arr[i] == 0){
            j=i;
            break;
        }
    }

    if(j==-1){
        return arr;
    }

    for(int i =j+1;i<arr.length;i++){
        if(arr[i]!=0){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        j++;
    }
    return arr;

   }
    public static void main(String[] args) {
        int arr[] = { 0, 1, 4, 0, 5, 2};

        System.out.println(Arrays.toString(brute(arr)));
        System.out.println(Arrays.toString(optimal(arr)));
    }
}