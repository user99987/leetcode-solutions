package popular

/**
 * Medium
 * Jump Game
 */
class JumpGameK {

    fun canJump(nums: IntArray): Boolean {
        var reachable = 0
        for (i in nums.indices) {
            if (i > reachable) return false
            reachable = maxOf(reachable, i + nums[i])
        }
        return true
    }
}

