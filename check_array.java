//Given an array nums of n integers, return true if the array nums is sorted in non-decreasing order or else false.

public class check_array {

    public static boolean isSorted(int arr[]){ // Time complexity =>O(n)

        for(int i =1;i< arr.length;i++){
            if(arr[i]>=arr[i-1]){

            }
            else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,1,4,5};
        System.out.println(isSorted(arr));
    }
}