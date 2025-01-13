package popular;

import java.util.HashMap;
import java.util.Map;

/**
 * Easy
 * <p>
 * Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3,1], k = 3
 * <p>
 * Output: true
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [1,0,1,1], k = 1
 * <p>
 * Output: true
 * <p>
 * Example 3:
 * <p>
 * Input: nums = [1,2,3,1,2,3], k = 2
 * <p>
 * Output: false
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 10^5
 * -10^9 <= nums[i] <= 10^9
 * 0 <= k <= 10^5
 */
public class ContainsDuplicateII {

    public static void main(String[] args) {
        System.out.println(new ContainsDuplicateII().containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3));
    }

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && Math.abs(map.get(nums[i]) - i) <= k) {
                return true;
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
