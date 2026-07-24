package array

import kotlin.math.max
import kotlin.math.min

/**
 * Medium
 *
 * Insert newInterval into intervals such that intervals is still sorted in ascending order by
 * starti and intervals still does not have any overlapping intervals.
 */
class InsertIntervalK {

    fun insert(intervals: Array<IntArray>, newInterval: IntArray): Array<IntArray> {
        val result = ArrayList<IntArray>()
        var i = 0

        while (i < intervals.size && intervals[i][1] < newInterval[0]) {
            result.add(intervals[i])
            i++
        }

        val merged = newInterval.copyOf()
        while (i < intervals.size && intervals[i][0] <= merged[1]) {
            merged[0] = min(merged[0], intervals[i][0])
            merged[1] = max(merged[1], intervals[i][1])
            i++
        }

        result.add(merged)

        while (i < intervals.size) {
            result.add(intervals[i])
            i++
        }

        return result.toTypedArray()
    }
}

