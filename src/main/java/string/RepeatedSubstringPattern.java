package string;

/**
 * Medium
 * <p>
 * Given two strings a and b, return the minimum number of times you should repeat string a so that string b is a substring of it. If it is impossible for b to be a substring of a after repeating it, return -1.
 * <p>
 * Notice: string "abc" repeated 0 times is "", repeated 1 time is "abc" and repeated 2 times is "abcabc".
 * <p>
 * Example 1:
 * <p>
 * Input: a = "abcd", b = "cdabcdab"
 * <p>
 * Output: 3
 * <p>
 * Explanation: We return 3 because by repeating a three times "abcdabcdabcd", b is a substring of it.
 * <p>
 * Example 2:
 * <p>
 * Input: a = "a", b = "aa"
 * <p>
 * Output: 2
 * <p>
 * Constraints:
 * <p>
 * 1 <= a.length, b.length <= 104
 * a and b consist of lowercase English letters.
 */
public class RepeatedSubstringPattern {

    public int repeatedStringMatch(String a, String b) {
        if (b.chars().anyMatch(ch -> a.indexOf(ch) == -1)) return -1;

        StringBuilder sb = new StringBuilder(a);
        int repeatCount = 1;
        while (sb.length() < b.length()) {
            sb.append(a);
            repeatCount++;
        }
        return sb.toString().contains(b) ? repeatCount : sb.append(a).toString().contains(b) ? repeatCount + 1 : -1;
    }
}
