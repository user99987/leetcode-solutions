package array;

/**
 * Medium
 * <p>
 * Given an integer array nums and two integers left and right, return the number of contiguous non-empty subarrays such that the value of the maximum array element in that subarray is in the range [left, right].
 * <p>
 * The test cases are generated so that the answer will fit in a 32-bit integer.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [2,1,4,3], left = 2, right = 3
 * <p>
 * Output: 3
 * <p>
 * Explanation: There are three subarrays that meet the requirements: [2], [2, 1], [3].
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [2,9,2,5,6], left = 2, right = 8
 * <p>
 * Output: 7
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 10^5
 * 0 <= nums[i] <= 10^9
 * 0 <= left <= right <= 10^9
 */
public class SubArraysWithBoundedMaximum {

    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int count = 0, tempCount = 0, start = 0;

        for (int end = 0; end < nums.length; end++) {
            if (nums[end] > right) {
                tempCount = 0;
                start = end + 1;
            } else if (nums[end] >= left) {
                tempCount = end - start + 1;
                count += tempCount;
            } else {
                count += tempCount;
            }
        }

        return count;
    }
}
