package dynamicprogramming;

/**
 * Hard
 * <p>
 * Given an array nums which consists of non-negative integers and an integer m, you can split the array into m non-empty continuous subarrays.
 * <p>
 * Write an algorithm to minimize the largest sum among these m subarrays.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [7,2,5,10,8], m = 2
 * <p>
 * Output: 18
 * <p>
 * Explanation:
 * <p>
 * There are four ways to split nums into two subarrays.
 * The best way is to split it into [7,2,5] and [10,8],
 * where the largest sum among the two subarrays is only 18.
 * Example 2:
 * <p>
 * Input: nums = [1,2,3,4,5], m = 2
 * <p>
 * Output: 9
 * <p>
 * Example 3:
 * <p>
 * Input: nums = [1,4,4], m = 3
 * <p>
 * Output: 4
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 1000
 * 0 <= nums[i] <= 10^6
 * 1 <= m <= min(50, nums.length)
 */
public class SplitArrayLargestSum {

    public int splitArray(int[] nums, int m) {
        int left = 0, right = 0;
        for (int num : nums) {
            left = Math.max(left, num);
            right += num;
        }

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canSplit(nums, m, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    private boolean canSplit(int[] nums, int m, int maxSum) {
        int count = 1, sum = 0;
        for (int num : nums) {
            if (sum + num > maxSum) {
                count++;
                sum = num;
                if (count > m) {
                    return false;
                }
            } else {
                sum += num;
            }
        }
        return true;
    }
}
