package popular;

import java.util.Stack;

/**
 * Medium
 * <p>
 * Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 * <p>
 * Valid operators are +, -, *, and /. Each operand may be an integer or another expression.
 * <p>
 * Note that division between two integers should truncate toward zero.
 * <p>
 * It is guaranteed that the given RPN expression is always valid. That means the expression would always evaluate to a result, and there will not be any division by zero operation.
 * <p>
 * Example 1:
 * <p>
 * Input: tokens = ["2","1","+","3","*"]
 * <p>
 * Output: 9
 * <p>
 * Explanation: ((2 + 1) * 3) = 9
 * <p>
 * Example 2:
 * <p>
 * Input: tokens = ["4","13","5","/","+"]
 * <p>
 * Output: 6
 * <p>
 * Explanation: (4 + (13 / 5)) = 6
 * <p>
 * Example 3:
 * <p>
 * Input: tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
 * <p>
 * Output: 22
 * <p>
 * Explanation:
 * <p>
 * ((10 \* (6 / ((9 + 3) \* -11))) + 17) + 5
 * = ((10 \* (6 / (12 \* -11))) + 17) + 5
 * = ((10 \* (6 / -132)) + 17) + 5
 * = ((10 \* 0) + 17) + 5
 * = (0 + 17) + 5
 * = 17 + 5
 * = 22
 * Constraints:
 * <p>
 * 1 <= tokens.length <= 104
 * tokens[i] is either an operator: "+", "-", "*", or "/", or an integer in the range [-200, 200].
 */
public class EvaluateReversePolishNotation {

    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();
        for (String token : tokens) {
            if (!Character.isDigit(token.charAt(token.length() - 1))) {
                st.push(eval(st.pop(), st.pop(), token));
            } else {
                st.push(Integer.parseInt(token));
            }
        }
        return st.pop();
    }

    private int eval(int second, int first, String operator) {
        return switch (operator) {
            case "+" -> first + second;
            case "-" -> first - second;
            case "*" -> first * second;
            default -> first / second;
        };
    }
}
