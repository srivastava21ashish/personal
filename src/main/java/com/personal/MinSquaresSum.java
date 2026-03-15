package com.personal;

/**
 * Returns the minimum count of numbers, sum of whose squares is equal to A.
 * Uses dynamic programming: dp[i] = min count of perfect squares that sum to i.
 */
public class MinSquaresSum {

    public static int minCount(int A) {
        if (A <= 0) {
            return 0;
        }
        // dp[i] = minimum number of perfect squares that sum to i
        int[] dp = new int[A + 1];
        for (int i = 1; i <= A; i++) {
            dp[i] = i; // worst case: i ones (1^2 + 1^2 + ...)
            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }
        return dp[A];
    }
}
