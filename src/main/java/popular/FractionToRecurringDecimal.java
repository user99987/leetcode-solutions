package popular;

import java.util.HashMap;
import java.util.Map;

/**
 * Medium
 * <p>
 * Given two integers representing the numerator and denominator of a fraction, return the fraction in string format.
 * <p>
 * If the fractional part is repeating, enclose the repeating part in parentheses.
 * <p>
 * If multiple answers are possible, return any of them.
 * <p>
 * It is guaranteed that the length of the answer string is less than 104 for all the given inputs.
 * <p>
 * Example 1:
 * <p>
 * Input: numerator = 1, denominator = 2
 * <p>
 * Output: “0.5”
 * <p>
 * Example 2:
 * <p>
 * Input: numerator = 2, denominator = 1
 * <p>
 * Output: “2”
 * <p>
 * Example 3:
 * <p>
 * Input: numerator = 2, denominator = 3
 * <p>
 * Output: “0.(6)”
 * <p>
 * Example 4:
 * <p>
 * Input: numerator = 4, denominator = 333
 * <p>
 * Output: “0.(012)”
 * <p>
 * Example 5:
 * <p>
 * Input: numerator = 1, denominator = 5
 * <p>
 * Output: “0.2”
 * <p>
 * Constraints:
 * <p>
 * -231 <= numerator, denominator <= 231 - 1
 * denominator != 0
 */
public class FractionToRecurringDecimal {

    String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        // negative case
        if (numerator > 0 && denominator < 0 || numerator < 0 && denominator > 0) {
            sb.append("-");
        }
        long x = Math.abs(Long.valueOf(numerator));
        long y = Math.abs(Long.valueOf(denominator));
        sb.append(x / y);
        long remainder = x % y;
        if (remainder == 0) {
            return sb.toString();
        }
        // decimal case
        sb.append(".");
        // store the remainder in a Hashmap because in the case of recurring decimal, the remainder
        // repeats as dividend.
        Map<Long, Integer> map = new HashMap<>();
        while (remainder != 0) {
            if (map.containsKey(remainder)) {
                sb.insert(map.get(remainder), "(");
                sb.append(")");
                break;
            }
            // store the remainder and the index of it's occurence in the String
            map.put(remainder, sb.length());
            remainder *= 10;
            sb.append(remainder / y);
            remainder %= y;
        }
        return sb.toString();
    }

}
