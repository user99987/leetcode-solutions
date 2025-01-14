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
 * Input: s = “ADOBECODEBANC”, t = “ABC”
 * <p>
 * Output: “BANC”
 * <p>
 * Explanation: The minimum window substring “BANC” includes ‘A’, ‘B’, and ‘C’ from string t.
 * <p>
 * Example 2:
 * <p>
 * Input: s = “a”, t = “a”
 * <p>
 * Output: “a”
 * <p>
 * Explanation: The entire string s is the minimum window.
 * <p>
 * Example 3:
 * <p>
 * Input: s = “a”, t = “aa”
 * <p>
 * Output: “”
 * <p>
 * Explanation: Both ‘a’s from t must be included in the window. Since the largest window of s only has one ‘a’, return empty string.
 * <p>
 * Constraints:
 * <p>
 * m == s.length
 * n == t.length
 * 1 <= m, n <= 105
 * s and t consist of uppercase and lowercase English letters.
 */
public class MinimumWindowSubstring {

    public static void main(String[] args) throws Exception {
        System.out.println(new MinimumWindowSubstring().minWindow("ADOBECODEBANC", "ABC"));
    }

    public String minWindow(String s, String t) {
        Map<Character, Integer> tFreqMap = new HashMap<>();
        Map<Character, Integer> sFreqMap = new HashMap<>();

        // Initialize tFreqMap with character frequencies from string t
        for (char ch : t.toCharArray()) {
            tFreqMap.put(ch, tFreqMap.getOrDefault(ch, 0) + 1);
        }

        int left = 0;
        int right = 0;
        int minLength = Integer.MAX_VALUE;
        int minStart = 0;

        while (right < s.length()) {
            char rightChar = s.charAt(right);
            sFreqMap.put(rightChar, sFreqMap.getOrDefault(rightChar, 0) + 1);
            right++;

            // Check if the current window contains all characters from t
            while (containsAllChars(sFreqMap, tFreqMap)) {
                // Update the minimum window length
                if (right - left < minLength) {
                    minLength = right - left;
                    minStart = left;
                }

                char leftChar = s.charAt(left);
                sFreqMap.put(leftChar, sFreqMap.get(leftChar) - 1);
                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLength);
    }

    // Helper method to check if sFreqMap contains all characters from tFreqMap
    private boolean containsAllChars(Map<Character, Integer> sFreqMap, Map<Character, Integer> tFreqMap) {
        for (Map.Entry<Character, Integer> entry : tFreqMap.entrySet()) {
            char ch = entry.getKey();
            int count = entry.getValue();
            if (sFreqMap.getOrDefault(ch, 0) < count) {
                return false;
            }
        }
        return true;
    }

}
