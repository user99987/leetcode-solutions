package string

/**
 * Medium
 *
 * Return the minimum number of times you should repeat string a so that string b is a
 * substring of it, or -1 if impossible.
 */
class RepeatedSubstringPatternK {

    fun repeatedStringMatch(a: String, b: String): Int {
        if (b.any { a.indexOf(it) == -1 }) return -1

        val sb = StringBuilder(a)
        var repeatCount = 1
        while (sb.length < b.length) {
            sb.append(a)
            repeatCount++
        }
        return when {
            sb.contains(b) -> repeatCount
            sb.append(a).contains(b) -> repeatCount + 1
            else -> -1
        }
    }
}

