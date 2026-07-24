package string

/**
 * Hard
 *
 * Return the shortest palindrome you can find by adding characters in front of s.
 */
class ShortestPalindromeK {

    fun shortestPalindrome(s: String): String {
        val reversed = s.reversed()
        val combined = "$s#$reversed"
        val lps = IntArray(combined.length)

        var length = 0
        for (i in 1 until combined.length) {
            while (length > 0 && combined[i] != combined[length]) {
                length = lps[length - 1]
            }
            if (combined[i] == combined[length]) {
                length++
            }
            lps[i] = length
        }

        return reversed.substring(0, s.length - lps[combined.length - 1]) + s
    }
}

