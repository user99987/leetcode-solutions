package array

/**
 * Easy
 *
 * Given an array nums containing n distinct numbers in the range [0, n], return the only number
 * in the range that is missing from the array.
 */
class MissingNumberK {

    fun missingNumber(nums: IntArray): Int {
        var result = nums.size
        for (i in nums.indices) {
            result = result xor i
            result = result xor nums[i]
        }
        return result
    }
}

