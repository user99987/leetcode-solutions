package array;

/**
 * Medium
 * <p>
 * Given an array arr of 4 digits, find the latest 24-hour time that can be made using each digit exactly once.
 * <p>
 * 24-hour times are formatted as "HH:MM", where HH is between 00 and 23, and MM is between 00 and 59. The earliest 24-hour time is 00:00, and the latest is 23:59.
 * <p>
 * Return the latest 24-hour time in "HH:MM" format. If no valid time can be made, return an empty string.
 * <p>
 * Example 1:
 * <p>
 * Input: arr = [1,2,3,4]
 * <p>
 * Output: "23:41"
 * <p>
 * Explanation: The valid 24-hour times are "12:34", "12:43", "13:24", "13:42", "14:23", "14:32", "21:34", "21:43", "23:14", and "23:41". Of these times, "23:41" is the latest.
 * <p>
 * Example 2:
 * <p>
 * Input: arr = [5,5,5,5]
 * <p>
 * Output: ""
 * <p>
 * Explanation: There are no valid 24-hour times as "55:55" is not valid.
 * <p>
 * Constraints:
 * <p>
 * arr.length == 4
 * 0 <= arr[i] <= 9
 */
public class LargestTimeForGivenDigits {

    public String largestTimeFromDigits(int[] digits) {
        int maxTime = -1;
        String result = "";

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (j == i) continue;
                for (int k = 0; k < 4; k++) {
                    if (k == i || k == j) continue;
                    for (int l = 0; l < 4; l++) {
                        if (l == i || l == j || l == k) continue;

                        int hours = digits[i] * 10 + digits[j];
                        int minutes = digits[k] * 10 + digits[l];
                        int total = hours * 60 + minutes;

                        if (hours < 24 && minutes < 60 && total > maxTime) {
                            maxTime = total;
                            result = String.format("%02d:%02d", hours, minutes);
                        }
                    }
                }
            }
        }

        return maxTime == -1 ? "" : result;
    }
}
