package array

import kotlin.math.min

/**
 * Medium
 *
 * Given a list of 24-hour clock time points in "HH:MM" format, return the minimum minutes
 * difference between any two time-points in the list.
 */
class MinimumTimeDifferenceK {

    fun findMinDifference(timePoints: List<String>): Int {
        if (timePoints.size > 1440) {
            return 0
        }

        val seen = BooleanArray(1440)
        for (timePoint in timePoints) {
            val minutes = toMinutes(timePoint)
            if (seen[minutes]) {
                return 0
            }
            seen[minutes] = true
        }

        var first = -1
        var prev = -1
        var minDiff = Int.MAX_VALUE
        for (minute in seen.indices) {
            if (!seen[minute]) {
                continue
            }
            if (first == -1) {
                first = minute
            } else {
                minDiff = min(minDiff, minute - prev)
            }
            prev = minute
        }

        minDiff = min(minDiff, 1440 - prev + first)
        return minDiff
    }

    private fun toMinutes(timePoint: String): Int =
        ((timePoint[0] - '0') * 10 + (timePoint[1] - '0')) * 60 +
            (timePoint[3] - '0') * 10 +
            (timePoint[4] - '0')
}

