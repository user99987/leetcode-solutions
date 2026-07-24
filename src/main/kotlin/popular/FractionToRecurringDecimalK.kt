package popular

/**
 * Medium
 * Fraction to Recurring Decimal
 */
class FractionToRecurringDecimalK {

    fun fractionToDecimal(numerator: Int, denominator: Int): String {
        if (numerator == 0) {
            return "0"
        }
        val sb = StringBuilder()
        if ((numerator > 0) != (denominator > 0)) {
            sb.append("-")
        }
        val num = Math.abs(numerator.toLong())
        val den = Math.abs(denominator.toLong())
        sb.append(num / den)
        var remainder = num % den
        if (remainder == 0L) {
            return sb.toString()
        }
        sb.append(".")
        val map = HashMap<Long, Int>()
        while (remainder != 0L) {
            if (map.containsKey(remainder)) {
                sb.insert(map[remainder]!!, "(")
                sb.append(")")
                break
            }
            map[remainder] = sb.length
            remainder *= 10
            sb.append(remainder / den)
            remainder %= den
        }
        return sb.toString()
    }
}

