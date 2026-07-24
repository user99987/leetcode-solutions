package dynamicprogramming

/**
 * Hard
 *
 * You have a keyboard layout as shown above in the X-Y plane, where each English uppercase letter is located at some coordinate.
 *
 * For example, the letter 'A' is located at coordinate (0, 0), the letter 'B' is located at coordinate (0, 1), the letter 'P' is located at coordinate (2, 3) and the letter 'Z' is located at coordinate (4, 1).
 * Given the string word, return the minimum total distance to type such string using only two fingers.
 *
 * The distance between coordinates (x1, y1) and (x2, y2) is |x1 - x2| + |y1 - y2|.
 *
 * Note that the initial positions of your two fingers are considered free so do not count towards your total distance, also your two fingers do not have to start at the first letter or the first two letters.
 *
 * Example 1:
 *
 * Input: word = "CAKE"
 *
 * Output: 3
 *
 * Explanation: Using two fingers, one optimal way to type "CAKE" is:
 *
 * Finger 1 on letter 'C' -> cost = 0
 *
 * Finger 1 on letter 'A' -> cost = Distance from letter 'C' to letter 'A' = 2
 *
 * Finger 2 on letter 'K' -> cost = 0
 *
 * Finger 2 on letter 'E' -> cost = Distance from letter 'K' to letter 'E' = 1
 *
 * Total distance = 3
 *
 * Example 2:
 *
 * Input: word = "HAPPY"
 *
 * Output: 6
 *
 * Explanation: Using two fingers, one optimal way to type "HAPPY" is:
 *
 * Finger 1 on letter 'H' -> cost = 0
 *
 * Finger 1 on letter 'A' -> cost = Distance from letter 'H' to letter 'A' = 2
 *
 * Finger 2 on letter 'P' -> cost = 0
 *
 * Finger 2 on letter 'P' -> cost = Distance from letter 'P' to letter 'P' = 0
 *
 * Finger 1 on letter 'Y' -> cost = Distance from letter 'A' to letter 'Y' = 4
 *
 * Total distance = 6
 *
 * Constraints:
 *
 * 2 <= word.length <= 300
 * word consists of uppercase English letters.
 */
class MinimumDistanceToTypeAWordUsingTwoFingersK {

    private lateinit var word: String
    private lateinit var dp: Array<Array<Array<Int?>>>

    fun minimumDistance(word: String): Int {
        this.word = word
        dp = Array(27) { Array(27) { arrayOfNulls<Int>(word.length) } }
        return calculateDistance(null, null, 0)
    }

    private fun calculateDistance(f1: Char?, f2: Char?, index: Int): Int {
        if (index == word.length) {
            return 0
        }

        val f1Index = if (f1 == null) 0 else f1 - 'A' + 1
        val f2Index = if (f2 == null) 0 else f2 - 'A' + 1

        dp[f1Index][f2Index][index]?.let { return it }

        val currentChar = word[index]
        var moveCost = getDistance(f1, currentChar) + calculateDistance(currentChar, f2, index + 1)
        moveCost = minOf(moveCost, getDistance(f2, currentChar) + calculateDistance(f1, currentChar, index + 1))

        dp[f1Index][f2Index][index] = moveCost
        return moveCost
    }

    private fun getDistance(c1: Char?, c2: Char): Int {
        if (c1 == null) {
            return 0
        }
        val x1 = (c1 - 'A') % 6
        val y1 = (c1 - 'A') / 6
        val x2 = (c2 - 'A') % 6
        val y2 = (c2 - 'A') / 6
        return Math.abs(x1 - x2) + Math.abs(y1 - y2)
    }
}

