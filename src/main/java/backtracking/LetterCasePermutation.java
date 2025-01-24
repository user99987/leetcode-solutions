package backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Medium
 * <p>
 * Given a string s, you can transform every letter individually to be lowercase or uppercase to create another string.
 * <p>
 * Return a list of all possible strings we could create. Return the output in any order.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "a1b2"
 * <p>
 * Output: ["a1b2","a1B2","A1b2","A1B2"]
 * <p>
 * Example 2:
 * <p>
 * Input: s = "3z4"
 * <p>
 * Output: ["3z4","3Z4"]
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 12
 * s consists of lowercase English letters, uppercase English letters, and digits.
 */
public class LetterCasePermutation {

    public List<String> letterCasePermutation(String S) {
        List<String> result = new ArrayList<>();
        backtrack(S, result, 0, "");
        return result;
    }

    private void backtrack(String s, List<String> result, int i, String r) {
        if (i == s.length()) {
            result.add(r);
        } else {
            if (Character.isAlphabetic(s.charAt(i))) {
                backtrack(s, result, i + 1, r + s.charAt(i));
                if (Character.isLowerCase(s.charAt(i))) {
                    backtrack(s, result, i + 1, r + Character.toUpperCase(s.charAt(i)));
                } else {
                    backtrack(s, result, i + 1, r + Character.toLowerCase(s.charAt(i)));
                }
            } else {
                backtrack(s, result, i + 1, r + s.charAt(i));
            }
        }
    }
}
