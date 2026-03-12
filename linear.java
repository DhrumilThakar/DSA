//Given an array, and an element num the task is to find if num is present in the given array or not. If present print the index of the element or print -1.

public class linear {

    public static int search(int arr[],int key){ //Time Complexity = O(n) and Space Complexity O(1)

        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 4, 5, 3};

        System.out.println(search(arr, 4));
    }
    
}
