package array;

/**
 * Easy
 * <p>
 * Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [3,2,1]
 * <p>
 * Output: 1
 * <p>
 * Explanation: The first distinct maximum is 3. The second distinct maximum is 2. The third distinct maximum is 1.
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [1,2]
 * <p>
 * Output: 2
 * <p>
 * Explanation: The first distinct maximum is 2. The second distinct maximum is 1. The third distinct maximum does not exist, so the maximum (2) is returned instead.
 * <p>
 * Example 3:
 * <p>
 * Input: nums = [2,2,3,1]
 * <p>
 * Output: 1
 * <p>
 * Explanation: The first distinct maximum is 3. The second distinct maximum is 2 (both 2's are counted together since they have the same value). The third distinct maximum is 1.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 10^4
 * -2^31 <= nums[i] <= 2^31 - 1
 */
public class ThirdMaximumNumber {

    public int thirdMax(int[] nums) {
        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;
        for (int i : nums) {
            max1 = Math.max(max1, i);
        }
        for (int i : nums) {
            if (i == max1) {
                continue;
            }
            max2 = Math.max(max2, i);
        }
        for (int i : nums) {
            if (i == max1 || i == max2) {
                continue;
            }
            max3 = Math.max(max3, i);
        }
        return (int) (max3 == Long.MIN_VALUE ? max1 : max3);
    }
}
