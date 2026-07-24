package dynamicprogramming

/**
 * Hard
 *
 * Given two strings s and t, return the number of distinct subsequences of s which equal t.
 */
class DistinctSubsequencesK {

    fun numDistinct(s: String, t: String): Int {
        val tLength = t.length
        val dp = LongArray(tLength + 1)
        dp[0] = 1

        for (i in s.indices) {
            for (j in tLength - 1 downTo 0) {
                if (s[i] == t[j]) {
                    dp[j + 1] += dp[j]
                }
            }
        }
        return dp[tLength].toInt()
    }
}

