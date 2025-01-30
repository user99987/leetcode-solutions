package popular;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

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


    public int maxPoints(int[][] points) {
        return IntStream.range(0, points.length - 1)
                .map(i -> {
                    Map<Double, Integer> map = new HashMap<>();
                    return IntStream.range(i + 1, points.length)
                            .map(j -> map.merge(calculateSlope(points[i], points[j]), 1, Integer::sum))
                            .max().orElse(0);
                })
                .max().orElse(0) + 1;
    }

    private double calculateSlope(int[] p1, int[] p2) {
        double y = p2[1] - p1[1];
        double x = p2[0] - p1[0];
        return x == 0 ? Double.POSITIVE_INFINITY : y == 0 ? 0.0 : y / x;
    }
}
