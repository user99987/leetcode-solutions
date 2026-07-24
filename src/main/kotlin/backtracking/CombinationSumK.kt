package backtracking

/**
 * Medium
 *
 * Return a list of all unique combinations of candidates where the chosen numbers sum to
 * target, with unlimited reuse of each candidate.
 */
class CombinationSumK {

    fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
        val result = ArrayList<List<Int>>()
        candidates.sort()
        backtrack(candidates, target, 0, ArrayList(), result)
        return result
    }

    private fun backtrack(
        candidates: IntArray,
        target: Int,
        start: Int,
        combination: MutableList<Int>,
        result: MutableList<List<Int>>,
    ) {
        if (target == 0) {
            result.add(ArrayList(combination))
            return
        }
        var i = start
        while (i < candidates.size && candidates[i] <= target) {
            combination.add(candidates[i])
            backtrack(candidates, target - candidates[i], i, combination, result)
            combination.removeAt(combination.size - 1)
            i++
        }
    }
}

