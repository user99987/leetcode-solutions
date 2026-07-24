package string

/**
 * Medium
 *
 * Given two non-negative integers num1 and num2 represented as strings, return the product of
 * num1 and num2, also represented as a string, without using BigInteger.
 */
class MultiplyStringsK {

    fun multiply(num1: String, num2: String): String {
        if (num1 == "0" || num2 == "0") return "0"

        val len1 = num1.length
        val len2 = num2.length
        val result = IntArray(len1 + len2)

        for (i in 0 until len1) {
            for (j in 0 until len2) {
                val product = (num1[len1 - 1 - i] - '0') * (num2[len2 - 1 - j] - '0')
                val sum = product + result[len1 + len2 - 1 - (i + j)]

                result[len1 + len2 - 1 - (i + j)] = sum % 10
                result[len1 + len2 - 2 - (i + j)] += sum / 10
            }
        }

        val sb = StringBuilder()
        var started = false
        for (digit in result) {
            if (!started && digit == 0) continue
            started = true
            sb.append(digit)
        }
        return sb.toString()
    }
}

