package popular;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Hard
 * <p>
 * Given an array of integers heights representing the histogram's bar height where the width of each bar is 1, return the area of the largest rectangle in the histogram.
 * <p>
 * Example 1:
 * <p>
 * Input: heights = [2,1,5,6,2,3]
 * <p>
 * Output: 10
 * <p>
 * Explanation: The above is a histogram where width of each bar is 1. The largest rectangle is shown in the red area, which has an area = 10 units.
 * <p>
 * Example 2:
 * <p>
 * Input: heights = [2,4]
 * <p>
 * Output: 4
 * <p>
 * Constraints:
 * <p>
 * 1 <= heights.length <= 105
 * 0 <= heights[i] <= 104
 */
public class LargestRectangleInHistogram {

    public int largestRectangleArea(int[] heights) {
        Deque<Integer> deque = new LinkedList<>();
        int maxArea = 0;
        deque.push(-1);
        for (int i = 0; i < heights.length; i++) {
            while (deque.peek() != -1 && heights[deque.peek()] >= heights[i]) {
                maxArea = Math.max(maxArea, heights[deque.pop()] * (i - deque.peek() - 1));
            }
            deque.push(i);
        }
        while (deque.peek() != -1) {
            maxArea = Math.max(maxArea, heights[deque.pop()] * (heights.length - deque.peek() - 1));
        }
        return maxArea;
    }
}
