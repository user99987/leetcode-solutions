package dynamicprogramming;

/**
 * Hard
 * <p>
 * You are given several boxes with different colors represented by different positive numbers.
 * <p>
 * You may experience several rounds to remove boxes until there is no box left. Each time you can choose some continuous boxes with the same color (i.e., composed of k boxes, k >= 1), remove them and get k * k points.
 * <p>
 * Return the maximum points you can get.
 * <p>
 * Example 1:
 * <p>
 * Input: boxes = [1,3,2,2,2,3,4,3,1]
 * <p>
 * Output: 23
 * <p>
 * Explanation:
 * <p>
 * [1, 3, 2, 2, 2, 3, 4, 3, 1] ----> [1, 3, 3, 4, 3, 1]
 * (3\*3=9 points) ----> [1, 3, 3, 3, 1]
 * (1\*1=1 points) ----> [1, 1]
 * (3\*3=9 points) ----> []
 * (2\*2=4 points)
 * Example 2:
 * <p>
 * Input: boxes = [1,1,1]
 * <p>
 * Output: 9
 * <p>
 * Example 3:
 * <p>
 * Input: boxes = [1]
 * <p>
 * Output: 1
 * <p>
 * Constraints:
 * <p>
 * 1 <= boxes.length <= 100
 * 1 <= boxes[i] <= 100
 */
public class RemoveBoxes {

    private int[][][] dp;

    public int removeBoxes(int[] boxes) {
        int n = boxes.length;
        dp = new int[n][n][n + 1];
        return calculate(0, n - 1, 0, boxes);
    }

    private int calculate(int left, int right, int count, int[] boxes) {
        if (left > right) {
            return 0;
        }
        if (dp[left][right][count] != 0) {
            return dp[left][right][count];
        }

        while (left < right && boxes[left] == boxes[left + 1]) {
            left++;
            count++;
        }

        int maxPoints = (count + 1) * (count + 1) + calculate(left + 1, right, 0, boxes);

        for (int mid = left + 1; mid <= right; mid++) {
            if (boxes[left] == boxes[mid]) {
                maxPoints = Math.max(maxPoints,
                        calculate(left + 1, mid - 1, 0, boxes) + calculate(mid, right, count + 1, boxes));
            }
        }

        return dp[left][right][count] = maxPoints;
    }
}
