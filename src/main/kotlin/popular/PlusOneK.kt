package popular

/**
 * Easy
 * Plus One
 */
class PlusOneK {

    fun plusOne(digits: IntArray): IntArray {
        var carry = 1
        var i = digits.size - 1
        while (i >= 0 && carry > 0) {
            digits[i] = (digits[i] + carry) % 10
            carry = if (digits[i] == 0) 1 else 0
            i--
        }
        return if (carry == 1) intArrayOf(1, *digits) else digits
    }
}

