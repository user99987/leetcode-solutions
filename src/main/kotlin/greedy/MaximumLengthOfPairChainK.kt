package greedy

/**
 * Medium
 *
 * Return the length of the longest chain which can be formed from the given pairs.
 */
class MaximumLengthOfPairChainK {

    fun findLongestChain(pairs: Array<IntArray>): Int {
        pairs.sortBy { it[1] }
        var count = 0
        var end = Int.MIN_VALUE

        for (pair in pairs) {
            if (pair[0] > end) {
                count++
                end = pair[1]
            }
        }
        return count
    }
}

