package dynamicprogramming;

/**
 * Medium
 * <p>
 * Given an integer n, return the number of structurally unique BST’s (binary search trees) which has exactly n nodes of unique values from 1 to n.
 * <p>
 * Example 1:
 * <p>
 * Input: n = 3
 * <p>
 * Output: 5
 * <p>
 * Example 2:
 * <p>
 * Input: n = 1
 * <p>
 * Output: 1
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 19
 */
public class UniqueBinarySearchTrees {

    public static void main(String[] args) throws Exception {
        System.out.println(new UniqueBinarySearchTrees().numTrees(5));
    }

    public int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i - j - 1];
            }
        }
        return dp[n];
    }

}
