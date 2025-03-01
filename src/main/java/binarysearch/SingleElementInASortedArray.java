package binarysearch;

/**
 * Medium
 * <p>
 * You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.
 * <p>
 * Return the single element that appears only once.
 * <p>
 * Your solution must run in O(log n) time and O(1) space.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,1,2,3,3,4,4,8,8]
 * <p>
 * Output: 2
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [3,3,7,7,10,11,11]
 * <p>
 * Output: 10
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 10^5
 * 0 <= nums[i] <= 10^5
 */
public class SingleElementInASortedArray {

    public int singleNonDuplicate(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (mid % 2 == 1) mid--; // Ensure mid is even
            if (nums[mid] == nums[mid + 1]) {
                left = mid + 2;
            } else {
                right = mid;
            }
        }
        return nums[left];
    }
}
