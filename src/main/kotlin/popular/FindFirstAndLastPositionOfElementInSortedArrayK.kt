package popular

/**
 * Medium
 * Find First and Last Position of Element in Sorted Array
 */
class FindFirstAndLastPositionOfElementInSortedArrayK {

    fun searchRange(nums: IntArray, target: Int): IntArray {
        return intArrayOf(findBound(nums, target, true), findBound(nums, target, false))
    }

    private fun findBound(nums: IntArray, target: Int, isFirst: Boolean): Int {
        var left = 0
        var right = nums.size - 1
        var bound = -1
        while (left <= right) {
            val mid = left + (right - left) / 2
            if (nums[mid] == target) {
                bound = mid
                if (isFirst) {
                    right = mid - 1
                } else {
                    left = mid + 1
                }
            } else if (target < nums[mid]) {
                right = mid - 1
            } else {
                left = mid + 1
            }
        }
        return bound
    }
}

