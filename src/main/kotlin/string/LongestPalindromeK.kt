package string

/**
 * Easy
 *
 * Given a string s which consists of lowercase or uppercase letters, return the length of the
 * longest palindrome that can be built with those letters.
 */
class LongestPalindromeK {

    fun longestPalindrome(s: String): Int {
        val frequencies = IntArray(128)
        for (c in s) {
            frequencies[c.code]++
        }

        var palindromeLength = 0
        var hasOddFrequency = false
        for (frequency in frequencies) {
            palindromeLength += frequency / 2 * 2
            if ((frequency and 1) == 1) {
                hasOddFrequency = true
            }
        }
        return if (hasOddFrequency) palindromeLength + 1 else palindromeLength
    }
}

