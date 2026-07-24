package backtracking

/**
 * Hard
 *
 * Given a string num that contains only digits and an integer target, return all possibilities
 * to insert the binary operators '+', '-', and/or '*' between the digits of num so that the
 * resultant expression evaluates to the target value.
 */
class ExpressionAddOperatorsK {

    fun addOperators(num: String, target: Int): List<String> {
        val result = ArrayList<String>()
        if (num.isEmpty()) {
            return result
        }
        backtrack(result, num.toCharArray(), target, 0, 0, 0, CharArray(num.length * 2), 0)
        return result
    }

    private fun backtrack(
        result: MutableList<String>,
        digits: CharArray,
        target: Int,
        index: Int,
        eval: Long,
        multed: Long,
        expression: CharArray,
        len: Int,
    ) {
        var length = len
        if (index == digits.size) {
            if (eval.toInt() == target) {
                result.add(String(expression, 0, length))
            }
            return
        }

        var current = 0L
        val operatorIndex = length
        if (index != 0) {
            length++
        }

        var i = index
        while (i < digits.size) {
            if (i > index && digits[index] == '0') {
                break
            }
            current = current * 10 + (digits[i] - '0')
            expression[length++] = digits[i]

            if (index == 0) {
                backtrack(result, digits, target, i + 1, current, current, expression, length)
            } else {
                expression[operatorIndex] = '+'
                backtrack(result, digits, target, i + 1, eval + current, current, expression, length)
                expression[operatorIndex] = '-'
                backtrack(result, digits, target, i + 1, eval - current, -current, expression, length)
                expression[operatorIndex] = '*'
                backtrack(
                    result,
                    digits,
                    target,
                    i + 1,
                    eval - multed + multed * current,
                    multed * current,
                    expression,
                    length,
                )
            }
            i++
        }
    }
}

