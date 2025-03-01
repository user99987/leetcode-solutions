package popular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Medium
 * <p>
 * Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.
 * <p>
 * Example 1:
 * <p>
 * Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
 * <p>
 * Output: [[1,6],[8,10],[15,18]]
 * <p>
 * Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].
 * <p>
 * Example 2:
 * <p>
 * Input: intervals = [[1,4],[4,5]]
 * <p>
 * Output: [[1,5]]
 * <p>
 * Explanation: Intervals [1,4] and [4,5] are considered overlapping.
 * <p>
 * Constraints:
 * <p>
 * 1 <= intervals.length <= 10^4
 * intervals[i].length == 2
 * 0 <= starti <= endi <= 10^4
 */
public class MergeIntervals {

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        return Arrays.stream(intervals)
                .collect(ArrayList<int[]>::new, (merged, interval) -> {
                    if (merged.isEmpty() || interval[0] > merged.get(merged.size() - 1)[1]) {
                        merged.add(interval);
                    } else {
                        merged.get(merged.size() - 1)[1] =
                                Math.max(merged.get(merged.size() - 1)[1], interval[1]);
                    }
                }, List::addAll)
                .toArray(int[][]::new);
    }
}
