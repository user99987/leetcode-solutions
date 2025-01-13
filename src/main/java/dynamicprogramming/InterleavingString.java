package dynamicprogramming;

/**
 * Medium
 * <p>
 * Given strings s1, s2, and s3, find whether s3 is formed by an interleaving of s1 and s2.
 * <p>
 * An interleaving of two strings s and t is a configuration where they are divided into non-empty substrings such that:
 * <p>
 * s = s1 + s2 + ... + sn
 * t = t1 + t2 + ... + tm
 * |n - m| <= 1
 * The interleaving is s1 + t1 + s2 + t2 + s3 + t3 + ... or t1 + s1 + t2 + s2 + t3 + s3 + ...
 * Note: a + b is the concatenation of strings a and b.
 * <p>
 * Example 1:
 * <p>
 * <p>
 * <p>
 * Input: s1 = “aabcc”, s2 = “dbbca”, s3 = “aadbbcbcac”
 * <p>
 * Output: true
 * <p>
 * Example 2:
 * <p>
 * Input: s1 = “aabcc”, s2 = “dbbca”, s3 = “aadbbbaccc”
 * <p>
 * Output: false
 * <p>
 * Example 3:
 * <p>
 * Input: s1 = “”, s2 = “”, s3 = “”
 * <p>
 * Output: true
 * <p>
 * Constraints:
 * <p>
 * 0 <= s1.length, s2.length <= 100
 * 0 <= s3.length <= 200
 * s1, s2, and s3 consist of lowercase English letters.
 */
public class InterleavingString {
    public static void main(String[] args) {
        System.out.println(new InterleavingString().isInterleave("aabcc", "aabcc", "aabcaabccc"));
    }

    public boolean isInterleave(String s1, String s2, String s3) {
        boolean[][] DP = new boolean[s1.length() + 1][s2.length() + 1];
        DP[0][0] = true;
        if (s3.length() != (s2.length() + s1.length())) return false;
        for (int i = 0; i <= s1.length(); i++) {
            for (int j = 0; j <= s2.length(); j++) {
                if (i == 0 && j == 0) continue;
                int index = (i + j);
                if (j > 0) {
                    if (s3.charAt(index - 1) == s2.charAt(j - 1) && DP[i][j - 1]) {
                        DP[i][j] = true;
                    }
                }
                if (i > 0) {
                    if (s3.charAt(index - 1) == s1.charAt(i - 1) && DP[i - 1][j]) {
                        DP[i][j] = true;
                    }
                }
            }
        }
        return DP[s1.length()][s2.length()];
    }
}
