package popular

/**
 * Hard
 * Minimum Window Substring
 */
class MinimumWindowSubstringK {

    fun minWindow(s: String, t: String): String {
        val tFreq = HashMap<Char, Int>()
        for (c in t) tFreq.merge(c, 1) { a, b -> a + b }

        val sFreq = HashMap<Char, Int>()
        var left = 0
        var minLength = Int.MAX_VALUE
        var minStart = 0
        var matched = 0

        for (right in s.indices) {
            val ch = s[right]
            sFreq.merge(ch, 1) { a, b -> a + b }
            if (tFreq.containsKey(ch) && sFreq[ch] == tFreq[ch]) {
                matched++
            }

            while (matched == tFreq.size) {
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1
                    minStart = left
                }
                val leftChar = s[left++]
                if (tFreq.containsKey(leftChar) && sFreq[leftChar] == tFreq[leftChar]) {
                    matched--
                }
                sFreq.merge(leftChar, -1) { a, b -> a + b }
                sFreq.remove(leftChar, 0)
            }
        }

        return if (minLength == Int.MAX_VALUE) "" else s.substring(minStart, minStart + minLength)
    }
}

