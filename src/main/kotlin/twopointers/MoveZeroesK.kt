package twopointers

/**
 * Easy
 *
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative
 * order of the non-zero elements, in-place.
 */
class MoveZeroesK {

    fun moveZeroes(nums: IntArray) {
        var index = 0
        for (i in nums.indices) {
            if (nums[i] != 0) {
                val temp = nums[index]
                nums[index] = nums[i]
                nums[i] = temp
                index++
            }
        }
    }
}

