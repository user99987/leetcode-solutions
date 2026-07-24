package string

/**
 * Easy
 *
 * Given a string s, find the first non-repeating character in it and return its index. If it
 * does not exist, return -1.
 */
class FirstUniqueCharacterInAStringK {

    fun firstUniqChar(s: String): Int {
        val frequencies = IntArray(26)
        for (c in s) {
            frequencies[c - 'a']++
        }
        for (i in s.indices) {
            if (frequencies[s[i] - 'a'] == 1) {
                return i
            }
        }
        return -1
    }
}

