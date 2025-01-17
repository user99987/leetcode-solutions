package twopointers;

/**
 * Easy
 * <p>
 * Given an integer array nums, move all 0’s to the end of it while maintaining the relative order of the non-zero elements.
 * <p>
 * Note that you must do this in-place without making a copy of the array.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [0,1,0,3,12]
 * <p>
 * Output: [1,3,12,0,0]
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [0]
 * <p>
 * Output: [0]
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 10^4
 * -2^31 <= nums[i] <= 2^31 - 1
 */
public class MoveZeroes {

    public static void main(String[] args) throws Exception {
        int[] nums = {0, 1, 0, 3, 12};
        new MoveZeroes().moveZeroes(nums);
        for (int n : nums) System.out.println(n);
    }

    public void moveZeroes(int[] nums) {
        int i = 0;
        for (int j = 0, l = nums.length; j < l; ) {
            if (nums[j] == 0) j++;
            else {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j++;
            }
        }
        while (i < nums.length) nums[i++] = 0;
    }
}
