package dynamicprogramming;

/**
 * Hard
 * <p>
 * There is a one-dimensional garden on the x-axis. The garden starts at the point 0 and ends at the point n. (i.e The length of the garden is n).
 * <p>
 * There are n + 1 taps located at points [0, 1, ..., n] in the garden.
 * <p>
 * Given an integer n and an integer array ranges of length n + 1 where ranges[i] (0-indexed) means the i-th tap can water the area [i - ranges[i], i + ranges[i]] if it was open.
 * <p>
 * Return the minimum number of taps that should be open to water the whole garden, If the garden cannot be watered return -1.
 * <p>
 * Example 1:
 * <p>
 * <p>
 * <p>
 * Input: n = 5, ranges = [3,4,1,1,0,0]
 * <p>
 * Output: 1
 * <p>
 * Explanation: The tap at point 0 can cover the interval [-3,3]
 * <p>
 * The tap at point 1 can cover the interval [-3,5]
 * <p>
 * The tap at point 2 can cover the interval [1,3]
 * <p>
 * The tap at point 3 can cover the interval [2,4]
 * <p>
 * The tap at point 4 can cover the interval [4,4]
 * <p>
 * The tap at point 5 can cover the interval [5,5]
 * <p>
 * Opening Only the second tap will water the whole garden [0,5]
 * <p>
 * Example 2:
 * <p>
 * Input: n = 3, ranges = [0,0,0,0]
 * <p>
 * Output: -1
 * <p>
 * Explanation: Even if you activate all the four taps you cannot water the whole garden.
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 10^4
 * ranges.length == n + 1
 * 0 <= ranges[i] <= 100
 */
public class MinimumNumberOfTaps {

    public int minTaps(int n, int[] ranges) {
        int[] maxReach = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            int left = Math.max(0, i - ranges[i]);
            int right = Math.min(n, i + ranges[i]);
            maxReach[left] = Math.max(maxReach[left], right);
        }

        int taps = 0, currEnd = 0, farthest = 0;
        for (int i = 0; i <= n; i++) {
            if (i > farthest) return -1;
            if (i > currEnd) {
                taps++;
                currEnd = farthest;
            }
            farthest = Math.max(farthest, maxReach[i]);
        }
        return taps;
    }
}
