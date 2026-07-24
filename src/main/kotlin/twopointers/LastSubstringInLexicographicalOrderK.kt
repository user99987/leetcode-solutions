package twopointers

import kotlin.math.max

/**
 * Hard
 *
 * Given a string s, return the last substring of s in lexicographical order.
 */
class LastSubstringInLexicographicalOrderK {

    fun lastSubstring(s: String): String {
        var i = 0
        var j = 1
        var k = 0
        val n = s.length
        val array = s.toCharArray()
        while (j + k < n) {
            if (array[i + k] == array[j + k]) {
                k++
            } else if (array[i + k] > array[j + k]) {
                j = j + k + 1
                k = 0
            } else {
                i = max(i + k + 1, j)
                j = i + 1
                k = 0
            }
        }
        return s.substring(i)
    }
}

