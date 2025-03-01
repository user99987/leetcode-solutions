package popular;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Map;

/**
 * Easy
 * <p>
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Example 1:
 * <p>
 * Input: s = "()"
 * <p>
 * Output: true
 * <p>
 * Example 2:
 * <p>
 * Input: s = "()[]{}"
 * <p>
 * Output: true
 * <p>
 * Example 3:
 * <p>
 * Input: s = "(]"
 * <p>
 * Output: false
 * <p>
 * Example 4:
 * <p>
 * Input: s = "([)]"
 * <p>
 * Output: false
 * <p>
 * Example 5:
 * <p>
 * Input: s = "{[]}"
 * <p>
 * Output: true
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 104
 * s consists of parentheses only '()[]{}'.
 */
public class ValidParentheses {

    private static final Map<Character, Character> BRACKETS = Map.of(')', '(', '}', '{', ']', '[');

    public boolean isValid(String s) {
        Deque<Character> stack = new LinkedList<>();

        for (char c : s.toCharArray()) {
            if (BRACKETS.containsValue(c)) {
                stack.push(c);
            } else if (stack.isEmpty() || stack.pop() != BRACKETS.get(c)) {
                return false;
            }
        }

        return stack.isEmpty();
    }

}
