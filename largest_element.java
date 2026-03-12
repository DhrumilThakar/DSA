//Given an array of integers nums, return the value of the largest element in the array

import java.util.*;
public class largest_element {
    public static int largest(int[] arr){
        int largest = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int[] arr = {3,3,6,1};

        System.out.println(largest(arr));
    }
}

//Time complexity = O(n)
//Space complexity =O(1)