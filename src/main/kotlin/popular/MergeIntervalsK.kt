package popular

/**
 * Medium
 * Merge Intervals
 */
class MergeIntervalsK {

    fun merge(intervalsInput: Array<IntArray>): Array<IntArray> {
        val intervals = intervalsInput.copyOf()
        intervals.sortBy { it[0] }
        val merged = ArrayList<IntArray>()
        for (interval in intervals) {
            if (merged.isEmpty() || interval[0] > merged[merged.size - 1][1]) {
                merged.add(interval)
            } else {
                merged[merged.size - 1][1] = maxOf(merged[merged.size - 1][1], interval[1])
            }
        }
        return merged.toTypedArray()
    }
}

