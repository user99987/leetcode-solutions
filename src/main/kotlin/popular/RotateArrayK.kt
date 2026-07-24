package popular

/**
 * Medium
 * Rotate Array
 */
class RotateArrayK {

    private fun reverse(nums: IntArray, lStart: Int, rStart: Int) {
        var l = lStart
        var r = rStart
        while (l < r) {
            val temp = nums[l]
            nums[l++] = nums[r]
            nums[r--] = temp
        }
    }

    fun rotate(nums: IntArray, kInput: Int) {
        val n = nums.size
        val k = kInput % n
        reverse(nums, 0, n - k - 1)
        reverse(nums, n - k, n - 1)
        reverse(nums, 0, n - 1)
    }
}

