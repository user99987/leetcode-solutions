package dynamicprogramming

/**
 * Medium
 *
 * Given a string s, return the number of palindromic substrings in it.
 *
 * A string is a palindrome when it reads the same backward as forward.
 *
 * A substring is a contiguous sequence of characters within the string.
 *
 * Example 1:
 *
 * Input: s = "abc"
 *
 * Output: 3
 *
 * Explanation: Three palindromic strings: "a", "b", "c".
 *
 * Example 2:
 *
 * Input: s = "aaa"
 *
 * Output: 6
 *
 * Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
 *
 * Constraints:
 *
 * 1 <= s.length <= 1000
 * s consists of lowercase English letters.
 */
class PalindromicSubstringsK {

    fun countSubstrings(s: String): Int {
        var count = 0
        val chars = s.toCharArray()

        for (i in chars.indices) {
            count += expandAroundCenter(chars, i, i)
            count += expandAroundCenter(chars, i, i + 1)
        }

        return count
    }

    private fun expandAroundCenter(chars: CharArray, leftStart: Int, rightStart: Int): Int {
        var count = 0
        var left = leftStart
        var right = rightStart
        while (left >= 0 && right < chars.size && chars[left] == chars[right]) {
            count++
            left--
            right++
        }
        return count
    }
}

