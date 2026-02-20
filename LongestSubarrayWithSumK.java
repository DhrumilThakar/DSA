/*Given an array nums of size n and an integer k, find the length of the longest sub-array that sums to k. If no such sub-array exists, return 0.*/

import java.util.HashMap;

public class LongestSubarrayWithSumK {

    public static int longestSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);

        int currSum = 0;
        int maxLen = 0;

        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];

            // If (currSum - k) seen before, update maxLen
            if (map.containsKey(currSum - k)) {
                int prevIndex = map.get(currSum - k);
                maxLen = Math.max(maxLen, i - prevIndex);
            }

            // Only add prefix sum if it's not already in the map
            if (!map.containsKey(currSum)) {
                map.put(currSum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 7, 1, 9};
        int k = 15;
        System.out.println(longestSubarraySum(nums, k));  // Output: 4
    }
}
