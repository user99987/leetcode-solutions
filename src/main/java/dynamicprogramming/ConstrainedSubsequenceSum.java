package dynamicprogramming;

import java.util.LinkedList;

/**
 * Hard
 * <p>
 * Given an integer array nums and an integer k, return the maximum sum of a non-empty subsequence of that array such that for every two consecutive integers in the subsequence, nums[i] and nums[j], where i < j, the condition j - i <= k is satisfied.
 * <p>
 * A subsequence of an array is obtained by deleting some number of elements (can be zero) from the array, leaving the remaining elements in their original order.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [10,2,-10,5,20], k = 2
 * <p>
 * Output: 37
 * <p>
 * Explanation: The subsequence is [10, 2, 5, 20].
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [-1,-2,-3], k = 1
 * <p>
 * Output: -1
 * <p>
 * Explanation: The subsequence must be non-empty, so we choose the largest number.
 * <p>
 * Example 3:
 * <p>
 * Input: nums = [10,-2,-10,-5,20], k = 2
 * <p>
 * Output: 23
 * <p>
 * Explanation: The subsequence is [10, -2, -5, 20].
 * <p>
 * Constraints:
 * <p>
 * 1 <= k <= nums.length <= 10^5
 * -10^4 <= nums[i] <= 10^4
 */
public class ConstrainedSubsequenceSum {

    public int constrainedSubsetSum(int[] nums, int k) {
        int n = nums.length;
        int res = Integer.MIN_VALUE;
        LinkedList<int[]> mono = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            int take = nums[i];

            while (!mono.isEmpty() && i - mono.getFirst()[0] > k) {
                mono.removeFirst();
            }
            if (!mono.isEmpty()) {
                int mx = Math.max(0, mono.getFirst()[1]);
                take += mx;
            }
            while (!mono.isEmpty() && take > mono.getLast()[1]) {
                mono.removeLast();
            }

            mono.add(new int[]{i, take});
            res = Math.max(res, take);
        }
        return res;
    }
}
