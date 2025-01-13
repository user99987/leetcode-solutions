package array;

/**
 * Easy
 * <p>
 * You are given an integer array nums where the largest integer is unique.
 * <p>
 * Determine whether the largest element in the array is at least twice as much as every other number in the array. If it is, return the index of the largest element, or return -1 otherwise.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [3,6,1,0]
 * <p>
 * Output: 1
 * <p>
 * Explanation: 6 is the largest integer. For every other number in the array x, 6 is at least twice as big as x. The index of value 6 is 1, so we return 1.
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [1,2,3,4]
 * <p>
 * Output: -1
 * <p>
 * Explanation: 4 is less than twice the value of 3, so we return -1.
 * <p>
 * Example 3:
 * <p>
 * Input: nums = [1]
 * <p>
 * Output: 0
 * <p>
 * Explanation: 1 is trivially at least twice the value as any other number because there are no other numbers.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 50
 * 0 <= nums[i] <= 100
 * The largest element in nums is unique.
 */
public class LargestNumberAtLeastTwice {


    public static void main(String[] args) throws Exception {
        System.out.println(new LargestNumberAtLeastTwice().dominantIndex(new int[]{1, 2, 3, 4}));
    }

    public int dominantIndex(int[] nums) {
        int index = 0, max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                index = i;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i == index) continue;
            if (((long) nums[i] * 2) > max) {
                return -1;
            }
        }
        return index;
    }
}
