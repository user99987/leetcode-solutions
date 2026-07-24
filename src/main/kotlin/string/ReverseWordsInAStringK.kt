package string

/**
 * Medium
 *
 * Given an input string s, reverse the order of the words, collapsing extra whitespace.
 */
class ReverseWordsInAStringK {

    fun reverseWords(s: String): String =
        s.trim().split(Regex("\\s+")).reversed().joinToString(" ")
}

