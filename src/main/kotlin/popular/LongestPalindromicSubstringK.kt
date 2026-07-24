package popular

/**
 * Medium
 * Longest Palindromic Substring
 */
class LongestPalindromicSubstringK {

    fun longestPalindrome(s: String): String {
        var bestStart = 0
        var bestLength = 1

        for (center in s.indices) {
            val oddLength = expandAroundCenter(s, center, center)
            if (oddLength > bestLength) {
                bestLength = oddLength
                bestStart = center - oddLength / 2
            }

            val evenLength = expandAroundCenter(s, center, center + 1)
            if (evenLength > bestLength) {
                bestLength = evenLength
                bestStart = center - evenLength / 2 + 1
            }
        }
        return s.substring(bestStart, bestStart + bestLength)
    }

    private fun expandAroundCenter(s: String, leftStart: Int, rightStart: Int): Int {
        var left = leftStart
        var right = rightStart
        while (left >= 0 && right < s.length && s[left] == s[right]) {
            left--
            right++
        }
        return right - left - 1
    }
}

