package dynamicprogramming;

import java.util.Arrays;

/**
 * Hard
 * <p>
 * You are given a 2D array of integers envelopes where envelopes[i] = [wi, hi] represents the width and the height of an envelope.
 * <p>
 * One envelope can fit into another if and only if both the width and height of one envelope are greater than the other envelope's width and height.
 * <p>
 * Return the maximum number of envelopes you can Russian doll (i.e., put one inside the other).
 * <p>
 * Note: You cannot rotate an envelope.
 * <p>
 * Example 1:
 * <p>
 * Input: envelopes = [[5,4],[6,4],[6,7],[2,3]]
 * <p>
 * Output: 3
 * <p>
 * Explanation: The maximum number of envelopes you can Russian doll is 3 ([2,3] => [5,4] => [6,7]).
 * <p>
 * Example 2:
 * <p>
 * Input: envelopes = [[1,1],[1,1],[1,1]]
 * <p>
 * Output: 1
 * <p>
 * Constraints:
 * <p>
 * 1 <= envelopes.length <= 5000
 * envelopes[i].length == 2
 * 1 <= wi, hi <= 104
 */
public class RussianDollEnvelopes {

    public static void main(String[] args) {
        int[][] A = {{5, 4}, {6, 4}, {6, 7}, {2, 3}};
        System.out.println(new RussianDollEnvelopes().maxEnvelopes(A));
    }

    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, (a, b) -> a[0] != b[0] ? a[0] - b[0] : b[1] - a[1]);
        int[] tails = new int[envelopes.length];
        int size = 0;
        for (int[] enve : envelopes) {
            int i = 0;
            int j = size;
            while (i != j) {
                int mid = i + ((j - i) >> 1);
                if (tails[mid] < enve[1]) {
                    i = mid + 1;
                } else {
                    j = mid;
                }
            }
            tails[i] = enve[1];
            if (i == size) {
                size++;
            }
        }
        return size;
    }
}
