package array

/**
 * Medium
 *
 * Return the number of contiguous non-empty subarrays such that the maximum array element in
 * that subarray is in the range [left, right].
 */
class SubArraysWithBoundedMaximumK {

    fun numSubarrayBoundedMax(nums: IntArray, left: Int, right: Int): Int {
        var count = 0
        var tempCount = 0
        var start = 0

        for (end in nums.indices) {
            if (nums[end] > right) {
                tempCount = 0
                start = end + 1
            } else if (nums[end] >= left) {
                tempCount = end - start + 1
                count += tempCount
            } else {
                count += tempCount
            }
        }

        return count
    }
}

