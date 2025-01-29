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
 * Output: ["0:01","0:02","0:04","0:08","0:16","0:32","1:00","2:00","4:00","8:00"]
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
        List<String> result = new ArrayList<>();
        for (int h = 0; h < 12; h++) {
            for (int m = 0; m < 60; m++) {
                if (Integer.bitCount(h) + Integer.bitCount(m) == num) {
                    result.add(h + ":" + (m < 10 ? "0" : "") + m);
                }
            }
        }
        return result;
    }
}
