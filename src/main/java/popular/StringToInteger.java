package popular;

/**
 * Medium
 * <p>
 * Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer (similar to C/C++’s atoi function).
 * <p>
 * The algorithm for myAtoi(string s) is as follows:
 * <p>
 * Read in and ignore any leading whitespace.
 * Check if the next character (if not already at the end of the string) is '-' or '+'. Read this character in if it is either. This determines if the final result is negative or positive respectively. Assume the result is positive if neither is present.
 * Read in next the characters until the next non-digit character or the end of the input is reached. The rest of the string is ignored.
 * Convert these digits into an integer (i.e. "123" -> 123, "0032" -> 32). If no digits were read, then the integer is 0. Change the sign as necessary (from step 2).
 * If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then clamp the integer so that it remains in the range. Specifically, integers less than -231 should be clamped to -231, and integers greater than 231 - 1 should be clamped to 231 - 1.
 * Return the integer as the final result.
 * Note:
 * <p>
 * Only the space character ' ' is considered a whitespace character.
 * Do not ignore any characters other than the leading whitespace or the rest of the string after the digits.
 * Example 1:
 * <p>
 * Input: s = “42”
 * <p>
 * Output: 42
 * <p>
 * Explanation: The underlined characters are what is read in, the caret is the current reader position.
 * <p>
 * Step 1: "42" (no characters read because there is no leading whitespace)
 * ^
 * Step 2: "42" (no characters read because there is neither a '-' nor '+')
 * ^
 * Step 3: "42" ("42" is read in)
 * ^
 * The parsed integer is 42. Since 42 is in the range [-231, 231 - 1], the final result is 42.
 * <p>
 * Example 2:
 * <p>
 * Input: s = “ -42”
 * <p>
 * Output: -42
 * <p>
 * Explanation:
 * <p>
 * Step 1: " -42" (leading whitespace is read and ignored)
 * ^
 * Step 2: " -42" ('-' is read, so the result should be negative)
 * ^
 * Step 3: " -42" ("42" is read in)
 * ^
 * The parsed integer is -42.
 * Since -42 is in the range [-231, 231 - 1], the final result is -42.
 * <p>
 * Example 3:
 * <p>
 * Input: s = “4193 with words”
 * <p>
 * Output: 4193
 * <p>
 * Explanation:
 * <p>
 * Step 1: "4193 with words" (no characters read because there is no leading whitespace)
 * ^
 * Step 2: "4193 with words" (no characters read because there is neither a '-' nor '+')
 * ^
 * Step 3: "4193 with words" ("4193" is read in; reading stops because the next character is a non-digit)
 * ^
 * The parsed integer is 4193.
 * Since 4193 is in the range [-231, 231 - 1], the final result is 4193.
 * <p>
 * Example 4:
 * <p>
 * Input: s = “words and 987”
 * <p>
 * Output: 0
 * <p>
 * Explanation:
 * <p>
 * Step 1: "words and 987" (no characters read because there is no leading whitespace)
 * ^
 * Step 2: "words and 987" (no characters read because there is neither a '-' nor '+')
 * ^
 * Step 3: "words and 987" (reading stops immediately because there is a non-digit 'w')
 * ^
 * The parsed integer is 0 because no digits were read.
 * Since 0 is in the range [-231, 231 - 1], the final result is 0.
 * <p>
 * Example 5:
 * <p>
 * Input: s = “-91283472332”
 * <p>
 * Output: -2147483648
 * <p>
 * Explanation:
 * <p>
 * Step 1: "-91283472332" (no characters read because there is no leading whitespace)
 * ^
 * Step 2: "-91283472332" ('-' is read, so the result should be negative)
 * ^
 * Step 3: "-91283472332" ("91283472332" is read in)
 * ^
 * The parsed integer is -91283472332.
 * Since -91283472332 is less than the lower bound of the range [-231, 231 - 1], the final result is clamped to -231 = -2147483648.
 * <p>
 * Constraints:
 * <p>
 * 0 <= s.length <= 200
 * s consists of English letters (lower-case and upper-case), digits (0-9), ' ', '+', '-', and '.'.
 */
public class StringToInteger {

    public static void main(String[] args) {
        StringToInteger solution = new StringToInteger();

        // Test cases
        String s1 = "42";
        System.out.println("Example 1 Output: " + solution.myAtoi(s1));

        String s2 = " -42";
        System.out.println("Example 2 Output: " + solution.myAtoi(s2));

        String s3 = "4193 with words";
        System.out.println("Example 3 Output: " + solution.myAtoi(s3));

        String s4 = "words and 987";
        System.out.println("Example 4 Output: " + solution.myAtoi(s4));

        String s5 = "-91283472332";
        System.out.println("Example 5 Output: " + solution.myAtoi(s5));
    }

    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty())
            return 0;

        int sign = 1;
        int start = 0;
        long result = 0;

        if (s.charAt(0) == '-' || s.charAt(0) == '+') {
            sign = (s.charAt(0) == '-') ? -1 : 1;
            start++;
        }

        for (int i = start; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!Character.isDigit(c))
                break;
            result = result * 10 + (c - '0');
            if (result * sign > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if (result * sign < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
        }

        return (int) (result * sign);
    }

}