package string

/**
 * Easy
 *
 * Return the words that can be typed using letters of the alphabet on only one row of an
 * American keyboard.
 */
class KeyboardRowK {

    companion object {
        private val ROW1 = "qwertyuiop".toSet()
        private val ROW2 = "asdfghjkl".toSet()
        private val ROW3 = "zxcvbnm".toSet()
    }

    fun findWords(words: Array<String>): Array<String> =
        words.filter { word ->
            val lowerWord = word.lowercase()
            val row = getRow(lowerWord[0])
            lowerWord.all { it in row }
        }.toTypedArray()

    private fun getRow(ch: Char): Set<Char> =
        if (ch in ROW1) ROW1 else if (ch in ROW2) ROW2 else ROW3
}

