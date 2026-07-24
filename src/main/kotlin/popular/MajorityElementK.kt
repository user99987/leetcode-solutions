package popular

/**
 * Easy
 * Majority Element
 */
class MajorityElementK {

    fun majorityElement(nums: IntArray): Int {
        var majority = nums[0]
        var count = 0
        for (num in nums) {
            if (count == 0) majority = num
            count += if (num == majority) 1 else -1
        }
        return majority
    }
}

