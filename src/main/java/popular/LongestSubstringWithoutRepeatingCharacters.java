package popular;

import java.util.HashMap;
import java.util.stream.IntStream;

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
        var map = new HashMap<Character, Integer>();
        var start = new int[]{0};
        return IntStream.range(0, s.length()).map(end -> {
            var ch = s.charAt(end);
            if (map.containsKey(ch) && map.get(ch) >= start[0]) {
                start[0] = map.get(ch) + 1;
            }
            map.put(ch, end);
            return end - start[0] + 1;
        }).max().orElse(0);
    }

}
