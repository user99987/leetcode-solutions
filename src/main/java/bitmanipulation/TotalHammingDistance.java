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
 * 1 <= nums.length <= 10^4
 * 0 <= nums[i] <= 10^9
 * The answer for the given input will fit in a 32-bit integer.
 */
public class TotalHammingDistance {

    public int totalHammingDistance(int[] nums) {
        int total = 0, n = nums.length;
        for (int i = 0; i < 32; i++) {
            int countOnes = 0;
            for (int num : nums) {
                countOnes += (num >> i) & 1;
            }
            total += countOnes * (n - countOnes);
        }
        return total;
    }
}
