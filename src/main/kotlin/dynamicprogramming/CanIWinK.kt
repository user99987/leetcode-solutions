package dynamicprogramming

/**
 * Medium
 *
 * Given two integers maxChoosableInteger and desiredTotal, return true if the first player to
 * move can force a win, assuming both players play optimally.
 */
class CanIWinK {

    private val memo = HashMap<Int, Boolean>()

    fun canIWin(maxChoosableInteger: Int, desiredTotal: Int): Boolean {
        val sum = maxChoosableInteger * (maxChoosableInteger + 1) / 2
        if (desiredTotal <= 0) return true
        if (sum < desiredTotal) return false
        return dfs(0, maxChoosableInteger, desiredTotal)
    }

    private fun dfs(used: Int, max: Int, total: Int): Boolean {
        memo[used]?.let { return it }

        for (i in 1..max) {
            val cur = 1 shl (i - 1)
            if ((used and cur) == 0) {
                if (i >= total || !dfs(used or cur, max, total - i)) {
                    memo[used] = true
                    return true
                }
            }
        }
        memo[used] = false
        return false
    }
}

