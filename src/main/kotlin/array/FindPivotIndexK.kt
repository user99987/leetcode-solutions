package array

/**
 * Easy
 *
 * Return the leftmost pivot index where the sum to the left equals the sum to the right. If no
 * such index exists, return -1.
 */
class FindPivotIndexK {

    fun pivotIndex(nums: IntArray?): Int {
        if (nums == null || nums.isEmpty()) return -1

        var totalSum = 0
        for (num in nums) totalSum += num

        var leftSum = 0
        for (i in nums.indices) {
            if (leftSum == totalSum - leftSum - nums[i]) return i
            leftSum += nums[i]
        }

        return -1
    }
}

