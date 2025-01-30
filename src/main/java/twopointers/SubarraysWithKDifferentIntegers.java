package twopointers;

import java.util.HashMap;
import java.util.Map;

/**
 * Hard
 * <p>
 * Given an integer array nums and an integer k, return the number of good subarrays of nums.
 * <p>
 * A good array is an array where the number of different integers in that array is exactly k.
 * <p>
 * For example, [1,2,3,1,2] has 3 different integers: 1, 2, and 3.
 * A subarray is a contiguous part of an array.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,1,2,3], k = 2
 * <p>
 * Output: 7
 * <p>
 * Explanation: Subarrays formed with exactly 2 different integers: [1,2], [2,1], [1,2], [2,3], [1,2,1], [2,1,2], [1,2,1,2]
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [1,2,1,3,4], k = 3
 * <p>
 * Output: 3
 * <p>
 * Explanation: Subarrays formed with exactly 3 different integers: [1,2,1,3], [2,1,3], [1,3,4].
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 2 * 10^4
 * 1 <= nums[i], k <= nums.length
 */
public class SubarraysWithKDifferentIntegers {

    public int subarraysWithKDistinct(int[] nums, int k) {
        return atMostKDistinct(nums, k) - atMostKDistinct(nums, k - 1);
    }

    private int atMostKDistinct(int[] nums, int k) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int left = 0, count = 0;

        for (int right = 0; right < nums.length; right++) {
            countMap.merge(nums[right], 1, Integer::sum);
            while (countMap.size() > k) {
                countMap.compute(nums[left], (key, val) -> val == 1 ? null : val - 1);
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }
}
