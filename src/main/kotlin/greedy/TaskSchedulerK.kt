package greedy

import kotlin.math.max

/**
 * Medium
 *
 * Return the least number of units of time that the CPU will take to finish all the given tasks,
 * respecting the n-unit cooldown period between two same tasks.
 */
class TaskSchedulerK {

    fun leastInterval(tasks: CharArray, n: Int): Int {
        if (n == 0) {
            return tasks.size
        }

        val frequency = IntArray(26)
        var maxFreq = 0
        var maxCount = 0

        for (task in tasks) {
            val index = task - 'A'
            frequency[index]++
            if (frequency[index] > maxFreq) {
                maxFreq = frequency[index]
                maxCount = 1
            } else if (frequency[index] == maxFreq) {
                maxCount++
            }
        }

        return max(tasks.size, (maxFreq - 1) * (n + 1) + maxCount)
    }
}

