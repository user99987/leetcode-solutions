package greedy

import kotlin.math.max

/**
 * Medium
 *
 * Partition the string into as many parts as possible so that each letter appears in at most one
 * part. Return a list of integers representing the size of these parts.
 */
class PartitionLabelsK {

    fun partitionLabels(s: String): List<Int> {
        val lastPosition = IntArray(26)
        val result = ArrayList<Int>()

        for (i in s.indices) {
            lastPosition[s[i] - 'a'] = i
        }

        var maxEnd = 0
        var prev = -1
        for (i in s.indices) {
            maxEnd = max(maxEnd, lastPosition[s[i] - 'a'])
            if (i == maxEnd) {
                result.add(i - prev)
                prev = i
            }
        }
        return result
    }
}

