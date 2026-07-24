package popular

/**
 * Medium
 * Longest Consecutive Sequence
 */
class LongestConsecutiveSequenceK {

    fun longestConsecutive(nums: IntArray): Int {
        val numSet = nums.toHashSet()
        var best = 0
        for (numStart in nums) {
            if (!numSet.contains(numStart - 1)) {
                var num = numStart
                var length = 1
                while (numSet.contains(num + 1)) {
                    num++
                    length++
                }
                best = maxOf(best, length)
            }
        }
        return best
    }
}

