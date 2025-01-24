package popular;

import java.util.HashMap;

/**
 * Medium
 * <p>
 * Given a string s, find the length of the longest substring without repeating characters.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "abcabcbb"
 * <p>
 * Output: 3
 * <p>
 * Explanation: The answer is "abc", with the length of 3.
 * <p>
 * Example 2:
 * <p>
 * Input: s = "bbbbb"
 * <p>
 * Output: 1
 * <p>
 * Explanation: The answer is "b", with the length of 1.
 * <p>
 * Example 3:
 * <p>
 * Input: s = "pwwkew"
 * <p>
 * Output: 3
 * <p>
 * Explanation: The answer is "wke", with the length of 3. Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * <p>
 * Example 4:
 * <p>
 * Input: s = ""
 * <p>
 * Output: 0
 * <p>
 * Constraints:
 * <p>
 * 0 <= s.length <= 5 * 10^4
 * s consists of English letters, digits, symbols and spaces.
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        // Initialize variables
        int start = 0;
        int maxLen = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        // Iterate through the string
        for (int end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);
            // If the character exists in the hashmap and its index is greater than or equal to the start index
            if (map.containsKey(ch) && map.get(ch) >= start) {
                // Update the start index to the index after the last occurrence of the character
                start = map.get(ch) + 1;
            }
            // Update the maximum length if necessary
            maxLen = Math.max(maxLen, end - start + 1);
            // Update the index of the current character in the hashmap
            map.put(ch, end);
        }

        return maxLen;
    }

}
