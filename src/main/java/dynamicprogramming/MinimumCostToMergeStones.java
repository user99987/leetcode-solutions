package dynamicprogramming;

import java.util.Arrays;

/**
 * Hard
 * <p>
 * There are n piles of stones arranged in a row. The ith pile has stones[i] stones.
 * <p>
 * A move consists of merging exactly k consecutive piles into one pile, and the cost of this move is equal to the total number of stones in these k piles.
 * <p>
 * Return the minimum cost to merge all piles of stones into one pile. If it is impossible, return -1.
 * <p>
 * Example 1:
 * <p>
 * Input: stones = [3,2,4,1], k = 2
 * <p>
 * Output: 20
 * <p>
 * Explanation: We start with [3, 2, 4, 1].
 * <p>
 * We merge [3, 2] for a cost of 5, and we are left with [5, 4, 1].
 * <p>
 * We merge [4, 1] for a cost of 5, and we are left with [5, 5].
 * <p>
 * We merge [5, 5] for a cost of 10, and we are left with [10].
 * <p>
 * The total cost was 20, and this is the minimum possible.
 * <p>
 * Example 2:
 * <p>
 * Input: stones = [3,2,4,1], k = 3
 * <p>
 * Output: -1
 * <p>
 * Explanation: After any merge operation, there are 2 piles left, and we can’t merge anymore. So the task is impossible.
 * <p>
 * Example 3:
 * <p>
 * Input: stones = [3,5,1,2,6], k = 3
 * <p>
 * Output: 25
 * <p>
 * Explanation: We start with [3, 5, 1, 2, 6].
 * <p>
 * We merge [5, 1, 2] for a cost of 8, and we are left with [3, 8, 6].
 * <p>
 * We merge [3, 8, 6] for a cost of 17, and we are left with [17].
 * <p>
 * The total cost was 25, and this is the minimum possible.
 * <p>
 * Constraints:
 * <p>
 * n == stones.length
 * 1 <= n <= 30
 * 1 <= stones[i] <= 100
 * 2 <= k <= 30
 */
public class MinimumCostToMergeStones {

    private int[][] memo;
    private int[] prefixSum;

    public static void main(String[] args) {
        int[] A = {3, 5, 1, 2, 6};
        System.out.println(new MinimumCostToMergeStones().mergeStones(A, 2));
    }

    public int mergeStones(int[] stones, int k) {
        int n = stones.length;
        if ((n - 1) % (k - 1) != 0) {
            return -1;
        }
        memo = new int[n][n];
        for (int[] arr : memo) {
            Arrays.fill(arr, -1);
        }
        prefixSum = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            prefixSum[i] = prefixSum[i - 1] + stones[i - 1];
        }
        return dp(0, n - 1, k);
    }

    private int dp(int left, int right, int k) {
        if (memo[left][right] > 0) {
            return memo[left][right];
        }
        if (right - left + 1 < k) {
            memo[left][right] = 0;
            return memo[left][right];
        }
        if (right - left + 1 == k) {
            memo[left][right] = prefixSum[right + 1] - prefixSum[left];
            return memo[left][right];
        }
        int val = Integer.MAX_VALUE;
        for (int i = 0; left + i + 1 <= right; i += k - 1) {
            val = Math.min(val, dp(left, left + i, k) + dp(left + i + 1, right, k));
        }
        if ((right - left) % (k - 1) == 0) {
            val += prefixSum[right + 1] - prefixSum[left];
        }
        memo[left][right] = val;
        return val;
    }
}
