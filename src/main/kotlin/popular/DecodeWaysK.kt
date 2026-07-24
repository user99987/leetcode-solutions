package popular

/**
 * Medium
 * Decode Ways
 */
class DecodeWaysK {

    fun numDecodings(s: String): Int {
        if (s[0] == '0') {
            return 0
        }
        val n = s.length
        val dp = IntArray(n + 1)
        dp[0] = 1
        dp[1] = 1

        for (i in 2..n) {
            if (s[i - 1] != '0') {
                dp[i] = dp[i - 1]
            }
            val num = (s[i - 2] - '0') * 10 + (s[i - 1] - '0')
            if (num in 10..26) {
                dp[i] += dp[i - 2]
            }
        }
        return dp[n]
    }
}

