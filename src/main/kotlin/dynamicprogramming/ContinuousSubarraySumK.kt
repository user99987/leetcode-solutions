package dynamicprogramming

/**
 * Medium
 *
 * Return true if nums has a continuous subarray of size at least two whose elements sum up to a
 * multiple of k, or false otherwise.
 */
class ContinuousSubarraySumK {

    fun checkSubarraySum(nums: IntArray, k: Int): Boolean {
        val remainderMap = HashMap<Int, Int>()
        remainderMap[0] = -1
        var sum = 0

        for (i in nums.indices) {
            sum += nums[i]
            var remainder = sum % k
            if (remainder < 0) remainder += k

            val prevIndex = remainderMap[remainder]
            if (prevIndex != null) {
                if (i - prevIndex > 1) {
                    return true
                }
            } else {
                remainderMap[remainder] = i
            }
        }
        return false
    }
}

