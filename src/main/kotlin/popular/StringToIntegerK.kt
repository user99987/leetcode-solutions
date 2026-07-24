package popular

/**
 * Medium
 * String to Integer (atoi)
 */
class StringToIntegerK {

    fun myAtoi(sInput: String): Int {
        val s = sInput.trim()
        if (s.isEmpty()) return 0

        var sign = 1
        var index = 0
        var result = 0L

        if (s[0] == '-' || s[0] == '+') {
            sign = if (s[0] == '-') -1 else 1
            index++
        }

        while (index < s.length && Character.isDigit(s[index])) {
            result = result * 10 + (s[index++] - '0')
            if (result * sign > Int.MAX_VALUE) return Int.MAX_VALUE
            if (result * sign < Int.MIN_VALUE) return Int.MIN_VALUE
        }

        return (result * sign).toInt()
    }
}

