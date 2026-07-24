package heap

/**
 * Hard
 *
 * Return the rotation index k that corresponds to the highest score we can achieve if we
 * rotated nums by it. If there are multiple answers, return the smallest such index k.
 */
class SmallestRotationWithHighestScoreK {

    fun bestRotation(nums: IntArray): Int {
        val n = nums.size
        val change = IntArray(n)
        var maxIndex = 0

        for (i in 0 until n) {
            change[(i - nums[i] + 1 + n) % n]--
        }

        for (i in 1 until n) {
            change[i] += change[i - 1] + 1
            if (change[i] > change[maxIndex]) {
                maxIndex = i
            }
        }

        return maxIndex
    }
}

