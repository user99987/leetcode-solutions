package popular

/**
 * Medium
 * Pow(x, n)
 */
class PowXNK {

    fun myPow(xInput: Double, n: Int): Double {
        var x = xInput
        var exp = n.toLong()
        if (exp < 0) {
            x = 1 / x
            exp = -exp
        }
        var result = 1.0
        while (exp > 0) {
            if ((exp and 1L) == 1L) {
                result *= x
            }
            x *= x
            exp = exp shr 1
        }
        return result
    }
}

