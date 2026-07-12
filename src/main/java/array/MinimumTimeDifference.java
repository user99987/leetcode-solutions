package array;

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
        if (timePoints.size() > 1440) {
            return 0;
        }

        var seen = new boolean[1440];
        for (String timePoint : timePoints) {
            int minutes = toMinutes(timePoint);
            if (seen[minutes]) {
                return 0;
            }
            seen[minutes] = true;
        }

        int first = -1;
        int prev = -1;
        int minDiff = Integer.MAX_VALUE;
        for (int minute = 0; minute < seen.length; minute++) {
            if (!seen[minute]) {
                continue;
            }
            if (first == -1) {
                first = minute;
            } else {
                minDiff = Math.min(minDiff, minute - prev);
            }
            prev = minute;
        }

        minDiff = Math.min(minDiff, 1440 - prev + first);
        return minDiff;
    }

    private int toMinutes(String timePoint) {
        return ((timePoint.charAt(0) - '0') * 10 + (timePoint.charAt(1) - '0')) * 60
                + (timePoint.charAt(3) - '0') * 10
                + (timePoint.charAt(4) - '0');
    }
}
