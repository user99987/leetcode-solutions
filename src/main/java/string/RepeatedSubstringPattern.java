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
        char[] existsChar = new char[127];
        for (char chA : a.toCharArray()) {
            existsChar[chA] = 1;
        }
        for (char chB : b.toCharArray()) {
            if (existsChar[chB] < 1) {
                return -1;
            }
        }

        int lenB = b.length() - 1;
        StringBuilder sb = new StringBuilder(a);
        int lenSbA = sb.length() - 1;
        int repeatCount = 1;
        while (lenSbA < lenB) {
            sb.append(a);
            repeatCount++;
            lenSbA = sb.length() - 1;
        }
        if (!isFound(sb, b)) {
            sb.append(a);
            repeatCount++;
            return !isFound(sb, b) ? -1 : repeatCount;
        }
        return repeatCount;
    }

    private boolean isFound(StringBuilder a, String b) {
        for (int i = 0; i < a.length(); i++) {
            int k = i;
            int m = 0;
            while (k < a.length() && m < b.length()) {
                if (a.charAt(k) != b.charAt(m)) {
                    break;
                } else {
                    k++;
                    m++;
                }
            }
            if (m == b.length()) {
                return true;
            }
        }
        return false;
    }
}
