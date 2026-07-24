package popular

/**
 * Medium
 * Sort Colors
 */
class SortColorsK {

    fun sortColors(nums: IntArray) {
        val count = IntArray(3)
        for (num in nums) count[num]++
        var index = 0
        for (i in 0 until 3) {
            for (j in index until index + count[i]) nums[j] = i
            index += count[i]
        }
    }
}

