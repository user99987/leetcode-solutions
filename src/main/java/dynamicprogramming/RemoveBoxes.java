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

    int[][][] dp;

    public static void main(String[] args) {
        int[] boxes = {3, 3, 3};
        System.out.println(new RemoveBoxes().removeBoxes(boxes));
    }

    public int removeBoxes(int[] boxes) {
        dp = new int[boxes.length][boxes.length][boxes.length + 1];
        return calculate(0, boxes.length - 1, 1, boxes);
    }

    int calculate(int l, int r, int n, int[] boxes) {
        if (l > r) return 0;
        else {
            if (dp[l][r][n] != 0) return dp[l][r][n];
            dp[l][r][n] = (n * n) + calculate(l + 1, r, 1, boxes);
            for (int i = l + 1; i <= r; i++) {
                int center = 0, next = 0;
                if (boxes[l] == boxes[i]) {
                    center = calculate(l + 1, i - 1, 1, boxes);
                    next = calculate(i, r, n + 1, boxes);
                }
                dp[l][r][n] = Math.max(dp[l][r][n], center + next);
            }
        }
        return dp[l][r][n];
    }
}
