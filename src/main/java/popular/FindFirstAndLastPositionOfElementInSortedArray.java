package popular;

import java.util.Arrays;

/**
 * Medium
 * <p>
 * Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
 * <p>
 * If target is not found in the array, return [-1, -1].
 * <p>
 * You must write an algorithm with O(log n) runtime complexity.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [5,7,7,8,8,10], target = 8
 * <p>
 * Output: [3,4]
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [5,7,7,8,8,10], target = 6
 * <p>
 * Output: [-1,-1]
 * <p>
 * Example 3:
 * <p>
 * Input: nums = [], target = 0
 * <p>
 * Output: [-1,-1]
 * <p>
 * Constraints:
 * <p>
 * 0 <= nums.length <= 10^5
 * -10^9 <= nums[i] <= 10^9
 * nums is a non-decreasing array.
 * -10^9 <= target <= 10^9
 */
public class FindFirstAndLastPositionOfElementInSortedArray {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(new FindFirstAndLastPositionOfElementInSortedArray().searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)));
    }

    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int firstOccurrence = -1;
        int lastOccurrence = -1;

        // Find first occurrence
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                firstOccurrence = mid;
                right = mid - 1;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        // Find last occurrence
        left = 0;
        right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                lastOccurrence = mid;
                left = mid + 1;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return new int[]{firstOccurrence, lastOccurrence};
    }
}
