package popular

/**
 * Easy
 * Roman to Integer
 */
class RomanToIntegerK {

    fun romanToInt(s: String): Int {
        var sum = 0
        for (i in s.indices) {
            val curr = ROMAN_MAP[s[i]]!!
            val next = if (i < s.length - 1) ROMAN_MAP[s[i + 1]]!! else 0
            sum += if (curr < next) -curr else curr
        }
        return sum
    }

    companion object {
        private val ROMAN_MAP = mapOf(
            'I' to 1, 'V' to 5, 'X' to 10, 'L' to 50,
            'C' to 100, 'D' to 500, 'M' to 1000
        )
    }
}

