package popular

import java.util.LinkedList

/**
 * Hard
 * Largest Rectangle in Histogram
 */
class LargestRectangleInHistogramK {

    fun largestRectangleArea(heights: IntArray): Int {
        val deque = LinkedList<Int>()
        var maxArea = 0
        deque.push(-1)
        for (i in heights.indices) {
            while (deque.peek() != -1 && heights[deque.peek()] >= heights[i]) {
                maxArea = maxOf(maxArea, heights[deque.pop()] * (i - deque.peek() - 1))
            }
            deque.push(i)
        }
        while (deque.peek() != -1) {
            maxArea = maxOf(maxArea, heights[deque.pop()] * (heights.size - deque.peek() - 1))
        }
        return maxArea
    }
}

