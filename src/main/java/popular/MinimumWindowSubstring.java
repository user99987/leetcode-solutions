package popular;

import java.util.HashMap;
import java.util.Map;

/**
 * Hard
 * <p>
 * Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that every character in t (including duplicates) is included in the window. If there is no such substring__, return the empty string "".
 * <p>
 * The testcases will be generated such that the answer is unique.
 * <p>
 * A substring is a contiguous sequence of characters within the string.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "ADOBECODEBANC", t = "ABC"
 * <p>
 * Output: "BANC"
 * <p>
 * Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.
 * <p>
 * Example 2:
 * <p>
 * Input: s = "a", t = "a"
 * <p>
 * Output: "a"
 * <p>
 * Explanation: The entire string s is the minimum window.
 * <p>
 * Example 3:
 * <p>
 * Input: s = "a", t = "aa"
 * <p>
 * Output: ""
 * <p>
 * Explanation: Both 'a's from t must be included in the window. Since the largest window of s only has one 'a', return empty string.
 * <p>
 * Constraints:
 * <p>
 * m == s.length
 * n == t.length
 * 1 <= m, n <= 105
 * s and t consist of uppercase and lowercase English letters.
 */
public class MinimumWindowSubstring {

    public String minWindow(String s, String t) {
        Map<Character, Integer> tFreq = new HashMap<>();
        t.chars().forEach(c -> tFreq.merge((char) c, 1, Integer::sum));

        Map<Character, Integer> sFreq = new HashMap<>();
        int left = 0, minLength = Integer.MAX_VALUE, minStart = 0, matched = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            sFreq.merge(ch, 1, Integer::sum);
            if (tFreq.containsKey(ch) && sFreq.get(ch).equals(tFreq.get(ch))) {
                matched++;
            }

            while (matched == tFreq.size()) {
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    minStart = left;
                }
                char leftChar = s.charAt(left++);
                if (tFreq.containsKey(leftChar) && sFreq.get(leftChar).equals(tFreq.get(leftChar))) {
                    matched--;
                }
                sFreq.merge(leftChar, -1, Integer::sum);
                sFreq.remove(leftChar, 0);
            }
        }

        return minLength == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLength);
    }

}
