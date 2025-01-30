package twopointers;

/**
 * Medium
 * <p>
 * Given a string s and an array of strings words, return the number of words[i] that is a subsequence of s.
 * <p>
 * A subsequence of a string is a new string generated from the original string with some characters (can be none) deleted without changing the relative order of the remaining characters.
 * <p>
 * For example, "ace" is a subsequence of "abcde".
 * Example 1:
 * <p>
 * Input: s = "abcde", words = ["a","bb","acd","ace"]
 * <p>
 * Output: 3
 * <p>
 * Explanation: There are three strings in words that are a subsequence of s: "a", "acd", "ace".
 * <p>
 * Example 2:
 * <p>
 * Input: s = "dsahjpjauf", words = ["ahjpjau","ja","ahbwzgqnuk","tnmlanowax"]
 * <p>
 * Output: 2
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 5 * 10^4
 * 1 <= words.length <= 5000
 * 1 <= words[i].length <= 50
 * s and words[i] consist of only lowercase English letters.
 */
public class NumberOfMatchingSubsequences {

    public int numMatchingSubseq(String S, String[] words) {
        int count = 0;
        for (String w : words) {
            if (isSubsequence(S, w)) {
                count++;
            }
        }
        return count;
    }

    private boolean isSubsequence(String S, String P) {
        int i = 0, j = 0;
        if (P.length() > S.length()) return false;
        for (; ; ) {
            if (j >= P.length()) return true;
            else if (i >= S.length()) return false;
            else {
                if (S.charAt(i) == P.charAt(j)) {
                    i++;
                    j++;
                } else {
                    i++;
                }
            }
        }
    }
}
