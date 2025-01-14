package popular;

import java.util.HashSet;

/**
 * Medium
 * <p>
 * Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
 * <p>
 * You must write an algorithm that runs in O(n) time.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [100,4,200,1,3,2]
 * <p>
 * Output: 4
 * <p>
 * Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [0,3,7,2,5,8,4,6,0,1]
 * <p>
 * Output: 9
 * <p>
 * Constraints:
 * <p>
 * 0 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 */
public class LongestConsecutiveSequence {

    public static void main(String[] args) throws Exception {
        int[] nums = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.println(new LongestConsecutiveSequence().longestConsecutive(nums));
    }

    public int longestConsecutive(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num); // Add all numbers to HashSet
        }

        int maxLength = 0;
        for (int num : nums) {
            if (!numSet.contains(num - 1)) { // Check if num - 1 exists in numSet
                int currentNum = num;
                int currentLength = 1;

                while (numSet.contains(currentNum + 1)) { // Increment currentNum until it does not exist in numSet
                    currentNum++;
                    currentLength++;
                }

                maxLength = Math.max(maxLength, currentLength); // Update maximum length
            }
        }

        return maxLength; // Return the maximum length of the consecutive sequence
    }
}
