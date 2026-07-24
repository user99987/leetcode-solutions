package popular

/**
 * Easy
 * Longest Common Prefix
 */
class LongestCommonPrefixK {

    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) return ""
        return strs.reduce { a, b ->
            var i = 0
            while (i < a.length && i < b.length && a[i] == b[i]) i++
            a.substring(0, i)
        }
    }
}

