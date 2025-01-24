package array;

import java.util.Arrays;

/**
 * Medium
 * <p>
 * Given an integer array nums, return true if there exists a triple of indices (i, j, k) such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3,4,5]
 * <p>
 * Output: true
 * <p>
 * Explanation: Any triplet where i < j < k is valid.
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [5,4,3,2,1]
 * <p>
 * Output: false
 * <p>
 * Explanation: No triplet exists.
 * <p>
 * Example 3:
 * <p>
 * Input: nums = [2,1,5,0,4,6]
 * <p>
 * Output: true
 * <p>
 * Explanation: The triplet (3, 4, 5) is valid because nums[3] == 0 < nums[4] == 4 < nums[5] == 6.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 5 * 10^5
 * -2^31 <= nums[i] <= 2^31 - 1
 */
public class IncreasingTripletSubsequence {

    public boolean increasingTriplet(int[] nums) {
        int[] A = new int[3];
        Arrays.fill(A, Integer.MAX_VALUE);
        for (int num : nums) {
            if (num < A[0]) {
                A[0] = num;
            } else if (num < A[1] && num > A[0]) {
                A[1] = num;
            } else if (num < A[2] && num > A[1]) {
                return true;
            }
        }
        return false;
    }
}
