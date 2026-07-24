package popular

/**
 * Easy
 * Climbing Stairs
 */
class ClimbingStairsK {

    fun climbStairs(n: Int): Int {
        if (n <= 2) return n
        var prev1 = 1
        var prev2 = 2
        for (i in 3..n) {
            val curr = prev1 + prev2
            prev1 = prev2
            prev2 = curr
        }
        return prev2
    }
}

