package bitmanipulation

/**
 * Easy
 *
 * Given a positive integer, check whether it has alternating bits.
 */
class BinaryNumberWithAlternatingBitsK {

    fun hasAlternatingBits(n: Int): Boolean {
        var num = n
        var prev = -1
        while (num > 0) {
            val current = num and 1
            if (current == prev) {
                return false
            }
            prev = current
            num = num shr 1
        }
        return true
    }
}

