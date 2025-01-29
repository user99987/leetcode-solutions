package dynamicprogramming;

/**
 * Hard
 * <p>
 * There is a group of n members, and a list of various crimes they could commit. The ith crime generates a profit[i] and requires group[i] members to participate in it. If a member participates in one crime, that member can't participate in another crime.
 * <p>
 * Let's call a profitable scheme any subset of these crimes that generates at least minProfit profit, and the total number of members participating in that subset of crimes is at most n.
 * <p>
 * Return the number of schemes that can be chosen. Since the answer may be very large, return it modulo 109 + 7.
 * <p>
 * Example 1:
 * <p>
 * Input: n = 5, minProfit = 3, group = [2,2], profit = [2,3]
 * <p>
 * Output: 2
 * <p>
 * Explanation:
 * <p>
 * To make a profit of at least 3, the group could either commit crimes 0 and 1, or just crime 1.
 * <p>
 * In total, there are 2 schemes.
 * <p>
 * Example 2:
 * <p>
 * Input: n = 10, minProfit = 5, group = [2,3,5], profit = [6,7,8]
 * <p>
 * Output: 7
 * <p>
 * Explanation:
 * <p>
 * To make a profit of at least 5, the group could commit any crimes, as long as they commit one.
 * <p>
 * There are 7 possible schemes: (0), (1), (2), (0,1), (0,2), (1,2), and (0,1,2).
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 100
 * 0 <= minProfit <= 100
 * 1 <= group.length <= 100
 * 1 <= group[i] <= 100
 * profit.length == group.length
 * 0 <= profit[i] <= 100
 */
public class ProfitableSchemes {

    private static final int MOD = 1_000_000_007;

    public int profitableSchemes(int n, int minProfit, int[] group, int[] profit) {
        int[][] dp = new int[n + 1][minProfit + 1];
        dp[0][0] = 1;

        for (int i = 0; i < group.length; i++) {
            int members = group[i], gain = profit[i];
            for (int people = n; people >= members; people--) {
                for (int p = minProfit; p >= 0; p--) {
                    dp[people][p] = (dp[people][p] + dp[people - members][Math.max(0, p - gain)]) % MOD;
                }
            }
        }

        int totalWays = 0;
        for (int people = 0; people <= n; people++) {
            totalWays = (totalWays + dp[people][minProfit]) % MOD;
        }
        return totalWays;
    }
}
