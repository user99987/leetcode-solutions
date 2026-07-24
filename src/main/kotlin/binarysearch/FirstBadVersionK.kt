package binarysearch

/**
 * Easy
 *
 * Find the first bad version by binary search, minimizing calls to the API.
 */
class FirstBadVersionK {

    fun firstBadVersion(n: Int, bad: Int): Int {
        var low = 1
        var high = n
        while (low < high) {
            val mid = low + (high - low) / 2
            if (isBadVersion(mid, bad)) {
                high = mid
            } else {
                low = mid + 1
            }
        }
        return low
    }

    private fun isBadVersion(version: Int, bad: Int): Boolean = version >= bad
}

