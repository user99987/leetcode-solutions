package string;

import java.util.stream.IntStream;

/**
 * Medium
 * <p>
 * Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
 * <p>
 * In other words, return true if one of s1's permutations is the substring of s2.
 * <p>
 * Example 1:
 * <p>
 * Input: s1 = "ab", s2 = "eidbaooo"
 * <p>
 * Output: true
 * <p>
 * Explanation: s2 contains one permutation of s1 ("ba").
 * <p>
 * Example 2:
 * <p>
 * Input: s1 = "ab", s2 = "eidboaoo"
 * <p>
 * Output: false
 * <p>
 * Constraints:
 * <p>
 * 1 <= s1.length, s2.length <= 10^4
 * s1 and s2 consist of lowercase English letters.
 */
public class PermutationInString {

    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        if (n > m) return false;

        int[] cntS1 = new int[26];
        int[] cntS2 = new int[26];

        IntStream.range(0, n).forEach(i -> {
            cntS1[s1.charAt(i) - 'a']++;
            cntS2[s2.charAt(i) - 'a']++;
        });

        if (IntStream.range(0, 26).allMatch(i -> cntS1[i] == cntS2[i])) return true;

        return IntStream.range(n, m).anyMatch(i -> {
            cntS2[s2.charAt(i - n) - 'a']--;
            cntS2[s2.charAt(i) - 'a']++;
            return IntStream.range(0, 26).allMatch(j -> cntS1[j] == cntS2[j]);
        });
    }
}
