package popular;

/**
 * Medium
 * <p>
 * Given an integer array nums, find a contiguous non-empty subarray within the array that has the largest product, and return the product.
 * <p>
 * It is guaranteed that the answer will fit in a 32-bit integer.
 * <p>
 * A subarray is a contiguous subsequence of the array.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [2,3,-2,4]
 * <p>
 * Output: 6
 * <p>
 * Explanation: [2,3] has the largest product 6.
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [-2,0,-1]
 * <p>
 * Output: 0
 * <p>
 * Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 2 * 104
 * -10 <= nums[i] <= 10
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 */
public class MaximumProductSubarray {

    public int maxProduct(int[] nums) {
        int overAllMaxProd = Integer.MIN_VALUE;
        int n = nums.length;
        int start = 1;
        int end = 1;
        for (int i = 0; i < n; i++) {
            if (start == 0) {
                start = 1;
            }
            if (end == 0) {
                end = 1;
            }
            start = start * nums[i];
            end = end * nums[n - i - 1];
            overAllMaxProd = Math.max(overAllMaxProd, Math.max(start, end));
        }
        return overAllMaxProd;
    }
}
