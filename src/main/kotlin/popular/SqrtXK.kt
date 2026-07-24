package popular

/**
 * Easy
 * Sqrt(x)
 */
class SqrtXK {

    fun mySqrt(x: Int): Int {
        var start = 0
        var end = x
        var result = 0L
        while (start <= end) {
            val mid = start + (end - start) / 2L
            val square = mid * mid
            if (square <= x) {
                start = (mid + 1).toInt()
                result = mid
            } else {
                end = (mid - 1).toInt()
            }
        }
        return result.toInt()
    }
}

