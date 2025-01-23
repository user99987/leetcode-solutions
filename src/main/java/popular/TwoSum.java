package popular;

import java.util.HashMap;

/**
 * Easy
 * <p>
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * <p>
 * You can return the answer in any order.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [2,7,11,15], target = 9
 * <p>
 * Output: [0,1]
 * <p>
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [3,2,4], target = 6
 * <p>
 * Output: [1,2]
 * <p>
 * Example 3:
 * <p>
 * Input: nums = [3,3], target = 6
 * <p>
 * Output: [0,1]
 * <p>
 * Constraints:
 * <p>
 * 2 <= nums.length <= 10^4
 * -10^9 <= nums[i] <= 10^9
 * -10^9 <= target <= 10^9
 * Only one valid answer exists.
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        // Create a hashmap to store elements and their indices
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            // Check if the complement exists in the hashmap
            if (map.containsKey(complement)) {
                // Return the indices of the current element and the complement
                return new int[]{map.get(complement), i};
            }
            // Add the current element and its index to the hashmap
            map.put(nums[i], i);
        }
        // If no solution is found, return an empty array or null
        return new int[]{};
    }

}
