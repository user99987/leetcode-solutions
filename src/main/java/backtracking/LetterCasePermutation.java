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

    public List<String> letterCasePermutation(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s.toCharArray(), 0, result);
        return result;
    }

    private void backtrack(char[] s, int index, List<String> result) {
        if (index == s.length) {
            result.add(new String(s));
            return;
        }
        backtrack(s, index + 1, result);
        if (Character.isLetter(s[index])) {
            s[index] ^= 32;
            backtrack(s, index + 1, result);
            s[index] ^= 32;
        }
    }
}
