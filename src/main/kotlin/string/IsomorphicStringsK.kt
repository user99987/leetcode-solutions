package string

/**
 * Easy
 *
 * Given two strings s and t, determine if they are isomorphic.
 */
class IsomorphicStringsK {

    fun isIsomorphic(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        val forwardMap = HashMap<Char, Char>()
        val reverseMap = HashMap<Char, Char>()

        for (i in s.indices) {
            val source = s[i]
            val target = t[i]

            if (forwardMap.getOrDefault(source, target) != target ||
                reverseMap.getOrDefault(target, source) != source
            ) {
                return false
            }

            forwardMap[source] = target
            reverseMap[target] = source
        }
        return true
    }
}

