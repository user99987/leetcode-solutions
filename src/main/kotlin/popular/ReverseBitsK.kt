package popular

/**
 * Easy
 * Reverse Bits
 */
class ReverseBitsK {

    fun reverseBits(nInput: Int): Int {
        var n = nInput
        var result = 0
        for (i in 0 until 32) {
            result = (result shl 1) or (n and 1)
            n = n ushr 1
        }
        return result
    }
}

