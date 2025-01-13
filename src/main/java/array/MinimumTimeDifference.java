package array;

import java.util.Arrays;
import java.util.List;

/**
 * Medium
 * <p>
 * Given a list of 24-hour clock time points in “HH:MM” format, return the minimum minutes difference between any two time-points in the list.
 * <p>
 * Example 1:
 * <p>
 * Input: timePoints = [“23:59”,”00:00”]
 * <p>
 * Output: 1
 * <p>
 * Example 2:
 * <p>
 * Input: timePoints = [“00:00”,”23:59”,”00:00”]
 * <p>
 * Output: 0
 * <p>
 * Constraints:
 * <p>
 * 2 <= timePoints <= 2 * 10^4
 * timePoints[i] is in the format “HH:MM”.
 */
public class MinimumTimeDifference {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("00:00", "23:59", "00:00");
        System.out.println(new MinimumTimeDifference().findMinDifference(list));
    }

    public int findMinDifference(List<String> timePoints) {
        List<Integer> timeInMinutes =
                timePoints
                        .stream()
                        .map(
                                t -> {
                                    String[] strings = t.split(":");
                                    return Integer.parseInt(strings[0]) * 60 + Integer.parseInt(strings[1]);
                                })
                        .sorted(Integer::compareTo)
                        .toList();
        int min = Integer.MAX_VALUE;
        for (int i = 1, l = timeInMinutes.size(); i < l; i++) {
            int prev = timeInMinutes.get(i - 1);
            int curr = timeInMinutes.get(i);
            min = Math.min(min, curr - prev);
            min = Math.min(min, ((24 * 60) - curr) + prev);
        }
        int prev = timeInMinutes.get(0);
        int curr = timeInMinutes.get(timeInMinutes.size() - 1);
        min = Math.min(min, curr - prev);
        min = Math.min(min, ((24 * 60) - curr) + prev);
        return min;
    }
}
