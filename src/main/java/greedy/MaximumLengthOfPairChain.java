package greedy;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Medium
 * <p>
 * You are given an array of n pairs pairs where pairs[i] = [lefti, righti] and lefti < righti.
 * <p>
 * A pair p2 = [c, d] follows a pair p1 = [a, b] if b < c. A chain of pairs can be formed in this fashion.
 * <p>
 * Return the length longest chain which can be formed.
 * <p>
 * You do not need to use up all the given intervals. You can select pairs in any order.
 * <p>
 * Example 1:
 * <p>
 * Input: pairs = [[1,2],[2,3],[3,4]]
 * <p>
 * Output: 2
 * <p>
 * Explanation: The longest chain is [1,2] -> [3,4].
 * <p>
 * Example 2:
 * <p>
 * Input: pairs = [[1,2],[7,8],[4,5]]
 * <p>
 * Output: 3
 * <p>
 * Explanation: The longest chain is [1,2] -> [4,5] -> [7,8].
 * <p>
 * Constraints:
 * <p>
 * n == pairs.length
 * 1 <= n <= 1000
 * -1000 <= lefti < righti <= 1000
 */
public class MaximumLengthOfPairChain {


    public static void main(String[] args) throws Exception {
        int[][] A = {{1, 2}, {2, 3}, {3, 4}};
        System.out.println(new MaximumLengthOfPairChain().findLongestChain(A));
    }

    public int findLongestChain(int[][] pairs) {
        if (pairs.length == 1) {
            return 1;
        }
        Arrays.sort(pairs, Comparator.comparingInt(a -> a[1]));
        int min = pairs[0][1];
        int max = 1;
        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > min) {
                max++;
                min = pairs[i][1];
            }
        }
        return max;
    }
}
