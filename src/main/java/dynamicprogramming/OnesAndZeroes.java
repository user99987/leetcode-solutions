package dynamicprogramming;

/**
 * Medium
 * <p>
 * You are given an array of binary strings strs and two integers m and n.
 * <p>
 * Return the size of the largest subset of strs such that there are at most m 0's and n 1's in the subset.
 * <p>
 * A set x is a subset of a set y if all elements of x are also elements of y.
 * <p>
 * Example 1:
 * <p>
 * Input: strs = ["10","0001","111001","1","0"], m = 5, n = 3
 * <p>
 * Output: 4
 * <p>
 * Explanation: The largest subset with at most 5 0's and 3 1's is {"10", "0001", "1", "0"}, so the answer is 4. Other valid but smaller subsets include {"0001", "1"} and {"10", "1", "0"}. {"111001"} is an invalid subset because it contains 4 1's, greater than the maximum of 3.
 * <p>
 * Example 2:
 * <p>
 * Input: strs = ["10","0","1"], m = 1, n = 1
 * <p>
 * Output: 2
 * <p>
 * Explanation: The largest subset is {"0", "1"}, so the answer is 2.
 * <p>
 * Constraints:
 * <p>
 * 1 <= strs.length <= 600
 * 1 <= strs[i].length <= 100
 * strs[i] consists only of digits '0' and '1'.
 * 1 <= m, n <= 100
 */
public class OnesAndZeroes {

    public int findMaxForm(String[] strs, int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        for (String str : strs) {
            int[] count = count(str);
            for (int i = m; i >= count[0]; i--) {
                for (int j = n; j >= count[1]; j--) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - count[0]][j - count[1]] + 1);
                }
            }
        }
        return dp[m][n];
    }

    private int[] count(String str) {
        int[] res = new int[2];
        for (int i = 0; i < str.length(); i++) {
            res[str.charAt(i) - '0']++;
        }
        return res;
    }
}
