package popular;

import java.util.HashSet;
import java.util.stream.IntStream;

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

    public int longestConsecutive(int[] nums) {
        var numSet = new HashSet<>();
        IntStream.of(nums).forEach(numSet::add);
        return IntStream.of(nums)
                .filter(num -> !numSet.contains(num - 1))
                .map(num -> {
                    int length = 1;
                    while (numSet.contains(num + 1)) {
                        num++;
                        length++;
                    }
                    return length;
                })
                .max()
                .orElse(0);
    }
}
