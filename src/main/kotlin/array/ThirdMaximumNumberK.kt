package array

/**
 * Easy
 *
 * Return the third distinct maximum number in this array. If the third maximum does not exist,
 * return the maximum number.
 */
class ThirdMaximumNumberK {

    fun thirdMax(nums: IntArray): Int {
        var max1 = Long.MIN_VALUE
        var max2 = Long.MIN_VALUE
        var max3 = Long.MIN_VALUE

        for (num in nums) {
            if (num > max1) {
                max3 = max2
                max2 = max1
                max1 = num.toLong()
            } else if (num > max2 && num < max1) {
                max3 = max2
                max2 = num.toLong()
            } else if (num > max3 && num < max2) {
                max3 = num.toLong()
            }
        }

        return if (max3 == Long.MIN_VALUE) max1.toInt() else max3.toInt()
    }
}

