package string;

/**
 * Hard
 * <p>
 * You are given a string s. You can convert s to a palindrome by adding characters in front of it.
 * <p>
 * Return the shortest palindrome you can find by performing this transformation.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "aacecaaa"
 * <p>
 * Output: "aaacecaaa"
 * <p>
 * Example 2:
 * <p>
 * Input: s = "abcd"
 * <p>
 * Output: "dcbabcd"
 * <p>
 * Constraints:
 * <p>
 * 0 <= s.length <= 5 * 10^4
 * s consists of lowercase English letters only.
 */
public class ShortestPalindrome {

    public String shortestPalindrome(String s) {
        String reversed = new StringBuilder(s).reverse().toString();
        String combined = s + "#" + reversed;
        int[] lps = new int[combined.length()];

        for (int i = 1, length = 0; i < combined.length(); i++) {
            while (length > 0 && combined.charAt(i) != combined.charAt(length)) {
                length = lps[length - 1];
            }
            if (combined.charAt(i) == combined.charAt(length)) {
                length++;
            }
            lps[i] = length;
        }

        return reversed.substring(0, s.length() - lps[combined.length() - 1]) + s;
    }
}
