package popular

/**
 * Hard
 * First Missing Positive
 */
class FirstMissingPositiveK {

    fun firstMissingPositive(nums: IntArray): Int {
        val n = nums.size
        for (i in 0 until n) {
            while (nums[i] > 0 && nums[i] <= n && nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1)
            }
        }
        for (i in 0 until n) {
            if (nums[i] != i + 1) {
                return i + 1
            }
        }
        return n + 1
    }

    private fun swap(nums: IntArray, i: Int, j: Int) {
        val temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
    }
}

