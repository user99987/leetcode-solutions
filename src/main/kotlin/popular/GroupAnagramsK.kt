package popular

/**
 * Medium
 * Group Anagrams
 */
class GroupAnagramsK {

    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        return strs.groupBy { getCodedString(it) }.values.toList()
    }

    companion object {
        fun getCodedString(s: String): String {
            return s.toCharArray().sorted().joinToString("")
        }
    }
}

