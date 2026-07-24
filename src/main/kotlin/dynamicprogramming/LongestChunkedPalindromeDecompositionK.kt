package dynamicprogramming

/**
 * Hard
 *
 * You are given a string text. You should split it to k substrings (subtext1, subtext2, ..., subtextk) such that:
 *
 * subtexti is a non-empty string.
 * The concatenation of all the substrings is equal to text (i.e., subtext1 + subtext2 + ... + subtextk == text).
 * subtexti == subtextk - i + 1 for all valid values of i (i.e., 1 <= i <= k).
 * Return the largest possible value of k.
 *
 * Example 1:
 *
 * Input: text = "ghiabcdefhelloadamhelloabcdefghi"
 *
 * Output: 7
 *
 * Explanation: We can split the string on "(ghi)(abcdef)(hello)(adam)(hello)(abcdef)(ghi)".
 *
 * Example 2:
 *
 * Input: text = "merchant"
 *
 * Output: 1
 *
 * Explanation: We can split the string on "(merchant)".
 *
 * Example 3:
 *
 * Input: text = "antaprezatepzapreanta"
 *
 * Output: 11
 *
 * Explanation: We can split the string on "(a)(nt)(a)(pre)(za)(tpe)(za)(pre)(a)(nt)(a)".
 *
 * Constraints:
 *
 * 1 <= text.length <= 1000
 * text consists only of lowercase English characters.
 */
class LongestChunkedPalindromeDecompositionK {
    private lateinit var dp: IntArray

    fun longestDecomposition(text: String): Int {
        dp = IntArray(text.length)
        return dp(0, text.length - 1, text)
    }

    private fun dp(i: Int, e: Int, text: String): Int {
        if (i > e) return 0
        if (i == e) return 1
        if (dp[i] > 0) return dp[i]

        for (j in e downTo i + 1) {
            if (text[j] == text[i]) {
                if (text.substring(j, e + 1) == text.substring(i, i + (e - j + 1))) {
                    dp[i] = maxOf(dp[i], dp(i + (e - j + 1), j - 1, text) + 2)
                }
            }
        }
        dp[i] = if (dp[i] == 0) 1 else dp[i]
        return dp[i]
    }
}

