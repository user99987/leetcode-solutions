package twopointers

/**
 * Hard
 *
 * Given an integer array nums and an integer k, return the number of good subarrays of nums,
 * where a good array has exactly k different integers.
 */
class SubarraysWithKDifferentIntegersK {

    fun subarraysWithKDistinct(nums: IntArray, k: Int): Int =
        atMostKDistinct(nums, k) - atMostKDistinct(nums, k - 1)

    private fun atMostKDistinct(nums: IntArray, k: Int): Int {
        val countMap = HashMap<Int, Int>()
        var left = 0
        var count = 0

        for (right in nums.indices) {
            countMap.merge(nums[right], 1, Int::plus)
            while (countMap.size > k) {
                val value = countMap[nums[left]]!!
                if (value == 1) {
                    countMap.remove(nums[left])
                } else {
                    countMap[nums[left]] = value - 1
                }
                left++
            }
            count += right - left + 1
        }
        return count
    }
}

