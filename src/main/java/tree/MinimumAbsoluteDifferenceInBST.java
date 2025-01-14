package tree;

import java.util.List;
import java.util.TreeSet;

/**
 * Medium
 * <p>
 * You are given a 0-indexed integer array nums and an integer x.
 * <p>
 * Find the minimum absolute difference between two elements in the array that are at least x indices apart.
 * <p>
 * In other words, find two indices i and j such that abs(i - j) >= x and abs(nums[i] - nums[j]) is minimized.
 * <p>
 * Return an integer denoting the minimum absolute difference between two elements that are at least x indices apart.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [4,3,2,4], x = 2
 * <p>
 * Output: 0
 * <p>
 * Explanation:
 * <p>
 * We can select nums[0] = 4 and nums[3] = 4.
 * <p>
 * They are at least 2 indices apart, and their absolute difference is the minimum, 0.
 * <p>
 * It can be shown that 0 is the optimal answer.
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [5,3,2,10,15], x = 1
 * <p>
 * Output: 1
 * <p>
 * Explanation:
 * <p>
 * We can select nums[1] = 3 and nums[2] = 2.
 * <p>
 * They are at least 1 index apart, and their absolute difference is the minimum, 1.
 * <p>
 * It can be shown that 1 is the optimal answer.
 * <p>
 * Example 3:
 * <p>
 * Input: nums = [1,2,3,4], x = 3
 * <p>
 * Output: 3
 * <p>
 * Explanation:
 * <p>
 * We can select nums[0] = 1 and nums[3] = 4.
 * <p>
 * They are at least 3 indices apart, and their absolute difference is the minimum, 3.
 * <p>
 * It can be shown that 3 is the optimal answer.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 105
 * 1 <= nums[i] <= 109
 * 0 <= x < nums.length
 */
public class MinimumAbsoluteDifferenceInBST {

    public static void main(String[] args) throws Exception {
        System.out.println(new MinimumAbsoluteDifferenceInBST().minAbsoluteDifference(List.of(5, 3, 2, 10, 15), 1));
    }

    public int minAbsoluteDifference(List<Integer> nums, int x) {
        // if (x == 0) x = 1;
        TreeSet<Integer> xt = new TreeSet<>();
        int start = nums.size() - 1 - x;
        int j = nums.size() - 1;
        int zx = Integer.MAX_VALUE;
        for (int i = start; i >= 0; i--, j--) {
            int nowr = nums.get(j);
            xt.add(nowr);
            int now = nums.get(i);
            Integer xy = xt.floor(now);
            Integer dy = xt.ceiling(now);
            if (xy != null) {
                zx = Math.min(zx, Math.abs(xy - now));
            }
            if (dy != null) {
                zx = Math.min(zx, Math.abs(dy - now));
            }
        }
        return zx;
    }
}
