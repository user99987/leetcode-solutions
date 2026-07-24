package heap

import java.util.LinkedList

/**
 * Hard
 *
 * Return the max sliding window as the window of size k moves from left to right, using a
 * monotonic deque.
 */
class SlidingWindowMaximumK {

    fun maxSlidingWindow(nums: IntArray, k: Int): IntArray {
        val n = nums.size
        val result = IntArray(n - k + 1)
        val deque = LinkedList<Int>()

        for (j in 0 until n) {
            while (deque.isNotEmpty() && deque.peekFirst() < j - k + 1) {
                deque.pollFirst()
            }

            while (deque.isNotEmpty() && nums[deque.peekLast()] < nums[j]) {
                deque.pollLast()
            }

            deque.offerLast(j)

            if (j >= k - 1) {
                result[j - k + 1] = nums[deque.peekFirst()]
            }
        }

        return result
    }
}

