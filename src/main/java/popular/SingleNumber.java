package popular;

/**
 * Easy
 * <p>
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * <p>
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [2,2,1]
 * <p>
 * Output: 1
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [4,1,2,1,2]
 * <p>
 * Output: 4
 * <p>
 * Example 3:
 * <p>
 * Input: nums = [1]
 * <p>
 * Output: 1
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 3 * 10^4
 * -3 * 10^4 <= nums[i] <= 3 * 10^4
 * Each element in the array appears twice except for one element which appears only once.
 */
public class SingleNumber {

    public static void main(String[] args) throws Exception {
        System.out.println(new SingleNumber().singleNumber(new int[]{4, 1, 2, 1, 2}));
    }

    public int singleNumber(int[] nums) {
        int singleNumber = 0; // Initialize variable to store result

        // Perform bitwise XOR operation on all elements in the array
        for (int num : nums) {
            singleNumber ^= num;
        }

        return singleNumber; // Return the single number
    }
}
