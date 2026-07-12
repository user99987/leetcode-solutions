package string;

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
        var frequencies = new int[26];
        for (var i = 0; i < s.length(); i++) {
            frequencies[s.charAt(i) - 'a']++;
        }
        for (var i = 0; i < s.length(); i++) {
            if (frequencies[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
