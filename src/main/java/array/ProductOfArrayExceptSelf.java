package array;

/**
 * Medium
 * <p>
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
 * <p>
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 * <p>
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3,4]
 * <p>
 * Output: [24,12,8,6]
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [-1,1,0,-3,3]
 * <p>
 * Output: [0,0,9,0,0]
 * <p>
 * Constraints:
 * <p>
 * 2 <= nums.length <= 105
 * -30 <= nums[i] <= 30
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 */
public class ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0, temp = 1, l = nums.length; i < l; i++) {
            result[i] = temp;
            temp *= nums[i];
        }
        for (int i = nums.length - 1, temp = 1; i >= 0; i--) {
            result[i] = result[i] * temp;
            temp *= nums[i];
        }
        return result;
    }
}
