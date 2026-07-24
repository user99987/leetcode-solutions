package popular

/**
 * Medium
 * Letter CombinationsK of a Phone Number
 */
class LetterCombinationsOfPhoneNumberK {

    fun letterCombinations(digits: String): List<String> {
        if (digits.isEmpty()) return ArrayList()
        var result = listOf("")
        for (d in digits) {
            val letters = DIGIT_TO_CHAR_MAPPING[d]!!
            result = result.flatMap { prefix -> letters.map { prefix + it } }
        }
        return result
    }

    companion object {
        private val DIGIT_TO_CHAR_MAPPING = mapOf(
            '2' to "abc", '3' to "def", '4' to "ghi", '5' to "jkl",
            '6' to "mno", '7' to "pqrs", '8' to "tuv", '9' to "wxyz"
        )
    }
}

