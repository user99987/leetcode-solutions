package array;

import java.util.HashMap;
import java.util.Map;

/**
 * Medium
 * <p>
 * Given an array of integers nums and an integer k, return the total number of continuous subarrays whose sum equals to k.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,1,1], k = 2
 * <p>
 * Output: 2
 * <p>
 * Example 2:
 * <p>
 * Input: nums = [1,2,3], k = 3
 * <p>
 * Output: 2
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 2 * 10^4
 * -1000 <= nums[i] <= 1000
 * -10^7 <= k <= 10^7
 */
public class SubarraySumEqualsK {

    public static void main(String[] args) throws Exception {
        int[] A = {1, 2, 3};
        System.out.println(new SubarraySumEqualsK().subarraySum(A, 3));
    }

    public int subarraySum(int[] nums, int k) {
        int tempSum = 0;
        int ret = 0;
        Map<Integer, Integer> sumCount = new HashMap<>();
        sumCount.put(0, 1);
        for (int i : nums) {
            tempSum += i;
            if (sumCount.containsKey(tempSum - k)) {
                ret += sumCount.get(tempSum - k);
            }
            if (sumCount.get(tempSum) != null) {
                sumCount.put(tempSum, sumCount.get(tempSum) + 1);
            } else {
                sumCount.put(tempSum, 1);
            }
        }
        return ret;
    }
}
