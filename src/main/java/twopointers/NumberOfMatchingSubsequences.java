package twopointers;

import java.util.Arrays;

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

    public int numMatchingSubseq(String s, String[] words) {
        return (int) Arrays.stream(words).filter(word -> isSubsequence(s, word)).count();
    }

    private boolean isSubsequence(String s, String word) {
        final int[] index = {-1};
        return word.chars().allMatch(c -> (index[0] = s.indexOf(c, index[0] + 1)) != -1);
    }
}
