package popular

/**
 * Medium
 * SubsetsK
 */
class SubsetsK {

    fun subsets(nums: IntArray): List<List<Int>> {
        val result = ArrayList<List<Int>>()
        result.add(ArrayList())

        for (num in nums) {
            val newSubsets = ArrayList<List<Int>>()
            for (subset in result) {
                val newSubset = ArrayList(subset)
                newSubset.add(num)
                newSubsets.add(newSubset)
            }
            result.addAll(newSubsets)
        }
        return result
    }
}

