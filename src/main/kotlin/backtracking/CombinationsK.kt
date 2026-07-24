package backtracking

/**
 * Medium
 *
 * Given two integers n and k, return all possible combinations of k numbers out of the range
 * [1, n].
 */
class CombinationsK {

    fun combine(n: Int, k: Int): List<List<Int>> {
        val result = ArrayList<List<Int>>()
        backtrack(1, n, k, ArrayList(), result)
        return result
    }

    private fun backtrack(
        start: Int,
        n: Int,
        k: Int,
        current: MutableList<Int>,
        result: MutableList<List<Int>>,
    ) {
        if (k == 0) {
            result.add(ArrayList(current))
            return
        }
        for (i in start..n) {
            current.add(i)
            backtrack(i + 1, n, k - 1, current, result)
            current.removeAt(current.size - 1)
        }
    }
}

