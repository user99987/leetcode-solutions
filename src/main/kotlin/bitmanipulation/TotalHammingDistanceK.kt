package bitmanipulation

/**
 * Medium
 *
 * Given an integer array nums, return the sum of Hamming distances between all the pairs of the
 * integers in nums.
 */
class TotalHammingDistanceK {

    fun totalHammingDistance(nums: IntArray): Int {
        var total = 0
        val n = nums.size
        for (i in 0 until 32) {
            var countOnes = 0
            for (num in nums) {
                countOnes += (num shr i) and 1
            }
            total += countOnes * (n - countOnes)
        }
        return total
    }
}

