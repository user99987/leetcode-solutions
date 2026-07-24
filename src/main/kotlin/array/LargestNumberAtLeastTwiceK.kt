package array

/**
 * Easy
 *
 * Determine whether the largest element in the array is at least twice as much as every other
 * number in the array. If it is, return the index of the largest element, or return -1 otherwise.
 */
class LargestNumberAtLeastTwiceK {

    fun dominantIndex(nums: IntArray): Int {
        var maxIndex = 0
        for (i in nums.indices) {
            if (nums[i] > nums[maxIndex]) maxIndex = i
        }

        for (i in nums.indices) {
            if (i != maxIndex && nums[i] * 2 > nums[maxIndex]) return -1
        }

        return maxIndex
    }
}

