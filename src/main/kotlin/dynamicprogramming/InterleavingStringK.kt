package dynamicprogramming

/**
 * Medium
 *
 * Given strings s1, s2, and s3, find whether s3 is formed by an interleaving of s1 and s2.
 */
class InterleavingStringK {

    fun isInterleave(s1: String, s2: String, s3: String): Boolean {
        if (s3.length != s1.length + s2.length) return false

        val dp = BooleanArray(s2.length + 1)
        dp[0] = true

        for (j in 1..s2.length) {
            dp[j] = dp[j - 1] && s2[j - 1] == s3[j - 1]
        }
        for (i in 1..s1.length) {
            dp[0] = dp[0] && s1[i - 1] == s3[i - 1]
            for (j in 1..s2.length) {
                val target = s3[i + j - 1]
                dp[j] = (dp[j] && s1[i - 1] == target) || (dp[j - 1] && s2[j - 1] == target)
            }
        }
        return dp[s2.length]
    }
}

