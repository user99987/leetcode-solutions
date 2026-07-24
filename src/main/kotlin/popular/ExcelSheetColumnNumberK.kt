package popular

/**
 * Easy
 * Excel Sheet Column Number
 */
class ExcelSheetColumnNumberK {

    fun titleToNumber(s: String): Int {
        var num = 0
        var pow = 0
        for (i in s.length - 1 downTo 0) {
            num += Math.pow(26.0, pow++.toDouble()).toInt() * (s[i] - 'A' + 1)
        }
        return num
    }
}

