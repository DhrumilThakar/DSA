import java.util.*;

public class KnapsackDP {

    public static int maxProfit(int W, int[] weight, int[] profit, int n) {

        int[][] dp = new int[n + 1][W + 1];

        for (int i = 0; i <= n; i++) {
            for (int w = 0; w <= W; w++) {

                // Base case
                if (i == 0 || w == 0) {
                    dp[i][w] = 0;
                }

                // Include or exclude item
                else if (weight[i - 1] <= w) {
                    dp[i][w] = Math.max(
                            dp[i - 1][w], // not take
                            profit[i - 1] + dp[i - 1][w - weight[i - 1]] // take
                    );
                }

                // Cannot take item
                else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }

        return dp[n][W];
    }

    public static void main(String[] args) {
        int W = 15;
        int[] weight = {5, 3, 4, 6};
        int[] profit = {10, 7, 9, 12};
        int n = weight.length;

        System.out.println(maxProfit(W, weight, profit, n)); // Output: 28
    }
}