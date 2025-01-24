package string;

import java.util.BitSet;

/**
 * Easy
 * <p>
 * Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.
 * <p>
 * Letters are case sensitive, for example, "Aa" is not considered a palindrome here.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "abccccdd"
 * <p>
 * Output: 7
 * <p>
 * Explanation: One longest palindrome that can be built is "dccaccd", whose length is 7.
 * <p>
 * Example 2:
 * <p>
 * Input: s = "a"
 * <p>
 * Output: 1
 * <p>
 * Example 3:
 * <p>
 * Input: s = "bb"
 * <p>
 * Output: 2
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 2000
 * s consists of lowercase and/or uppercase English letters only.
 */
public class LongestPalindrome {

    public int longestPalindrome(String s) {
        BitSet set = new BitSet(60);
        for (char c : s.toCharArray()) {
            set.flip(c - 'A');
        }
        if (set.isEmpty()) {
            return s.length();
        }
        return s.length() - set.cardinality() + 1;
    }
}
