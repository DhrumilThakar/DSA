import java.util.*;
public class cie1 {
    public static void main(String[] args) {
        int[] traffic = { 6, 3, 5, 2, 9, 5, 1, 7 };
        NumArray na = new NumArray(traffic);
        System.out.println(na.sumRange(3, 7));
    }

    static class NumArray {
        private final int[] prefix; 

        public NumArray(int[] nums) {
            prefix = new int[nums.length + 1];
            for (int i = 0; i < nums.length; i++) {
                prefix[i + 1] = prefix[i] + nums[i];
            }
        }

        public int sumRange(int left, int right) {
            int sum = prefix[right + 1] - prefix[left];
            return (int) sum;
        }
    }
}
