package popular;

import java.util.Arrays;

/**
 * Easy
 * <p>
 * Write a function to find the longest common prefix string amongst an array of strings.
 * <p>
 * If there is no common prefix, return an empty string "".
 * <p>
 * Example 1:
 * <p>
 * Input: strs = ["flower","flow","flight"]
 * <p>
 * Output: "fl"
 * <p>
 * Example 2:
 * <p>
 * Input: strs = ["dog","racecar","car"]
 * <p>
 * Output: ""
 * <p>
 * Explanation: There is no common prefix among the input strings.
 * <p>
 * Constraints:
 * <p>
 * 1 <= strs.length <= 200
 * 0 <= strs[i].length <= 200
 * strs[i] consists of only lower-case English letters.
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        return Arrays.stream(strs)
                .reduce((a, b) -> {
                    int i = 0;
                    while (i < a.length() && i < b.length() && a.charAt(i) == b.charAt(i)) i++;
                    return a.substring(0, i);
                })
                .orElse("");
    }
}
