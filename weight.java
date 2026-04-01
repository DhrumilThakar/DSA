import java.util.*;

 public class weight{

    public static int profit(int W, int[] arr1, int[] arr2) {
        int[] nums = new int[W + 1];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = W; j >= arr1[i]; j--) {
                nums[j] = Math.max(nums[j], arr2[i] + nums[j - arr1[i]]);
            }
        }
        return nums[W];
    }

    public static void main(String[] args) {

        int W = 15;
        int[] weight = {5,3,4,6};
        int[] profit = {10,7,9,12};
        System.out.println(profit(W, weight, profit));
        
    }
}