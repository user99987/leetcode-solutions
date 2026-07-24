package dynamicprogramming

/**
 * Medium
 *
 * Given an integer n, return how many distinct phone numbers of length n we can dial using
 * knight jumps, modulo 10^9 + 7.
 */
class KnightDialerK {

    companion object {
        private val MAP: Array<IntArray> = arrayOf(
            intArrayOf(4, 6),
            intArrayOf(6, 8),
            intArrayOf(7, 9),
            intArrayOf(4, 8),
            intArrayOf(3, 9, 0),
            intArrayOf(),
            intArrayOf(1, 7, 0),
            intArrayOf(2, 6),
            intArrayOf(1, 3),
            intArrayOf(2, 4),
        )
        private val MEMO: MutableList<IntArray> = mutableListOf(intArrayOf(1, 1, 1, 1, 1, 0, 1, 1, 1, 1))
    }

    fun knightDialer(n: Int): Int {
        if (n == 1) return 10
        val mod = 1_000_000_007
        while (MEMO.size < n) {
            val cur = MEMO[MEMO.size - 1]
            val next = IntArray(10)
            for (i in 0 until 10) {
                for (d in MAP[i]) {
                    next[d] = (next[d] + cur[i]) % mod
                }
            }
            MEMO.add(next)
        }
        var sum = 0
        for (x in MEMO[n - 1]) {
            sum = (sum + x) % mod
        }
        return sum
    }
}

