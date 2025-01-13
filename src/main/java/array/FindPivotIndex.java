package array;

/**
 * Easy
 * <p>
 * Given an array of integers nums, calculate the pivot index of this array.
 * <p>
 * The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index’s right.
 * <p>
 * If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
 * <p>
 * Return the leftmost pivot index. If no such index exists, return -1.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,7,3,6,5,6]
 * <p>
 * Output: 3
 * <p>
 * Explanation:
 * <p>
 * The pivot index is 3.
 * <p>
 * Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
 * <p>
 * Right sum = nums[4] + nums[5] = 5 + 6 = 11
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [1,2,3]
 * <p>
 * Output: -1
 * <p>
 * Explanation:
 * <p>
 * There is no index that satisfies the conditions in the problem statement.
 * <p>
 * Example 3:
 * <p>
 * Input: nums = [2,1,-1]
 * <p>
 * Output: 0
 * <p>
 * Explanation:
 * <p>
 * The pivot index is 0.
 * <p>
 * Left sum = 0 (no elements to the left of index 0)
 * <p>
 * Right sum = nums[1] + nums[2] = 1 + -1 = 0
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 10^4
 * -1000 <= nums[i] <= 1000
 */
public class FindPivotIndex {
    public static void main(String[] args) {
    }

    public int pivotIndex(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int[] sums = new int[nums.length];
        sums[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sums[i] = sums[i - 1] + nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            int temp = sums[nums.length - 1] - sums[i];
            if (i == 0 && 0 == temp || (i > 0 && sums[i - 1] == temp)) {
                return i;
            }
        }
        return -1;
    }
}
