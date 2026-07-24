package popular

import java.util.LinkedList

/**
 * Medium
 * Evaluate Reverse Polish Notation
 */
class EvaluateReversePolishNotationK {

    fun evalRPN(tokens: Array<String>): Int {
        val st = LinkedList<Int>()
        for (token in tokens) {
            if (!Character.isDigit(token[token.length - 1])) {
                st.push(eval(st.pop(), st.pop(), token))
            } else {
                st.push(token.toInt())
            }
        }
        return st.pop()
    }

    private fun eval(second: Int, first: Int, operator: String): Int {
        return when (operator) {
            "+" -> first + second
            "-" -> first - second
            "*" -> first * second
            else -> first / second
        }
    }
}

