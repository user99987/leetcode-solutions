package heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

/**
 * Hard
 * <p>
 * A city’s skyline is the outer contour of the silhouette formed by all the buildings in that city when viewed from a distance. Given the locations and heights of all the buildings, return the skyline formed by these buildings collectively.
 * <p>
 * The geometric information of each building is given in the array buildings where buildings[i] = [lefti, righti, heighti]:
 * <p>
 * lefti is the x coordinate of the left edge of the ith building.
 * righti is the x coordinate of the right edge of the ith building.
 * heighti is the height of the ith building.
 * You may assume all buildings are perfect rectangles grounded on an absolutely flat surface at height 0.
 * <p>
 * The skyline should be represented as a list of “key points” sorted by their x-coordinate in the form [[x1,y1],[x2,y2],...]. Each key point is the left endpoint of some horizontal segment in the skyline except the last point in the list, which always has a y-coordinate 0 and is used to mark the skyline’s termination where the rightmost building ends. Any ground between the leftmost and rightmost buildings should be part of the skyline’s contour.
 * <p>
 * Note: There must be no consecutive horizontal lines of equal height in the output skyline. For instance, [...,[2 3],[4 5],[7 5],[11 5],[12 7],...] is not acceptable; the three lines of height 5 should be merged into one in the final output as such: [...,[2 3],[4 5],[12 7],...]
 * <p>
 * Example 1:
 * <p>
 * <p>
 * <p>
 * Input: buildings = [[2,9,10],[3,7,15],[5,12,12],[15,20,10],[19,24,8]]
 * <p>
 * Output: [[2,10],[3,15],[7,12],[12,0],[15,10],[20,8],[24,0]]
 * <p>
 * Explanation:
 * <p>
 * Figure A shows the buildings of the input.
 * Figure B shows the skyline formed by those buildings.
 * The red points in figure B represent the key points in the output list.
 * Example 2:
 * <p>
 * Input: buildings = [[0,2,3],[2,5,3]]
 * <p>
 * Output: [[0,3],[5,0]]
 * <p>
 * Constraints:
 * <p>
 * 1 <= buildings.length <= 10^4
 * 0 <= lefti < righti <= 2^31 - 1
 * 1 <= heighti <= 2^31 - 1
 * buildings is sorted by lefti in non-decreasing order.
 * Solution
 */
public class TheSkylineProblem {

    public static void main(String[] args) throws Exception {
        int[][] A = {
                {2, 9, 10}, {3, 7, 15}, {5, 12, 12}, {15, 20, 10}, {19, 24, 8}
        };
        List<List<Integer>> result = new TheSkylineProblem().getSkyline(A);
        result.forEach(
                x -> System.out.println(x.get(0) + " " + x.get(1)));
    }

    public List<List<Integer>> getSkyline(int[][] buildings) {
        List<List<Integer>> list = new ArrayList<>();
        List<int[]> lines = new ArrayList<>();
        for (int[] building : buildings) {
            lines.add(new int[]{building[0], building[2]});
            lines.add(new int[]{building[1], -building[2]});
        }
        lines.sort((a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);
        TreeMap<Integer, Integer> map = new TreeMap<>();
        map.put(0, 1);
        int prev = 0;
        for (int[] line : lines) {
            if (line[1] > 0) {
                map.put(line[1], map.getOrDefault(line[1], 0) + 1);
            } else {
                int f = map.get(-line[1]);
                if (f == 1) {
                    map.remove(-line[1]);
                } else {
                    map.put(-line[1], f - 1);
                }
            }
            int curr = map.lastKey();
            if (curr != prev) {
                list.add(Arrays.asList(line[0], curr));
                prev = curr;
            }
        }
        return list;
    }
}
