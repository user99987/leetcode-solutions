package greedy

import kotlin.math.max
import kotlin.math.min

/**
 * Medium
 *
 * Given two integers a and b, return any string s of length a + b containing exactly a 'a'
 * letters and b 'b' letters, with no "aaa" or "bbb" substring.
 */
class StringWithout3A3BK {

    fun strWithout3a3b(a: Int, b: Int): String {
        val result = StringBuilder()
        val first = if (a >= b) 'a' else 'b'
        val second = if (first == 'a') 'b' else 'a'
        var firstCount = max(a, b)
        var secondCount = min(a, b)

        while (firstCount > 0 || secondCount > 0) {
            if (firstCount > secondCount) {
                result.append(first)
                firstCount--
                if (firstCount > secondCount) {
                    result.append(first)
                    firstCount--
                }
            }
            if (secondCount > 0) {
                result.append(second)
                secondCount--
            }
        }
        return result.toString()
    }
}

