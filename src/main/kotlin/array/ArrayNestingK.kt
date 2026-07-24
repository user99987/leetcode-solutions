package array

import kotlin.math.max

/**
 * Medium
 *
 * Return the longest length of a set s[k] built by repeatedly following nums[k] until a
 * duplicate would occur.
 */
class ArrayNestingK {

    fun arrayNesting(input: IntArray): Int {
        val nums = input
        var maxLen = 0

        for (i in nums.indices) {
            if (nums[i] == -1) {
                continue
            }

            var currentIndex = i
            var currentLength = 0

            while (nums[currentIndex] != -1) {
                val nextIndex = nums[currentIndex]
                nums[currentIndex] = -1
                currentIndex = nextIndex
                currentLength++
            }

            maxLen = max(maxLen, currentLength)
        }

        return maxLen
    }
}

