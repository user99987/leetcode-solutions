package popular

/**
 * Medium
 * Reverse Integer
 */
class ReverseIntegerK {

    fun reverse(xInput: Int): Int {
        var x = xInput
        var reverse = 0
        while (x != 0) {
            val rem = x % 10
            x /= 10
            if (reverse > Int.MAX_VALUE / 10 || (reverse == Int.MAX_VALUE / 10 && rem > 7)) {
                return 0
            }
            if (reverse < Int.MIN_VALUE / 10 || (reverse == Int.MIN_VALUE / 10 && rem < -8)) {
                return 0
            }
            reverse = reverse * 10 + rem
        }
        return reverse
    }
}

