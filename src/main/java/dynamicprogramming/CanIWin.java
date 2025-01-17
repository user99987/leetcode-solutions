package dynamicprogramming;

import java.util.Map;

/**
 * Medium
 * <p>
 * In the “100 game” two players take turns adding, to a running total, any integer from 1 to 10. The player who first causes the running total to reach or exceed 100 wins.
 * <p>
 * What if we change the game so that players cannot re-use integers?
 * <p>
 * For example, two players might take turns drawing from a common pool of numbers from 1 to 15 without replacement until they reach a total >= 100.
 * <p>
 * Given two integers maxChoosableInteger and desiredTotal, return true if the first player to move can force a win, otherwise, return false. Assume both players play optimally.
 * <p>
 * Example 1:
 * <p>
 * Input: maxChoosableInteger = 10, desiredTotal = 11
 * <p>
 * Output: false
 * <p>
 * Explanation:
 * <p>
 * No matter which integer the first player choose, the first player will lose.
 * <p>
 * The first player can choose an integer from 1 up to 10.
 * <p>
 * If the first player choose 1, the second player can only choose integers from 2 up to 10.
 * <p>
 * The second player will win by choosing 10 and get a total = 11, which is >= desiredTotal.
 * <p>
 * Same with other integers chosen by the first player, the second player will always win.
 * <p>
 * Example 2:
 * <p>
 * Input: maxChoosableInteger = 10, desiredTotal = 0
 * <p>
 * Output: true
 * <p>
 * Example 3:
 * <p>
 * Input: maxChoosableInteger = 10, desiredTotal = 1
 * <p>
 * Output: true
 * <p>
 * Constraints:
 * <p>
 * 1 <= maxChoosableInteger <= 20
 * 0 <= desiredTotal <= 300
 */
public class CanIWin {

    private Map<Boolean, Map<Integer, Boolean>> DP;

    public static void main(String[] args) throws Exception {
        System.out.println(new CanIWin().canIWin(5, 15));
    }

    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        if (desiredTotal <= maxChoosableInteger) {
            return true;
        }
        if (1.0 * maxChoosableInteger * (1 + maxChoosableInteger) / 2 < desiredTotal) {
            return false;
        }
        return canWin(0, new Boolean[1 << maxChoosableInteger], desiredTotal, maxChoosableInteger);
    }

    private boolean canWin(int state, Boolean[] dp, int desiredTotal, int maxChoosableInteger) {
        // state is the bitmap representation of the current state of choosable integers left
        // dp[state] represents whether the current player can win the game at state
        if (dp[state] != null) {
            return dp[state];
        }
        for (int i = 1; i <= maxChoosableInteger; i++) {
            // current number to pick
            int cur = 1 << (i - 1);
            if ((cur & state) == 0
                    && (i >= desiredTotal
                    || !canWin(state | cur, dp, desiredTotal - i, maxChoosableInteger))) {
                // i is greater than the desired total
                // or the other player cannot win after the current player picks i
                dp[state] = true;
                return dp[state];
            }
        }
        dp[state] = false;
        return dp[state];
    }
}
