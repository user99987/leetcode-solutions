package popular

/**
 * Medium
 * Kth Largest Element in an Array
 */
class KthLargestElementInAnArrayK {

    fun findKthLargest(nums: IntArray, k: Int): Int {
        var left = 0
        var right = nums.size - 1
        val targetIndex = nums.size - k

        while (left <= right) {
            val pivotIndex = partition(nums, left, right)
            if (pivotIndex == targetIndex) {
                return nums[pivotIndex]
            }
            if (pivotIndex < targetIndex) {
                left = pivotIndex + 1
            } else {
                right = pivotIndex - 1
            }
        }
        return -1
    }

    private fun partition(nums: IntArray, left: Int, right: Int): Int {
        val pivot = nums[right]
        var storeIndex = left

        for (i in left until right) {
            if (nums[i] <= pivot) {
                swap(nums, storeIndex++, i)
            }
        }
        swap(nums, storeIndex, right)
        return storeIndex
    }

    private fun swap(nums: IntArray, first: Int, second: Int) {
        val temp = nums[first]
        nums[first] = nums[second]
        nums[second] = temp
    }
}

