package string

/**
 * Medium
 *
 * Given two strings s1 and s2, return true if s2 contains a permutation of s1.
 */
class PermutationInStringK {

    fun checkInclusion(s1: String, s2: String): Boolean {
        val n = s1.length
        val m = s2.length
        if (n > m) return false

        val cntS1 = IntArray(26)
        val cntS2 = IntArray(26)

        for (i in 0 until n) {
            cntS1[s1[i] - 'a']++
            cntS2[s2[i] - 'a']++
        }

        if (cntS1.contentEquals(cntS2)) return true

        for (i in n until m) {
            cntS2[s2[i - n] - 'a']--
            cntS2[s2[i] - 'a']++
            if (cntS1.contentEquals(cntS2)) return true
        }
        return false
    }
}

