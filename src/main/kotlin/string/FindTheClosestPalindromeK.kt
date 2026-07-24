package string

import kotlin.math.abs
import kotlin.math.min

/**
 * Hard
 *
 * Given a string n representing an integer, return the closest integer (not including itself),
 * which is a palindrome. If there is a tie, return the smaller one.
 */
class FindTheClosestPalindromeK {

    fun nearestPalindromic(n: String): String {
        if (n.length == 1) return (n.toInt() - 1).toString()
        var p1: String
        var p2: String
        val palindrome: String
        if (isPalindrome(n)) {
            var newFirstHalf: String
            if (n.length % 2 == 0) {
                val firstHalf = n.substring(0, n.length / 2)
                newFirstHalf = (firstHalf.toLong() - 1).toString()
                p1 = newFirstHalf + newFirstHalf.reversed()
                newFirstHalf = (firstHalf.toLong() + 1).toString()
                p2 = newFirstHalf + newFirstHalf.reversed()
            } else {
                val firstHalf = n.substring(0, n.length / 2)
                val middle = n[n.length / 2]
                p1 = if (middle == '0') {
                    firstHalf + "1" + firstHalf.reversed()
                } else {
                    firstHalf + (middle.toString().toInt() - 1) + firstHalf.reversed()
                }
                newFirstHalf = (firstHalf.toLong() + 1).toString()
                p2 = newFirstHalf + "0" + newFirstHalf.reversed()
            }
        } else {
            val firstHalf = n.substring(0, n.length / 2)
            if (n.length % 2 == 0) {
                p1 = firstHalf + firstHalf.reversed()
                var temp = (firstHalf.toLong() + 1).toString()
                p2 = temp + temp.reversed()
                temp = (firstHalf.toLong() - 1).toString()
                val p3 = temp + temp.reversed()
                p1 = if (abs(p3.toLong() - n.toLong()) <= abs(p1.toLong() - n.toLong())) p3 else p1
            } else {
                val middle = n[n.length / 2]
                p1 = firstHalf + middle + firstHalf.reversed()
                val temp = (firstHalf.toLong() + 1).toString()
                p2 = temp + "0" + temp.reversed()
                val p3 = firstHalf + (middle.toString().toInt() + 1) + firstHalf.reversed()
                var p4: String? = null
                if (middle != '0') {
                    p4 = firstHalf + (middle.toString().toInt() - 1) + firstHalf.reversed()
                }
                p1 = if (abs(p1.toLong() - n.toLong()) <= abs(p3.toLong() - n.toLong())) p1 else p3
                if (p4 != null) {
                    p1 = if (abs(p4.toLong() - n.toLong()) <= abs(p1.toLong() - n.toLong())) p4 else p1
                }
            }
        }
        val l1 = abs(n.toLong() - p1.toLong())
        val l2 = abs(n.toLong() - p2.toLong())
        palindrome = if (l1 <= l2) p1 else p2
        val m1 = abs(getLow(n).toLong() - n.toLong())
        val m2 = abs(palindrome.toLong() - n.toLong())
        val m3 = abs(getHigh(n).toLong() - n.toLong())
        val minVal = min(min(m1, m2), m3)
        return when (minVal) {
            m1 -> getLow(n)
            m2 -> palindrome
            else -> getHigh(n)
        }
    }

    private fun getLow(s: String): String {
        val n = s.length - 1
        return "9".repeat(maxOf(0, n))
    }

    private fun getHigh(s: String): String {
        val n = s.length - 1
        return "1" + "0".repeat(maxOf(0, n)) + "1"
    }

    private fun isPalindrome(s: String): Boolean {
        var i = 0
        var j = s.length - 1
        while (i < j) {
            if (s[i] != s[j]) {
                return false
            }
            i++
            j--
        }
        return true
    }
}

