package twopointers;

/**
 * Hard
 * <p>
 * Given a string s, return the last substring of s in lexicographical order.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "abab"
 * <p>
 * Output: "bab"
 * <p>
 * Explanation: The substrings are ["a", "ab", "aba", "abab", "b", "ba", "bab"]. The lexicographically maximum substring is "bab".
 * <p>
 * Example 2:
 * <p>
 * Input: s = "leetcode"
 * <p>
 * Output: "tcode"
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 4 * 10^5
 * s contains only lowercase English letters.
 */
public class LastSubstringInLexicographicalOrder {

    public String lastSubstring(String s) {
        int i = 0;
        int j = 1;
        int k = 0;
        int n = s.length();
        char[] ca = s.toCharArray();
        while (j + k < n) {
            if (ca[i + k] == ca[j + k]) {
                k++;
            } else if (ca[i + k] > ca[j + k]) {
                j = j + k + 1;
                k = 0;
            } else {
                i = Math.max(i + k + 1, j);
                j = i + 1;
                k = 0;
            }
        }
        return s.substring(i);
    }
}
