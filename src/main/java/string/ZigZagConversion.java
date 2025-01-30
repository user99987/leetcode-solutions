package string;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Medium
 * <p>
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
 * <p>
 * P A H N A P L S I I G Y I R
 * <p>
 * And then read line by line: "PAHNAPLSIIGYIR"
 * <p>
 * Write the code that will take a string and make this conversion given a number of rows:
 * <p>
 * string convert(string s, int numRows);
 * <p>
 * Example 1:
 * <p>
 * Input: s = "PAYPALISHIRING", numRows = 3
 * <p>
 * Output: "PAHNAPLSIIGYIR"
 * <p>
 * Example 2:
 * <p>
 * Input: s = "PAYPALISHIRING", numRows = 4
 * <p>
 * Output: "PINALSIGYAHRPI"
 * <p>
 * Explanation: P I N A L S I G Y A H R P I
 * <p>
 * Example 3:
 * <p>
 * Input: s = "A", numRows = 1
 * <p>
 * Output: "A"
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 1000
 * s consists of English letters (lower-case and upper-case), ',' and '.'.
 * 1 <= numRows <= 1000
 */
public class ZigZagConversion {

    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;

        StringBuilder[] rows = IntStream.range(0, numRows)
                .mapToObj(i -> new StringBuilder())
                .toArray(StringBuilder[]::new);

        int row = 0, step = 1;
        for (char c : s.toCharArray()) {
            rows[row].append(c);
            if (row == 0) step = 1;
            else if (row == numRows - 1) step = -1;
            row += step;
        }

        return IntStream.range(0, numRows)
                .mapToObj(i -> rows[i].toString())
                .collect(Collectors.joining());
    }
}
