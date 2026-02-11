//Given an array of integers nums, return the second-largest element in the array. If the second-largest element does not exist, return -1.

import java.util.Arrays;

public class second_largest {

    public static int Brut_force(int[] arr){ //Time complexity => O(nlogn+n)
        Arrays.sort(arr);
        int n = arr.length-1;
        int largest = arr[n];
        for(int i = arr.length-1;i>0;i--){
            if(arr[i]!=largest){
                return arr[i];
            }
        }
        return -1;
    }

    public static int better(int arr[]){ // Time complexity =>O(2n)
        int largest = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        
        int second_largest = Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>second_largest && arr[i]!=largest){
                second_largest = arr[i];
            }
        }
        if(second_largest==Integer.MIN_VALUE)
        {
            return-1;
        }
        return second_largest;
    }

    public static int optimal(int[] arr){ //Time complexity =>O(n)
        int largest = arr[0];
        int second_largest = Integer.MIN_VALUE;

        for(int i =0;i<arr.length;i++){
            if(arr[i]>largest){
                second_largest = largest;
                largest = arr[i];
            }
            else if(arr[i]<largest && arr[i]>second_largest){
                second_largest = arr[i];
            }
        }
        if(second_largest==Integer.MIN_VALUE){
            return -1;
        }
        return second_largest;
    }
    public static void main(String[] args) {
        int[] arr = {8,8,7,6,5};
        System.out.println("Solution using brut force: "+Brut_force(arr));
        System.out.println("Solution using better solution: "+better(arr));
        System.out.println("Solution using Optimal solution: "+optimal(arr));
    } 
}