package popular

/**
 * Medium
 * Longest Substring Without Repeating Characters
 */
class LongestSubstringWithoutRepeatingCharactersK {

    fun lengthOfLongestSubstring(s: String): Int {
        val map = HashMap<Char, Int>()
        var start = 0
        var best = 0
        for (end in s.indices) {
            val ch = s[end]
            if (map.containsKey(ch) && map[ch]!! >= start) {
                start = map[ch]!! + 1
            }
            map[ch] = end
            best = maxOf(best, end - start + 1)
        }
        return best
    }
}

