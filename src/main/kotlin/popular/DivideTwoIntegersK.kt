package popular

/**
 * Medium
 * Divide Two Integers
 */
class DivideTwoIntegersK {

    fun divide(dividend: Int, divisor: Int): Int {
        val isNegative = (dividend > 0) != (divisor > 0)
        var dividendAbs = Math.abs(dividend.toLong())
        val divisorAbs = Math.abs(divisor.toLong())
        var result = 0L

        while (dividendAbs >= divisorAbs) {
            var temp = divisorAbs
            var count = 1L
            while (dividendAbs >= (temp shl 1)) {
                temp = temp shl 1
                count = count shl 1
            }
            dividendAbs -= temp
            result += count
        }

        result = if (isNegative) -result else result
        return minOf(maxOf(result, Int.MIN_VALUE.toLong()), Int.MAX_VALUE.toLong()).toInt()
    }
}

