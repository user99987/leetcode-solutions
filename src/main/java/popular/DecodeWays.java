package popular;

/**
 * Medium
 * <p>
 * A message containing letters from A-Z can be encoded into numbers using the following mapping:
 * <p>
 * 'A' -> “1” 'B' -> “2” … 'Z' -> “26”
 * <p>
 * To decode an encoded message, all the digits must be grouped then mapped back into letters using the reverse of the mapping above (there may be multiple ways). For example, "11106" can be mapped into:
 * <p>
 * "AAJF" with the grouping (1 1 10 6)
 * "KJF" with the grouping (11 10 6)
 * Note that the grouping (1 11 06) is invalid because "06" cannot be mapped into 'F' since "6" is different from "06".
 * <p>
 * Given a string s containing only digits, return the number of ways to decode it.
 * <p>
 * The answer is guaranteed to fit in a 32-bit integer.
 * <p>
 * Example 1:
 * <p>
 * Input: s = “12”
 * <p>
 * Output: 2
 * <p>
 * Explanation: “12” could be decoded as “AB” (1 2) or “L” (12).
 * <p>
 * Example 2:
 * <p>
 * Input: s = “226”
 * <p>
 * Output: 3
 * <p>
 * Explanation: “226” could be decoded as “BZ” (2 26), “VF” (22 6), or “BBF” (2 2 6).
 * <p>
 * Example 3:
 * <p>
 * Input: s = “0”
 * <p>
 * Output: 0
 * <p>
 * Explanation: There is no character that is mapped to a number starting with 0. The only valid mappings with 0 are 'J' -> “10” and 'T' -> “20”, neither of which start with 0. Hence, there are no valid ways to decode this since all digits need to be mapped.
 * <p>
 * Example 4:
 * <p>
 * Input: s = “06”
 * <p>
 * Output: 0
 * <p>
 * Explanation: “06” cannot be mapped to “F” because of the leading zero (“6” is different from “06”).
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 100
 * s contains only digits and may contain leading zero(s).
 */
public class DecodeWays {

    public int numDecodings(String s) {
        if (s.charAt(0) == '0') {
            return 0;
        }
        int n = s.length();
        int[] f = new int[n + 1];
        // Auxiliary
        f[0] = 1;
        f[1] = 1;
        for (int i = 2; i <= n; i++) {
            // Calculate the independent number
            if (s.charAt(i - 1) != '0') {
                // As long as the current character is not 0, it means that the previous decoding
                // number can be inherited
                f[i] = f[i - 1];
            }
            // Calculate the number of combinations
            int twodigits = (s.charAt(i - 2) - '0') * 10 + (s.charAt(i - 1) - '0');
            if (twodigits >= 10 && twodigits <= 26) {
                f[i] += f[i - 2];
            }
        }
        return f[n];
    }

}
