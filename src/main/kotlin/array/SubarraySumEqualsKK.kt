package array

/**
 * Medium
 *
 * Given an array of integers nums and an integer k, return the total number of continuous
 * subarrays whose sum equals to k.
 */
class SubarraySumEqualsKK {

    fun subarraySum(nums: IntArray, k: Int): Int {
        var count = 0
        var sum = 0
        val prefixSum = HashMap<Int, Int>()
        prefixSum[0] = 1

        for (num in nums) {
            sum += num
            count += prefixSum.getOrDefault(sum - k, 0)
            prefixSum[sum] = prefixSum.getOrDefault(sum, 0) + 1
        }

        return count
    }
}

