package string;

import java.util.HashMap;
import java.util.Map;

/**
 * Easy
 * <p>
 * Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "leetcode"
 * <p>
 * Output: 0
 * <p>
 * Example 2:
 * <p>
 * Input: s = "loveleetcode"
 * <p>
 * Output: 2
 * <p>
 * Example 3:
 * <p>
 * Input: s = "aabb"
 * <p>
 * Output: -1
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 10^5
 * s consists of only lowercase English letters.
 */
public class FirstUniqueCharacterInAString {

    public int firstUniqChar(String s) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        s.chars().forEach(c -> frequencyMap.merge((char) c, 1, Integer::sum));
        return s.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> frequencyMap.get(c) == 1)
                .mapToInt(s::indexOf)
                .findFirst()
                .orElse(-1);
    }
}
