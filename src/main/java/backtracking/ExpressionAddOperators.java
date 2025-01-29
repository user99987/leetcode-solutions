package backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Hard
 * <p>
 * Given a string num that contains only digits and an integer target, return all possibilities to insert the binary operators '+', '-', and/or '*' between the digits of num so that the resultant expression evaluates to the target value.
 * <p>
 * Note that operands in the returned expressions should not contain leading zeros.
 * <p>
 * Example 1:
 * <p>
 * Input: num = "123", target = 6
 * <p>
 * Output: ["1*2*3","1+2+3"]
 * <p>
 * Explanation: Both "1*2*3" and "1+2+3" evaluate to 6.
 * <p>
 * Example 2:
 * <p>
 * Input: num = "232", target = 8
 * <p>
 * Output: ["2*3+2","2+3*2"]
 * <p>
 * Explanation: Both "2*3+2" and "2+3*2" evaluate to 8.
 * <p>
 * Example 3:
 * <p>
 * Input: num = "105", target = 5
 * <p>
 * Output: ["1*0+5","10-5"]
 * <p>
 * Explanation:
 * <p>
 * Both "1*0+5" and "10-5" evaluate to 5.
 * Note that "1-05" is not a valid expression because the 5 has a leading zero.
 * Example 4:
 * <p>
 * Input: num = "00", target = 0
 * <p>
 * Output: ["0*0","0+0","0-0"]
 * <p>
 * Explanation:
 * <p>
 * "0*0", "0+0", and "0-0" all evaluate to 0.
 * Note that "00" is not a valid expression because the 0 has a leading zero.
 * Example 5:
 * <p>
 * Input: num = "3456237490", target = 9191
 * <p>
 * Output: []
 * <p>
 * Explanation: There are no expressions that can be created from "3456237490" to evaluate to 9191.
 * <p>
 * Constraints:
 * <p>
 * 1 <= num.length <= 10
 * num consists of only digits.
 * -2^31 <= target <= 2^31 - 1
 */
public class ExpressionAddOperators {

    public List<String> addOperators(String num, int target) {
        List<String> result = new ArrayList<>();
        backtrack(result, num, target, 0, 0, 0, "");
        return result;
    }

    private void backtrack(List<String> result, String num, int target, int index, long eval, long multed, String path) {
        if (index == num.length()) {
            if (eval == target) {
                result.add(path);
            }
            return;
        }
        for (int i = index; i < num.length(); i++) {
            if (i != index && num.charAt(index) == '0') break;
            long curr = Long.parseLong(num.substring(index, i + 1));
            if (index == 0) {
                backtrack(result, num, target, i + 1, curr, curr, path + curr);
            } else {
                backtrack(result, num, target, i + 1, eval + curr, curr, path + "+" + curr);
                backtrack(result, num, target, i + 1, eval - curr, -curr, path + "-" + curr);
                backtrack(result, num, target, i + 1, eval - multed + multed * curr, multed * curr, path + "*" + curr);
            }
        }
    }
}
