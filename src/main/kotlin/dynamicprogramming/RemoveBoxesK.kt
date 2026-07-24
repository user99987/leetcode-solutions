package dynamicprogramming

/**
 * Hard
 *
 * You are given several boxes with different colors represented by different positive numbers.
 *
 * You may experience several rounds to remove boxes until there is no box left. Each time you can choose some continuous boxes with the same color (i.e., composed of k boxes, k >= 1), remove them and get k * k points.
 *
 * Return the maximum points you can get.
 *
 * Example 1:
 *
 * Input: boxes = [1,3,2,2,2,3,4,3,1]
 *
 * Output: 23
 *
 * Explanation:
 *
 * [1, 3, 2, 2, 2, 3, 4, 3, 1] ----> [1, 3, 3, 4, 3, 1]
 * (3\*3=9 points) ----> [1, 3, 3, 3, 1]
 * (1\*1=1 points) ----> [1, 1]
 * (3\*3=9 points) ----> []
 * (2\*2=4 points)
 * Example 2:
 *
 * Input: boxes = [1,1,1]
 *
 * Output: 9
 *
 * Example 3:
 *
 * Input: boxes = [1]
 *
 * Output: 1
 *
 * Constraints:
 *
 * 1 <= boxes.length <= 100
 * 1 <= boxes[i] <= 100
 */
class RemoveBoxesK {

    private lateinit var dp: Array<Array<IntArray>>

    fun removeBoxes(boxes: IntArray): Int {
        val n = boxes.size
        dp = Array(n) { Array(n) { IntArray(n + 1) } }
        return calculate(0, n - 1, 0, boxes)
    }

    private fun calculate(leftStart: Int, right: Int, countStart: Int, boxes: IntArray): Int {
        var left = leftStart
        var count = countStart
        if (left > right) {
            return 0
        }
        if (dp[left][right][count] != 0) {
            return dp[left][right][count]
        }

        while (left < right && boxes[left] == boxes[left + 1]) {
            left++
            count++
        }

        var maxPoints = (count + 1) * (count + 1) + calculate(left + 1, right, 0, boxes)

        for (mid in left + 1..right) {
            if (boxes[left] == boxes[mid]) {
                maxPoints = maxOf(
                    maxPoints,
                    calculate(left + 1, mid - 1, 0, boxes) + calculate(mid, right, count + 1, boxes)
                )
            }
        }

        dp[left][right][count] = maxPoints
        return maxPoints
    }
}

