package bitmanipulation

/**
 * Medium
 *
 * Given an integer n, return any valid n-bit gray code sequence.
 */
class GrayCodeK {

    fun grayCode(n: Int): List<Int> {
        val result = ArrayList<Int>()
        for (i in 0 until (1 shl n)) {
            result.add(i xor (i shr 1))
        }
        return result
    }
}

