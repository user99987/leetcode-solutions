package dynamicprogramming

/**
 * Hard
 *
 * Given an array of strings words, return all the concatenated words, where a concatenated word
 * is comprised entirely of at least two shorter words in the given array.
 */
class ConcatenatedWordsK {

    fun findAllConcatenatedWordsInADict(words: Array<String>): List<String> {
        val dictionary = HashSet(words.toList())
        val result = ArrayList<String>()

        for (word in words) {
            if (word.isNotEmpty() && canForm(word, dictionary)) {
                result.add(word)
            }
        }
        return result
    }

    private fun canForm(word: String, dictionary: MutableSet<String>): Boolean {
        dictionary.remove(word)
        val n = word.length
        val dp = BooleanArray(n + 1)
        dp[0] = true

        for (i in 1..n) {
            for (j in 0 until i) {
                if (dp[j] && dictionary.contains(word.substring(j, i))) {
                    dp[i] = true
                    break
                }
            }
        }
        dictionary.add(word)
        return dp[n]
    }
}

