package twopointers

/**
 * Medium
 *
 * Given a string s and an array of strings words, return the number of words[i] that is a
 * subsequence of s.
 */
class NumberOfMatchingSubsequencesK {

    fun numMatchingSubseq(s: String, words: Array<String>): Int =
        words.count { isSubsequence(s, it) }

    private fun isSubsequence(s: String, word: String): Boolean {
        var index = -1
        for (c in word) {
            index = s.indexOf(c, index + 1)
            if (index == -1) return false
        }
        return true
    }
}

