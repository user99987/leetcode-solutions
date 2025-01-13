package array;

import java.util.Arrays;

/**
 * Easy
 * <p>
 * Given an integer array nums of 2n integers, group these integers into n pairs (a1, b1), (a2, b2), ...,
 * (an, bn) such that the sum of min(ai, bi) for all i is maximized. Return the maximized sum.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,4,3,2]
 * <p>
 * Output: 4
 * <p>
 * Explanation: All possible pairings (ignoring the ordering of elements) are: 1. (1, 4), (2, 3) -> min(1, 4) + min(2, 3) = 1 + 2 = 3 2. (1, 3), (2, 4) -> min(1, 3) + min(2, 4) = 1 + 2 = 3 3. (1, 2), (3, 4) -> min(1, 2) + min(3, 4) = 1 + 3 = 4 So the maximum possible sum is 4.
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [6,2,6,5,1,2]
 * <p>
 * Output: 9
 * <p>
 * Explanation: The optimal pairing is (2, 1), (2, 5), (6, 6). min(2, 1) + min(2, 5) + min(6, 6) = 1 + 2 + 6 = 9.
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 104
 * nums.length == 2 * n
 * -104 <= nums[i] <= 104
 */
public class ArrayPartition {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4};
        System.out.println(new ArrayPartition().arrayPairSum(A));
    }

    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length - 1; i = i + 2) {
            sum += Math.min(nums[i], nums[i + 1]);
        }
        return sum;
    }
}
