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
    public static void main(String[] args) {
        int[] A = {3, 3, 7, 7, 10, 11, 11};
        System.out.println(new SingleElementInASortedArray().singleNonDuplicate(A));
    }

    public int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid + 1 < nums.length
                    && nums[mid] != nums[mid + 1]
                    && mid - 1 >= 0
                    && nums[mid] != nums[mid - 1]) {
                return nums[mid];
            } else if (mid + 1 < nums.length && nums[mid] == nums[mid + 1] && mid % 2 == 0) {
                start = mid + 1;
            } else if (mid - 1 >= 0 && nums[mid] == nums[mid - 1] && mid % 2 == 1) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return nums[start];
    }
}
