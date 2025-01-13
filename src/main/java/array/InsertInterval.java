package array;

import java.util.Arrays;

/**
 * Medium
 * <p>
 * You are given an array of non-overlapping intervals where intervals[i] = [starti, endi] represent the start and the end of the ith interval and intervals is sorted in ascending order by starti. You are also given an interval newInterval = [start, end] that represents the start and end of another interval.
 * <p>
 * Insert newInterval into intervals such that intervals is still sorted in ascending order by starti and intervals still does not have any overlapping intervals (merge overlapping intervals if necessary).
 * <p>
 * Return intervals after the insertion.
 * <p>
 * Example 1:
 * <p>
 * Input: intervals = [[1,3],[6,9]], newInterval = [2,5]
 * <p>
 * Output: [[1,5],[6,9]]
 * <p>
 * Example 2:
 * <p>
 * Input: intervals = [[1,2],[3,5],[6,7],[8,10],[12,16]], newInterval = [4,8]
 * <p>
 * Output: [[1,2],[3,10],[12,16]]
 * <p>
 * Explanation: Because the new interval [4,8] overlaps with [3,5],[6,7],[8,10].
 * <p>
 * Example 3:
 * <p>
 * Input: intervals = [], newInterval = [5,7]
 * <p>
 * Output: [[5,7]]
 * <p>
 * Example 4:
 * <p>
 * Input: intervals = [[1,5]], newInterval = [2,3]
 * <p>
 * Output: [[1,5]]
 * <p>
 * Example 5:
 * <p>
 * Input: intervals = [[1,5]], newInterval = [2,7]
 * <p>
 * Output: [[1,7]]
 * <p>
 * Constraints:
 * <p>
 * 0 <= intervals.length <= 10^4
 * intervals[i].length == 2
 * 0 <= starti <= endi <= 10^5
 * intervals is sorted by starti in ascending order.
 * newInterval.length == 2
 * 0 <= start <= end <= 10^5
 */
public class InsertInterval {


    public static void main(String[] args) throws Exception {
        int[][] intervals = {
                {1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}
        };
        intervals = new InsertInterval().insert(intervals, new int[]{4, 8});
        for (int[] interval : intervals) {
            System.out.println(Arrays.toString(interval));
        }
    }

    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n = intervals.length;
        int l = 0;
        int r = n - 1;
        while (l < n && newInterval[0] > intervals[l][1]) {
            l++;
        }
        while (r >= 0 && newInterval[1] < intervals[r][0]) {
            r--;
        }
        int[][] res = new int[l + n - r][2];
        for (int i = 0; i < l; i++) {
            res[i] = Arrays.copyOf(intervals[i], intervals[i].length);
        }
        res[l][0] = Math.min(newInterval[0], l == n ? newInterval[0] : intervals[l][0]);
        res[l][1] = Math.max(newInterval[1], r == -1 ? newInterval[1] : intervals[r][1]);
        for (int i = l + 1, j = r + 1; j < n; i++, j++) {
            res[i] = intervals[j];
        }
        return res;
    }

}
