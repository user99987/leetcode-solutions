package popular;

import java.util.Arrays;

/**
 * Medium
 * <p>
 * Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
 * <p>
 * We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
 * <p>
 * You must solve this problem without using the library's sort function.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [2,0,2,1,1,0]
 * <p>
 * Output: [0,0,1,1,2,2]
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [2,0,1]
 * <p>
 * Output: [0,1,2]
 * <p>
 * Example 3:
 * <p>
 * Input: nums = [0]
 * <p>
 * Output: [0]
 * <p>
 * Example 4:
 * <p>
 * Input: nums = [1]
 * <p>
 * Output: [1]
 * <p>
 * Constraints:
 * <p>
 * n == nums.length
 * 1 <= n <= 300
 * nums[i] is 0, 1, or 2.
 */
public class SortColors {

    public void sortColors(int[] nums) {
        int[] count = new int[3];
        Arrays.stream(nums).forEach(num -> count[num]++);
        int index = 0;
        for (int i = 0; i < 3; i++) {
            Arrays.fill(nums, index, index + count[i], i);
            index += count[i];
        }
    }
}
