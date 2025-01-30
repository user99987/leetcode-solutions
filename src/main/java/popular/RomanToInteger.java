package popular;

import java.util.Map;
import java.util.stream.IntStream;

/**
 * Easy
 * <p>
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * <p>
 * Symbol  Value
 * I       1
 * V       5
 * X       10
 * L       50
 * C       100
 * D       500
 * M       1000
 * For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
 * <p>
 * Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
 * <p>
 * I can be placed before V (5) and X (10) to make 4 and 9.
 * X can be placed before L (50) and C (100) to make 40 and 90.
 * C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given a roman numeral, convert it to an integer.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "III"
 * <p>
 * Output: 3
 * <p>
 * Example 2:
 * <p>
 * Input: s = "IV"
 * <p>
 * Output: 4
 * <p>
 * Example 3:
 * <p>
 * Input: s = "IX"
 * <p>
 * Output: 9
 * <p>
 * Example 4:
 * <p>
 * Input: s = "LVIII"
 * <p>
 * Output: 58
 * <p>
 * Explanation: L = 50, V= 5, III = 3.
 * <p>
 * Example 5:
 * <p>
 * Input: s = "MCMXCIV"
 * <p>
 * Output: 1994
 * <p>
 * Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 15
 * s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
 * It is guaranteed that s is a valid roman numeral in the range [1, 3999].
 */
public class RomanToInteger {

    private static final Map<Character, Integer> ROMAN_MAP = Map.of(
            'I', 1, 'V', 5, 'X', 10, 'L', 50,
            'C', 100, 'D', 500, 'M', 1000
    );

    public int romanToInt(String s) {
        return IntStream.range(0, s.length())
                .map(i -> {
                    int curr = ROMAN_MAP.get(s.charAt(i));
                    int next = (i < s.length() - 1) ? ROMAN_MAP.get(s.charAt(i + 1)) : 0;
                    return curr < next ? -curr : curr;
                })
                .sum();
    }
}
