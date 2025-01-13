package popular;

import java.util.ArrayList;
import java.util.List;

/**
 * Medium
 * <p>
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 * <p>
 * Example 1:
 * <p>
 * Input: n = 3
 * <p>
 * Output: [”((()))”,”(()())”,”(())()”,”()(())”,”()()()”]
 * <p>
 * Example 2:
 * <p>
 * Input: n = 1
 * <p>
 * Output: [”()”]
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 8
 */
public class GenerateParentheses {

    public static void main(String[] args) throws Exception {
        System.out.println(new GenerateParentheses().generateParenthesis(3));
    }

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateParenthesisHelper("", 0, 0, n, result);
        return result;
    }

    private void generateParenthesisHelper(String current, int open, int close, int n, List<String> result) {
        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }

        if (open < n) {
            generateParenthesisHelper(current + "(", open + 1, close, n, result);
        }

        if (close < open) {
            generateParenthesisHelper(current + ")", open, close + 1, n, result);
        }
    }

}
