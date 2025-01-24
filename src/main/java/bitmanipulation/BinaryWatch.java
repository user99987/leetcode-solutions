package bitmanipulation;

import java.util.ArrayList;
import java.util.List;

/**
 * Easy
 * <p>
 * A binary watch has 4 LEDs on the top which represent the hours (0-11), and the 6 LEDs on the bottom represent the minutes (0-59). Each LED represents a zero or one, with the least significant bit on the right.
 * <p>
 * For example, the below binary watch reads "4:51".
 * <p>
 * Given an integer turnedOn which represents the number of LEDs that are currently on, return all possible times the watch could represent. You may return the answer in any order.
 * <p>
 * The hour must not contain a leading zero.
 * <p>
 * For example, "01:00" is not valid. It should be "1:00".
 * The minute must be consist of two digits and may contain a leading zero.
 * <p>
 * For example, "10:2" is not valid. It should be "10:02".
 * Example 1:
 * <p>
 * Input: turnedOn = 1
 * <p>
 * Output: [“0:01”,”0:02”,”0:04”,”0:08”,”0:16”,”0:32”,”1:00”,”2:00”,”4:00”,”8:00”]
 * <p>
 * Example 2:
 * <p>
 * Input: turnedOn = 9
 * <p>
 * Output: []
 * <p>
 * Constraints:
 * <p>
 * 0 <= turnedOn <= 10
 */
public class BinaryWatch {

    public List<String> readBinaryWatch(int num) {
        int H = 11, M = 59;
        List<String> result = new ArrayList<>();
        if (num == 0) {
            result.add("0:00");
            return result;
        }
        for (int i = 0; i <= H; i++) {
            for (int j = 0; j <= M; j++) {
                int count = 0;
                for (int k = 0; k < 4; k++) {
                    if (((1 << k) & i) > 0) {
                        count++;
                    }
                }
                for (int k = 0; k < 6; k++) {
                    if (((1 << k) & j) > 0) {
                        count++;
                    }
                }
                if (count == num) {
                    result.add(i + ":" + ((String.valueOf(j).length() == 1) ? ("0" + j) : j));
                }
            }
        }
        return result;
    }
}
