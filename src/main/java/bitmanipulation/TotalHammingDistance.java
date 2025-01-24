package bitmanipulation;

/**
 * Medium
 * <p>
 * The Hamming distance between two integers is the number of positions at which the corresponding bits are different.
 * <p>
 * Given an integer array nums, return the sum of Hamming distances between all the pairs of the integers in nums.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [4,14,2]
 * <p>
 * Output: 6
 * <p>
 * Explanation: In binary representation, the 4 is 0100, 14 is 1110, and 2 is 0010 (just showing the four bits relevant in this case). The answer will be: HammingDistance(4, 14) + HammingDistance(4, 2) + HammingDistance(14, 2) = 2 + 2 + 2 = 6.
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [4,14,4]
 * <p>
 * Output: 4
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 104
 * 0 <= nums[i] <= 109
 * The answer for the given input will fit in a 32-bit integer.
 */
public class TotalHammingDistance {

    public int totalHammingDistance(int[] nums) {
        int sum = 0;
        for (int i = 0; i < 32; i++) {
            int numOfOnes = 0;
            int p = (1 << i);
            for (int num : nums) {
                if ((num & p) > 0) {
                    numOfOnes++;
                }
            }
            sum += ((nums.length - numOfOnes) * numOfOnes);
        }
        return sum;
    }
}
