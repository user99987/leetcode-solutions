package backtracking

/**
 * Medium
 *
 * Given a string s, transform every letter individually to lowercase or uppercase to create
 * all possible strings.
 */
class LetterCasePermutationK {

    fun letterCasePermutation(s: String): List<String> {
        val result = ArrayList<String>()
        backtrack(s.toCharArray(), 0, result)
        return result
    }

    private fun backtrack(s: CharArray, index: Int, result: MutableList<String>) {
        if (index == s.size) {
            result.add(String(s))
            return
        }
        backtrack(s, index + 1, result)
        if (s[index].isLetter()) {
            s[index] = (s[index].code xor 32).toChar()
            backtrack(s, index + 1, result)
            s[index] = (s[index].code xor 32).toChar()
        }
    }
}

