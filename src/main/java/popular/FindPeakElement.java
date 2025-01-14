package popular;

/**
 * Medium
 * <p>
 * A peak element is an element that is strictly greater than its neighbors.
 * <p>
 * Given an integer array nums, find a peak element, and return its index. If the array contains multiple peaks, return the index to any of the peaks.
 * <p>
 * You may imagine that nums[-1] = nums[n] = -∞.
 * <p>
 * You must write an algorithm that runs in O(log n) time.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3,1]
 * <p>
 * Output: 2
 * <p>
 * Explanation: 3 is a peak element and your function should return the index number 2.
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [1,2,1,3,5,6,4]
 * <p>
 * Output: 5
 * <p>
 * Explanation: Your function can return either index number 1 where the peak element is 2, or index number 5 where the peak element is 6.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 1000
 * -2^31 <= nums[i] <= 2^31 - 1
 * nums[i] != nums[i + 1] for all valid i.
 */
public class FindPeakElement {
    public static void main(String[] args) throws Exception {
        int[] nums = {1, 2, 1, 3, 5, 6, 4};
        System.out.println(new FindPeakElement().findPeakElement(nums));
    }

    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start < end) {
            // This is done because start and end might be big numbers, so it might exceed the
            // integer limit.
            int mid = start + ((end - start) / 2);
            if (nums[mid + 1] > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
}
