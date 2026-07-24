package string

/**
 * Medium
 *
 * Given an integer n, return the largest number that is less than or equal to n with monotone
 * increasing digits.
 */
class MonotoneIncreasingDigitsK {

    fun monotoneIncreasingDigits(n: Int): Int {
        val digits = n.toString().toCharArray()
        var marker = digits.size
        for (i in digits.size - 1 downTo 1) {
            if (digits[i] < digits[i - 1]) {
                digits[i - 1]--
                marker = i
            }
        }
        for (i in marker until digits.size) {
            digits[i] = '9'
        }
        return String(digits).toInt()
    }
}

