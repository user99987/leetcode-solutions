package popular;

/**
 * Easy
 * <p>
 * Write a function to find the longest common prefix string amongst an array of strings.
 * <p>
 * If there is no common prefix, return an empty string "".
 * <p>
 * Example 1:
 * <p>
 * Input: strs = [“flower”,”flow”,”flight”]
 * <p>
 * Output: “fl”
 * <p>
 * Example 2:
 * <p>
 * Input: strs = [“dog”,”racecar”,”car”]
 * <p>
 * Output: “”
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

    public static void main(String[] args) throws Exception {
        String[] A = {"abc", "a", "adkd"};
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(A));
    }

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String result = strs[0];
        for (int i = 1; i < strs.length; i++) {
            String s = strs[i];
            for (int j = 0; j < result.length(); j++) {
                if (j >= s.length() || result.charAt(j) != s.charAt(j)) {
                    result = result.substring(0, j);
                    break;
                }
            }
        }
        return result;
    }
}
