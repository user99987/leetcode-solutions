package backtracking

/**
 * Medium
 *
 * Find all unique combinations in candidates (each used at most once) where the numbers sum to
 * target, without duplicate combinations in the result.
 */
class CombinationSumIIK {

    fun combinationSum2(candidates: IntArray, target: Int): List<List<Int>> {
        val result = ArrayList<List<Int>>()
        candidates.sort()
        backtrack(candidates, target, 0, result, ArrayDeque())
        return result
    }

    private fun backtrack(
        candidates: IntArray,
        target: Int,
        start: Int,
        result: MutableList<List<Int>>,
        combination: ArrayDeque<Int>,
    ) {
        if (target == 0) {
            result.add(ArrayList(combination))
            return
        }
        var i = start
        while (i < candidates.size && candidates[i] <= target) {
            if (i > start && candidates[i] == candidates[i - 1]) {
                i++
                continue
            }
            combination.addLast(candidates[i])
            backtrack(candidates, target - candidates[i], i + 1, result, combination)
            combination.removeLast()
            i++
        }
    }
}

