package string

/**
 * Easy
 *
 * Return the sum of lengths of all good strings in words, where a string is good if it can be
 * formed by characters from chars (each character used once).
 */
class FindWordsThatCanBeFormedByCharactersK {

    fun countCharacters(words: Array<String>, chars: String): Int {
        val available = IntArray(26)
        for (c in chars) {
            available[c - 'a']++
        }

        var totalLength = 0
        for (word in words) {
            if (canForm(word, available)) {
                totalLength += word.length
            }
        }
        return totalLength
    }

    private fun canForm(word: String, available: IntArray): Boolean {
        val remaining = available.copyOf()
        for (c in word) {
            remaining[c - 'a']--
            if (remaining[c - 'a'] < 0) {
                return false
            }
        }
        return true
    }
}

