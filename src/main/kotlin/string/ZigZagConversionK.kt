package string

/**
 * Medium
 *
 * Convert a string into its zigzag pattern representation across the given number of rows, read
 * line by line.
 */
class ZigZagConversionK {

    fun convert(s: String, numRows: Int): String {
        if (numRows == 1 || s.length <= numRows) return s

        val rows = Array(numRows) { StringBuilder() }

        var row = 0
        var step = 1
        for (c in s) {
            rows[row].append(c)
            if (row == 0) step = 1 else if (row == numRows - 1) step = -1
            row += step
        }

        return rows.joinToString("") { it.toString() }
    }
}

