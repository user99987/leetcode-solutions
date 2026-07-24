package popular

/**
 * Easy
 * Two Sum
 */
class TwoSumK {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()
        for (i in nums.indices) {
            map[target - nums[i]]?.let { return intArrayOf(it, i) }
            map[nums[i]] = i
        }
        return IntArray(0)
    }
}

