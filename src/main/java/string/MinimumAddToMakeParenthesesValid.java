package string;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Medium
 * <p>
 * A parentheses string is valid if and only if:
 * <p>
 * It is the empty string,
 * It can be written as AB (A concatenated with B), where A and B are valid strings, or
 * It can be written as (A), where A is a valid string.
 * You are given a parentheses string s. In one move, you can insert a parenthesis at any position of the string.
 * <p>
 * For example, if s = "()))", you can insert an opening parenthesis to be "(**(**)))" or a closing parenthesis to be "())**)**)".
 * Return the minimum number of moves required to make s valid.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "())"
 * <p>
 * Output: 1
 * <p>
 * Example 2:
 * <p>
 * Input: s = "((("
 * <p>
 * Output: 3
 * <p>
 * Constraints:
 * <p>
 * 1 <= s.length <= 1000
 * s[i] is either '(' or ')'.
 */
public class MinimumAddToMakeParenthesesValid {

    public int minAddToMakeValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            } else {
                stack.push(c);
            }
        }
        return stack.size();
    }
}
