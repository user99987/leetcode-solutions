package popular

/**
 * Medium
 * House Robber
 */
class HouseRobberK {

    fun rob(nums: IntArray): Int {
        var prevTwo = 0
        var prevOne = 0

        for (amount in nums) {
            val current = maxOf(prevOne, prevTwo + amount)
            prevTwo = prevOne
            prevOne = current
        }
        return prevOne
    }
}

