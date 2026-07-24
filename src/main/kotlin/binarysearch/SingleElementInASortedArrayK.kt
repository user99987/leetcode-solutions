package binarysearch

/**
 * Medium
 *
 * You are given a sorted array where every element appears exactly twice, except for one element
 * which appears exactly once. Return the single element in O(log n) time and O(1) space.
 */
class SingleElementInASortedArrayK {

    fun singleNonDuplicate(nums: IntArray): Int {
        var left = 0
        var right = nums.size - 1
        while (left < right) {
            var mid = left + (right - left) / 2
            if (mid % 2 == 1) mid-- // Ensure mid is even
            if (nums[mid] == nums[mid + 1]) {
                left = mid + 2
            } else {
                right = mid
            }
        }
        return nums[left]
    }
}

