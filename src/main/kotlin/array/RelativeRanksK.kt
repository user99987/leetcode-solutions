package array

/**
 * Easy
 *
 * Return an array answer of size n where answer[i] is the rank of the ith athlete based on
 * score.
 */
class RelativeRanksK {

    fun findRelativeRanks(score: IntArray): Array<String> {
        val n = score.size
        val sortedScore = score.copyOf()
        sortedScore.sort()

        val rankMap = HashMap<Int, String>()
        for (i in 0 until n) {
            val rank = n - i
            rankMap[sortedScore[i]] = when (rank) {
                1 -> "Gold Medal"
                2 -> "Silver Medal"
                3 -> "Bronze Medal"
                else -> rank.toString()
            }
        }

        return Array(n) { rankMap[score[it]]!! }
    }
}

