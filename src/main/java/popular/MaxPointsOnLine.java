package popular;

import java.util.HashMap;
import java.util.Map;

/**
 * Hard
 * <p>
 * Given an array of points where points[i] = [xi, yi] represents a point on the X-Y plane, return the maximum number of points that lie on the same straight line.
 * <p>
 * Example 1:
 * <p>
 * Input: points = [[1,1],[2,2],[3,3]]
 * <p>
 * Output: 3
 * <p>
 * Example 2:
 * <p>
 * Input: points = [[1,1],[3,2],[5,3],[4,1],[2,3],[1,4]]
 * <p>
 * Output: 4
 * <p>
 * Constraints:
 * <p>
 * 1 <= points.length <= 300
 * points[i].length == 2
 * -10^4 <= xi, yi <= 10^4
 * All the points are unique.
 */
public class MaxPointsOnLine {

    public static void main(String[] args) throws Exception {
        System.out.println(new MaxPointsOnLine().maxPoints(new int[][]{{1, 1}, {3, 2}, {5, 3}, {4, 1}, {2, 3}, {1, 4}}));
    }

    public int maxPoints(int[][] points) {
        int max = 0;
        for (int i = 0; i < points.length - 1; i++) {
            Map<Double, Integer> map = new HashMap<>();
            for (int j = i + 1; j < points.length; j++) {
                double slope = calculateSlope(points[i], points[j]);
                map.put(slope, map.getOrDefault(slope, 0) + 1);
                max = Math.max(max, map.get(slope));
            }
        }
        return max + 1;
    }

    private double calculateSlope(int[] p1, int[] p2) {
        double y = (p2[1] - p1[1]) * 1.0;
        double x = (p2[0] - p1[0]) * 1.0;
        if (x == 0) {
            return Double.NaN;
        }
        if (y == 0) {
            return 0.0;
        }
        return ((double) y * 1.0) / x;
    }
}
