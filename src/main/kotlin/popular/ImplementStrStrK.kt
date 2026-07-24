package popular

/**
 * Easy
 * Implement strStr()
 */
class ImplementStrStrK {

    fun strStr(haystack: String, needle: String): Int {
        if (needle.isEmpty()) {
            return 0
        }
        val lps = buildLps(needle)
        var haystackIndex = 0
        var needleIndex = 0

        while (haystackIndex < haystack.length) {
            if (haystack[haystackIndex] == needle[needleIndex]) {
                haystackIndex++
                needleIndex++
                if (needleIndex == needle.length) {
                    return haystackIndex - needleIndex
                }
            } else if (needleIndex > 0) {
                needleIndex = lps[needleIndex - 1]
            } else {
                haystackIndex++
            }
        }
        return -1
    }

    private fun buildLps(pattern: String): IntArray {
        val lps = IntArray(pattern.length)
        var prefixLength = 0

        var i = 1
        while (i < pattern.length) {
            if (pattern[i] == pattern[prefixLength]) {
                prefixLength++
                lps[i++] = prefixLength
            } else if (prefixLength > 0) {
                prefixLength = lps[prefixLength - 1]
            } else {
                lps[i++] = 0
            }
        }
        return lps
    }
}

