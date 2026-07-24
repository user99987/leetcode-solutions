package dynamicprogramming

import java.util.LinkedList
import kotlin.math.max

/**
 * Hard
 *
 * Return the maximum sum of a non-empty subsequence such that for every two consecutive
 * integers in the subsequence, the index gap is at most k.
 */
class ConstrainedSubsequenceSumK {

    fun constrainedSubsetSum(nums: IntArray, k: Int): Int {
        val n = nums.size
        var maxSum = Int.MIN_VALUE
        val deque = LinkedList<IntArray>()

        for (i in 0 until n) {
            if (deque.isNotEmpty() && i - deque.peekFirst()[0] > k) {
                deque.pollFirst()
            }
            val current = nums[i] + (if (deque.isEmpty()) 0 else max(0, deque.peekFirst()[1]))
            maxSum = max(maxSum, current)

            while (deque.isNotEmpty() && deque.peekLast()[1] <= current) {
                deque.pollLast()
            }
            deque.offerLast(intArrayOf(i, current))
        }
        return maxSum
    }
}

