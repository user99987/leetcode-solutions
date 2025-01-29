package heap;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Hard
 * <p>
 * You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.
 * <p>
 * Return the max sliding window.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
 * <p>
 * Output: [3,3,5,5,6,7]
 * <p>
 * Explanation:
 * <p>
 * Window position        Max
 * ---------------       -----
 * [1 3 -1] -3 5 3 6 7     3
 * 1 [3 -1 -3] 5 3 6 7     3
 * 1 3 [-1 -3 5] 3 6 7     5
 * 1 3 -1 [-3 5 3] 6 7     5
 * 1 3 -1 -3 [5 3 6] 7     6
 * 1 3 -1 -3 5 [3 6 7]     7
 * Example 2:
 * <p>
 * Input: nums = [1], k = 1
 * <p>
 * Output: [1]
 * <p>
 * Example 3:
 * <p>
 * Input: nums = [1,-1], k = 1
 * <p>
 * Output: [1,-1]
 * <p>
 * Example 4:
 * <p>
 * Input: nums = [9,11], k = 2
 * <p>
 * Output: [11]
 * <p>
 * Example 5:
 * <p>
 * Input: nums = [4,-2], k = 2
 * <p>
 * Output: [4]
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 10^5
 * -104 <= nums[i] <= 10^4
 * 1 <= k <= nums.length
 */
public class SlidingWindowMaximum {

    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new LinkedList<>();

        for (int j = 0; j < n; j++) {
            while (!deque.isEmpty() && deque.peekFirst() < j - k + 1) {
                deque.pollFirst();
            }

            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[j]) {
                deque.pollLast();
            }

            deque.offerLast(j);

            if (j >= k - 1) {
                result[j - k + 1] = nums[deque.peekFirst()];
            }
        }

        return result;
    }
}
