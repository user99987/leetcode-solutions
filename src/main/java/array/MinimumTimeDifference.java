package array;

import java.util.Arrays;
import java.util.List;

/**
 * Medium
 * <p>
 * Given a list of 24-hour clock time points in "HH:MM" format, return the minimum minutes difference between any two time-points in the list.
 * <p>
 * Example 1:
 * <p>
 * Input: timePoints = ["23:59","00:00"]
 * <p>
 * Output: 1
 * <p>
 * Example 2:
 * <p>
 * Input: timePoints = ["00:00","23:59","00:00"]
 * <p>
 * Output: 0
 * <p>
 * Constraints:
 * <p>
 * 2 <= timePoints <= 2 * 10^4
 * timePoints[i] is in the format "HH:MM".
 */
public class MinimumTimeDifference {

    public int findMinDifference(List<String> timePoints) {
        int[] times = new int[timePoints.size()];
        for (int i = 0; i < timePoints.size(); i++) {
            String[] parts = timePoints.get(i).split(":");
            times[i] = Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
        }

        Arrays.sort(times);
        int minDiff = Integer.MAX_VALUE;

        for (int i = 1; i < times.length; i++) {
            minDiff = Math.min(minDiff, times[i] - times[i - 1]);
        }

        minDiff = Math.min(minDiff, 1440 + times[0] - times[times.length - 1]);
        return minDiff;
    }
}
