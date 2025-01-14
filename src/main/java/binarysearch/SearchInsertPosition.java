package binarysearch;

/**
 * Easy
 * <p>
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * <p>
 * You must write an algorithm with O(log n) runtime complexity.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,3,5,6], target = 5
 * <p>
 * Output: 2
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [1,3,5,6], target = 2
 * <p>
 * Output: 1
 * <p>
 * Example 3:
 * <p>
 * Input: nums = [1,3,5,6], target = 7
 * <p>
 * Output: 4
 * <p>
 * Example 4:
 * <p>
 * Input: nums = [1,3,5,6], target = 0
 * <p>
 * Output: 0
 * <p>
 * Example 5:
 * <p>
 * Input: nums = [1], target = 0
 * <p>
 * Output: 0
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 10^4
 * -10^4 <= nums[i] <= 10^4
 * nums contains distinct values sorted in ascending order.
 * -10^4 <= target <= 10^4
 */
public class SearchInsertPosition {

    public static void main(String[] args) throws Exception {
        int[] A = {1, 3, 5, 6};
        System.out.println(new SearchInsertPosition().searchInsert(A, 5));
    }

    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}
